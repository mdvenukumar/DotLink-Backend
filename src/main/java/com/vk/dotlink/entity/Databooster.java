package com.vk.dotlink.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "databooster")
public class Databooster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String price;
    private String validity;
    private String datapack;
    private String subscription;

    // Getters and setters
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public String getValidity() {
        return validity;
    }
    public void setValidity(String validity) {
        this.validity = validity;
    }
    public String getData() {
        return datapack;
    }
    public void setData(String data) {
        this.datapack = data;
    }
    public String getSubscription() {
        return subscription;
    }
    public void setSubscription(String subscription) {
        this.subscription = subscription;
    }
}