package com.vk.dotlink.service;


import com.vk.dotlink.entity.SuccessfulPlan;
import com.vk.dotlink.repository.SuccessfulPlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class SuccessfulPlanService {

    @Autowired
    private SuccessfulPlanRepository repository;

    public SuccessfulPlan addSuccessfulPlan(String phonenumber, LocalDate planBroughtOn, int validityDays, String broughtFrom) {
        LocalDate expiryDate = planBroughtOn.plusDays(validityDays).minusDays(1); // Correct expiry date calculation
        SuccessfulPlan plan = new SuccessfulPlan();
        plan.setPhonenumber(phonenumber);
        plan.setPlanBroughtOn(planBroughtOn);
        plan.setExpiryDate(expiryDate);
        plan.setBroughtFrom(broughtFrom);
        return repository.save(plan);
    }
}

