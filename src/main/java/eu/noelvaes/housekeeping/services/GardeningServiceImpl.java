package eu.noelvaes.housekeeping.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GardeningServiceImpl implements GardeningService{
    @Autowired
    private GardeningTool tool;

//    public void setGardeningTool(GardeningTool tool) {
//        this.tool = tool;
//    }

    @Override
    public void garden() {
        System.out.println("Working in the garden");
        tool.doGardenJob();
    }
}
