package com.vk.dotlink.controller;

import com.vk.dotlink.entity.True5g;
import com.vk.dotlink.service.True5gService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class True5gController {

    @Autowired
    private True5gService true5gService;
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/gettrue5g")
    public List<True5g> getTrue5g() {
        return true5gService.getAllTrue5g();
    }
}