package eu.noelvaes.housekeeping.services;

import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Component;

@Component
@Primary
@Order(3)
public class Broom implements CleaningTool{
    public void doCleanJob() {
        System.out.println("Brooooooooooooo");
    }
}
