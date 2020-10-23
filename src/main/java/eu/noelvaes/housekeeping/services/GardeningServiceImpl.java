package eu.noelvaes.housekeeping.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class GardeningServiceImpl implements GardeningService{
    @Autowired
    private GardeningTool tool;

//    public void setGardeningTool(GardeningTool tool) {
//        this.tool = tool;
//    }

    @PostConstruct
    public void init(){
        System.out.println("Initialising bean GardeningServiceImpl...");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Cleaning up bean GardeningServiceImpl..");
    }

    @Override
    //@Secured({"ROLE_ADULT"}) werkt niet !!!
    public void garden() {
        System.out.println("Working in the garden");
        tool.doGardenJob();
    }
}
