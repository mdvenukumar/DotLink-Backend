package com.vk.dotlink.controller;

import com.vk.dotlink.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MailController {

    @Autowired
    private MailService mailService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getEmail")
    public ResponseEntity<Map<String, String>> getEmailByPhoneNumber(@RequestParam String phno) { // Updated parameter name
        String email = mailService.getEmailByPhoneNumber(phno); // Updated method call
        Map<String, String> response = new HashMap<>();
        response.put("email", email);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
