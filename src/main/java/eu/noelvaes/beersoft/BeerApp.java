package eu.noelvaes.beersoft;

import eu.noelvaes.beersoft.domain.Beer;
import eu.noelvaes.housekeeping.AppConfig;
import eu.noelvaes.housekeeping.services.DomesticService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.persistence.*;
import java.util.List;

public class BeerApp {
    public static void main(String[] args) {
        String pgmName = BeerApp.class.getSimpleName();
        EntityManagerFactory emf = null;
        EntityManager em = null;

        try {
            emf = Persistence.createEntityManagerFactory("mysqlcontainer");
            em = emf.createEntityManager();
            EntityTransaction tx =em.getTransaction();
            TypedQuery<Beer> query = em.createNamedQuery("getAllBeers", Beer.class);

            System.out.println(pgmName + " - Start txn");
            tx.begin();
            List<Beer> beers = query.getResultList();
            tx.commit();
            System.out.println(pgmName + " - Commit txn");
            for (Beer b: beers) {
                System.out.println(b.toString());
            }
            System.out.println(pgmName + " - End of program");
        } finally {
            if (em != null) em.close();
            if (emf != null) emf.close();
        }
    }
}
