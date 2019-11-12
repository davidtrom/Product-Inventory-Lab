package models;

public class Sneaker {
    private Integer id;
    private String name;
    private String sport;
    private Double size;
    private Integer qty;
    private Double price;

    public Sneaker(Integer id, String name, String sport, Double size, Integer qty, Double price) {
        this.id = id;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
