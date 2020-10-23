package eu.noelvaes.beersoft;

import eu.noelvaes.beersoft.domain.Beer;
import eu.noelvaes.beersoft.repository.BeerRepo;
import eu.noelvaes.beersoft.repository.BeerRepository;
import eu.noelvaes.housekeeping.AppConfig;
import eu.noelvaes.housekeeping.HousApp;
import eu.noelvaes.housekeeping.services.DomesticService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

import javax.persistence.*;
import java.util.List;

@Configuration
@ComponentScan
@EnableGlobalMethodSecurity(securedEnabled = true)public class BeerApp {
    public static void main(String[] args) {
        String pgmName = BeerApp.class.getSimpleName();
        ConfigurableApplicationContext ctx =
                new AnnotationConfigApplicationContext(BeerApp.class);

        try {
            System.out.println(pgmName + " - Start txn");
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
