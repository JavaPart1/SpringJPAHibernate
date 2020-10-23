package eu.noelvaes.housekeeping;

import eu.noelvaes.housekeeping.services.*;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@Configuration
@ComponentScan
@EnableGlobalMethodSecurity(securedEnabled = true)
public class HousApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx =
                new AnnotationConfigApplicationContext(HousApp.class);
//        CleaningService jill = ctx.getBean("jill",CleaningService.class);
//        CleaningService bob = ctx.getBean("bob",CleaningService.class);
//        CleaningService scott = ctx.getBean("scott",CleaningService.class);
//        GardeningService scotty = ctx.getBean("scotty",GardeningService.class);
        DomesticService service =
                ctx.getBean("domesticService",DomesticService.class);

//        CleaningTool broom = new Broom();
//        CleaningTool vacuum = new VacuumCleaner();

//        CleaningServiceImpl jill = new CleaningServiceImpl();
//        jill.setCleaningTool(broom);
//        CleaningServiceImpl bob = new CleaningServiceImpl();
//        bob.setCleaningTool(vacuum);

//        jill.clean();
//        bob.clean();
//        scott.clean();
//        scott.clean();
//        scotty.garden();
        service.runHouseHold();

        ctx.close();
    }
}
