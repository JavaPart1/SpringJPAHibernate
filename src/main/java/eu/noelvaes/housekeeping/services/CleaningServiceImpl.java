package eu.noelvaes.housekeeping.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CleaningServiceImpl implements CleaningService{
    @Autowired
    private CleaningTool cleaningTool;

//    public void setCleaningTool(CleaningTool cleaningTool) {
//        this.cleaningTool = cleaningTool;
//    }
//
    public void init(){
        System.out.println("Initialising bean CleaningServiceImpl...");
    }

    public void destroy(){
        System.out.println("cleaning up bean CleaningServiceImpl..");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the house");
        cleaningTool.doCleanJob();
    }
}
