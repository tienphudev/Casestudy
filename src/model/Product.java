package model;

import java.io.Serializable;

public class Product implements Serializable {
    private String name;
    private int id;
    private int cost;

    public Product(String name, int id, int cost) {
        this.name = name;
        this.id = id;
        this.cost = cost;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", cost=" + cost +
                '}';
    }
}
