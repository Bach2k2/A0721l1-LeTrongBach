package com.example.practice.model;

import javax.persistence.*;

@Entity
@Table(name = "smartphones")
public class Smartphone {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String model;
    private String producer;
    private double price;

    public Smartphone() {
    }

    public Smartphone(Long id, String model, String producer, double price) {
        this.id = id;
        this.model = model;
        this.producer = producer;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return producer + ", " + model + " with price: " + price;

    }
}
