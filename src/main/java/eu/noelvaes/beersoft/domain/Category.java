package eu.noelvaes.beersoft.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int catId;
    private String catName;

    @OneToMany(mappedBy = "category")
    private List<Beer> beers = new ArrayList<>();

    public Category() {
    }

    public Category(String catName) {
        this.catName = catName;
    }

    public int getCatId() {
        return catId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public List<Beer> getBeers() {
        return beers;
    }

    public void setBeers(List<Beer> beers) {
        this.beers = beers;
    }

    @Override
    public String toString() {
        return "Categories{" +
                "catId=" + catId +
                ", catName='" + catName + '\'' +
                '}';
    }
}
