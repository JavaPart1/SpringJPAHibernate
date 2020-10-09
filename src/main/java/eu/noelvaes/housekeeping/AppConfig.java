package eu.noelvaes.housekeeping;

import eu.noelvaes.housekeeping.services.*;
import org.springframework.context.annotation.*;

@Configuration
public class AppConfig {
    @Bean
    public CleaningTool broom(){
        return new Broom();
    }
    @Bean
    public CleaningTool vacuum(){return new VacuumCleaner();
    }
    @Bean
    public CleaningService jill(){
        CleaningServiceImpl cs = new CleaningServiceImpl();
        cs.setCleaningTool(broom());
        return cs;
    }
    @Bean
    public CleaningService bob(){
        CleaningServiceImpl cs = new CleaningServiceImpl();
        cs.setCleaningTool(vacuum());
        return cs;
    }
    @Bean
    @Scope(value = "prototype", proxyMode = ScopedProxyMode.INTERFACES)
    @Lazy
    public CleaningTool duster(){
        return new DisposableDuster();
    }
    @Bean
    public CleaningService scott(){
        CleaningServiceImpl cs = new CleaningServiceImpl();
        cs.setCleaningTool(duster());
        return cs;
    }
}
