package eu.noelvaes.beersoft.repository;

import eu.noelvaes.beersoft.domain.Beer;

import javax.persistence.*;
import java.util.List;

public class BeerRepo implements BeerRepository{
    @Override
    public List<Beer> getBeers() {
        EntityManagerFactory emf = null;
        EntityManager em = null;

            emf = Persistence.createEntityManagerFactory("mysqlcontainer");
            em = emf.createEntityManager();
            EntityTransaction tx =em.getTransaction();
            TypedQuery<Beer> query = em.createNamedQuery("getAllBeers", Beer.class);

            tx.begin();
            List<Beer> beers = query.getResultList();
            tx.commit();
            if (em != null) em.close();
            if (emf != null) emf.close();
            return beers;
    }
}
