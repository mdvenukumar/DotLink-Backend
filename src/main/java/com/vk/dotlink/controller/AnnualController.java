package com.vk.dotlink.controller;

import com.vk.dotlink.entity.Annual;
import com.vk.dotlink.service.AnnualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import java.util.List;

@RestController
public class AnnualController {

    @Autowired
    private AnnualService annualService;
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getannual")
    public List<Annual> getAnnual() {
        return annualService.getAllAnnual();
    }
}