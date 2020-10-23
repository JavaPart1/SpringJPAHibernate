package eu.noelvaes.beersoft.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "brewer")
public class Brewer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int brewerId;
    private String brewerName;
    private String address;
    private String zipCode;
    private String city;
    private int turnover;

    @OneToMany(mappedBy = "brewer")
    private List<Beer> beers = new ArrayList<>();

    public Brewer() {
    }

    public Brewer(String brewerName, String address, String zipCode, String city, int turnover) {
        this.brewerName = brewerName;
        this.address = address;
        this.zipCode = zipCode;
        this.city = city;
        this.turnover = turnover;
    }

    public int getBrewerId() {
        return brewerId;
    }

    public String getBrewerName() {
        return brewerName;
    }

    public void setBrewerName(String brewerName) {
        this.brewerName = brewerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getTurnover() {
        return turnover;
    }

    public void setTurnover(int turnover) {
        this.turnover = turnover;
    }

    public List<Beer> getBeers() {
        return beers;
    }

    public void setBeers(List<Beer> beers) {
        this.beers = beers;
    }

    @Override
    public String toString() {
        return "Brewer{" +
                "brewerId=" + brewerId +
                ", brewerName='" + brewerName + '\'' +
                ", address='" + address + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", city='" + city + '\'' +
                ", turnover=" + turnover +
                '}';
    }

}
