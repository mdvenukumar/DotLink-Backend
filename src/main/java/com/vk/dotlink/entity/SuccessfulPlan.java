package com.vk.dotlink.entity;



import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="successful_plans")
public class SuccessfulPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String phonenumber;
    private LocalDate planBroughtOn;
    private LocalDate expiryDate;
    private String broughtFrom;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public LocalDate getPlanBroughtOn() {
        return planBroughtOn;
    }

    public void setPlanBroughtOn(LocalDate planBroughtOn) {
        this.planBroughtOn = planBroughtOn;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getBroughtFrom() {
        return broughtFrom;
    }

    public void setBroughtFrom(String broughtFrom) {
        this.broughtFrom = broughtFrom;
    }
}
