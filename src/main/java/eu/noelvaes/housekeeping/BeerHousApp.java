package eu.noelvaes.housekeeping;

import eu.noelvaes.beersoft.BeerApp;
import eu.noelvaes.beersoft.domain.Beer;
import eu.noelvaes.beersoft.repository.BeerRepo;
import eu.noelvaes.beersoft.repository.BeerRepository;
import eu.noelvaes.housekeeping.services.DomesticService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.List;

@Configuration
@ComponentScan
@EnableGlobalMethodSecurity(securedEnabled = true)
public class BeerHousApp {
    public static void main(String[] args) {
        String pgmName = "--------- " + BeerHousApp.class.getSimpleName();

        System.out.println(" ");
        System.out.println(pgmName + "  _____________________");
        System.out.println(pgmName + " - Security Check");
        SecurityContext sc = SecurityContextHolder.getContext();
        Authentication auth = new
                UsernamePasswordAuthenticationToken("homer", "simpson");
        sc.setAuthentication(auth);

        System.out.println(" ");
        System.out.println(pgmName + "  _____________________");
        System.out.println(pgmName + " - Create container");
        ConfigurableApplicationContext ctx =
                new AnnotationConfigApplicationContext(BeerHousApp.class);
        DomesticService service =
                ctx.getBean("domesticService",DomesticService.class);

        System.out.println(" ");
        System.out.println(pgmName + "  _____________________");
        System.out.println(pgmName + " - Run HouseHold");
        service.runHouseHold();
        ctx.close();

        try {
            System.out.println(" ");
            System.out.println(pgmName + "  _____________________");
            System.out.println(pgmName + " - Start database txn");
            BeerRepository bRepo = new BeerRepo();
            List<Beer> beers = bRepo.getBeers();
            System.out.println(" ");
            System.out.println(pgmName + "  _____________________");
            for (Beer b: beers) {
                System.out.println(b.toString());
            }
            System.out.println(pgmName + "  _____________________");
            System.out.println(pgmName + " - End of program");
        } finally {
            //do nothing
        }

    }
}
