package eu.noelvaes.housekeeping.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Broom implements CleaningTool{
    public void doCleanJob() {
        System.out.println("Brooooooooooooo");
    }
}
