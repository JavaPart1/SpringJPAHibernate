package eu.noelvaes.housekeeping.services;

public class LawnMower implements GardeningTool{

    @Override
    public void doGardenJob() {
        System.out.println("Mowing the lawn");
    }
}
