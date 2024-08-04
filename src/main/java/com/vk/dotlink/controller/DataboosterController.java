package com.vk.dotlink.controller;

import com.vk.dotlink.entity.Databooster;
import com.vk.dotlink.service.DataboosterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DataboosterController {

    @Autowired
    private DataboosterService databoosterService;
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getdatabooster")
    public List<Databooster> getDatabooster() {
        return databoosterService.getAllDatabooster();
    }
}