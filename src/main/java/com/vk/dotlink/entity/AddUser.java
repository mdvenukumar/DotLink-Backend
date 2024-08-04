package com.vk.dotlink.entity;

import jakarta.persistence.*;

@Entity
@Table(name="usertable")
public class AddUser {



    @Id
    private String phno;
    private String email;
    private String status = "active";

    // Getters and Setters


    public String getPhno() {
        return phno;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}