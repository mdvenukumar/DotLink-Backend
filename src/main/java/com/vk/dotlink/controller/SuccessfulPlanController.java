package com.vk.dotlink.controller;

import com.vk.dotlink.service.SuccessfulPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/plans")
public class SuccessfulPlanController {

    @Autowired
    private SuccessfulPlanService service;

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/add")
    public String addPlan(@RequestBody PlanRequest request) {
        LocalDate today = LocalDate.now();
        service.addSuccessfulPlan(request.getPhonenumber(), today, request.getValidity(), request.getBroughtFrom());
        return "Plan added successfully!";
    }

    // Define a nested static class to handle the request payload
    public static class PlanRequest {
        private String phonenumber;
        private String broughtFrom;
        private int validity;

        // Getters and setters
        public String getPhonenumber() {
            return phonenumber;
        }

        public void setPhonenumber(String phonenumber) {
            this.phonenumber = phonenumber;
        }

        public String getBroughtFrom() {
            return broughtFrom;
        }

        public void setBroughtFrom(String broughtFrom) {
            this.broughtFrom = broughtFrom;
        }

        public int getValidity() {
            return validity;
        }

        public void setValidity(int validity) {
            this.validity = validity;
        }
    }
}
