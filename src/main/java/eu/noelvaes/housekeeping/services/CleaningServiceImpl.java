package eu.noelvaes.housekeeping.services;

public class CleaningServiceImpl implements CleaningService{
    private CleaningTool cleaningTool;

    public void setCleaningTool(CleaningTool cleaningTool) {
        this.cleaningTool = cleaningTool;
    }

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
