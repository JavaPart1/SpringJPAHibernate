package eu.noelvaes.beersoft.repository;

import eu.noelvaes.beersoft.domain.Beer;

import java.util.List;

public interface BeerRepository {
    public List<Beer> getBeers();
}
