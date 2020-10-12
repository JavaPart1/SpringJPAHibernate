package eu.noelvaes.housekeeping.services;

public class GardeningServiceImpl implements GardeningService{
    private GardeningTool tool;

    public void setGardeningTool(GardeningTool tool) {
        this.tool = tool;
    }

    @Override
    public void garden() {
        System.out.println("Working in the garden");
        tool.doGardenJob();
    }
}
