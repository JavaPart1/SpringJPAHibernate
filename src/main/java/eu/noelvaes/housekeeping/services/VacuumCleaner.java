package eu.noelvaes.housekeeping.services;

import org.springframework.stereotype.Component;

@Component
public class VacuumCleaner implements CleaningTool{
    public void doCleanJob() {
        System.out.println("Zuuuuuuuuuuuuuuuuu");
    }
}
