package com.vk.dotlink.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usertable")
public class User {

    @Id
    private String phno; // Phone number is the primary key

    private String status;
    private String email;

    // Getters and Setters
    public String getPhno() {
        return phno;
    }
    public void setPhno(String phno) {
        this.phno = phno;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
