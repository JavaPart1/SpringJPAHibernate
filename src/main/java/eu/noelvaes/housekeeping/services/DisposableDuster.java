package eu.noelvaes.housekeeping.services;

import org.springframework.stereotype.Component;

@Component
public class DisposableDuster implements CleaningTool{
    private boolean used;

    @Override
    public void doCleanJob() {
        if (used){
            System.out.println("I'm used. Please throw me away");
        }else {
            System.out.println("clean a volonté");
            used = true;
        }

    }
}
