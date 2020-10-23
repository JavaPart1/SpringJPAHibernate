package eu.noelvaes.beersoft.domain;

import javax.persistence.*;

@NamedQuery(name = "getAllBeers",query = "select b from beers as b")
@Entity(name = "beers")
public class Beer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int beerId;
    private String beerName;
    private float price;
    private int stock;
    private float alcohol;
    private int version;
    private byte[] image;

    @ManyToOne(optional = false, cascade = CascadeType.PERSIST)
    @JoinColumn
    private Category category;

    @ManyToOne(optional = false, cascade = CascadeType.PERSIST)
    @JoinColumn
    private Brewer brewer;

    public Beer() {
    }

    public Beer(String beerName, float price, int stock, float alcohol, Category category) {
        this.beerName = beerName;
        this.price = price;
        this.stock = stock;
        this.alcohol = alcohol;
        this.category = category;
    }

    public int getBeerId() {
        return beerId;
    }

    public String getBeerName() {
        return beerName;
    }

    public void setBeerName(String beerName) {
        this.beerName = beerName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(float alcohol) {
        this.alcohol = alcohol;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Brewer getBrewer() {
        return brewer;
    }

    public void setBrewer(Brewer brewer) {
        this.brewer = brewer;
    }

    @Override
    public String toString() {
        return "Beers{" +
                "beerId=" + beerId +
                ", beerName='" + beerName + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", alcohol=" + alcohol +
                ", version=" + version +
                ", category=" + category +
                ", brewer=" + brewer +
                '}';
    }
}
