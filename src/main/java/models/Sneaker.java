package models;

public class Sneaker {
    private Integer id;
    private String brand;
    private String sport;
    private Double size;
    private Integer qty;
    private Double price;


    public Sneaker(Integer id, String brand, String sport, Double size, Integer qty, Double price) {
        this.id = id;
        this.brand = brand;
        this.sport = sport;
        this.size = size;
        this.qty = qty;
        this.price = price;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
