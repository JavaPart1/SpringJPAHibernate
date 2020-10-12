package eu.noelvaes.housekeeping.services;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class VacuumCleaner implements CleaningTool{
    public void doCleanJob() {
        System.out.println("Zuuuuuuuuuuuuuuuuu");
    }
}
