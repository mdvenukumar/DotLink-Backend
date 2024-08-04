package com.vk.dotlink.controller;

import com.vk.dotlink.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/validatePhoneNumber")
    public ResponseEntity<String> validatePhoneNumber(@RequestParam String phoneNumber) {
        boolean isValid = userService.isPhoneNumberValid(phoneNumber);
        if (isValid) {
            return ResponseEntity.ok("redirect:/dashboard"); // Redirect to dashboard URL
        } else {
            return ResponseEntity.status(404).body("User not found or inactive");
        }
    }
}
