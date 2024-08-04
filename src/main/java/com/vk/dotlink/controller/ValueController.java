package com.vk.dotlink.controller;

import com.vk.dotlink.entity.Value;
import com.vk.dotlink.service.ValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ValueController {

    @Autowired
    private ValueService valueService;
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getvalue")
    public List<Value> getValue() {
        return valueService.getAllValue();
    }
}