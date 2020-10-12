package eu.noelvaes.housekeeping.services;

public class DomesticServiceImpl implements DomesticService{
    private CleaningService cs;
    private GardeningService gs;

    public void setCs(CleaningService cs) {
        this.cs = cs;
    }

    public void setGs(GardeningService gs) {
        this.gs = gs;
    }

    public void init(){
        System.out.println("Initialising bean DomesticServiceImpl...");
    }

    public void destroy(){
        System.out.println("cleaning up bean DomesticServiceImpl..");
    }

    @Override
    public void runHouseHold() {
        cs.clean();
        gs.garden();

    }
}
