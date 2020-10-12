package eu.noelvaes.housekeeping;

import eu.noelvaes.housekeeping.services.*;
import org.springframework.context.annotation.*;

@Configuration
public class AppConfig {
    @Bean
    @Primary
    public CleaningTool broom(){
        return new Broom();
    }
    @Bean
    public CleaningTool vacuum(){return new VacuumCleaner();
    }
    @Bean(initMethod = "init",destroyMethod = "destroy")
    public CleaningService jill(CleaningTool tool){
        CleaningServiceImpl cs = new CleaningServiceImpl();
        cs.setCleaningTool(tool);
        return cs;
    }
    @Bean(initMethod = "init",destroyMethod = "destroy")
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
    @Bean(initMethod = "init",destroyMethod = "destroy")
    public CleaningService scott(){
        CleaningServiceImpl cs = new CleaningServiceImpl();
        cs.setCleaningTool(duster());
        return cs;
    }
    @Bean
    public GardeningTool lawnmower(){
        return new LawnMower();
    }
    @Bean
    public GardeningService scotty(GardeningTool tool){
        GardeningServiceImpl gs = new GardeningServiceImpl();
        gs.setGardeningTool(tool);
        return gs;
    }
    @Bean
    public DomesticService domesticService(){
        DomesticServiceImpl domesticService = new DomesticServiceImpl();
        domesticService.setCs(scott());
        domesticService.setGs(scotty(lawnmower()));
        return domesticService;
    }
}
