package com.vk.dotlink.controller;

import com.vk.dotlink.entity.Popular;
import com.vk.dotlink.service.PopularService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PopularController {

    @Autowired
    private PopularService popularService;
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getpopular")
    public List<Popular> getPopular() {
        return popularService.getAllPopular();
    }
}