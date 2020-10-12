package eu.noelvaes.housekeeping.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("domesticService")
public class DomesticServiceImpl implements DomesticService{
    @Autowired
    private CleaningService cs;
    @Autowired
    private GardeningService gs;

//    public void setCs(CleaningService cs) {
//        this.cs = cs;
//    }
//
//    public void setGs(GardeningService gs) {
//        this.gs = gs;
//    }
//
    public void init(){
        System.out.println("Initialising bean DomesticServiceImpl...");
    }

    public void destroy(){
        System.out.println("cleaning up bean DomesticServiceImpl..");
    }

    @Override
    public void runHouseHold() {
        this.cs.clean();
        this.gs.garden();

    }
}
