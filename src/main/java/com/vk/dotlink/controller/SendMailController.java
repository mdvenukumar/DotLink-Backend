package com.vk.dotlink.controller;

import com.vk.dotlink.service.SendMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SendMailController {

    @Autowired
    private SendMailService sendMailService;

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/sendMail")
    public ResponseEntity<String> sendMail(
            @RequestParam String toEmail,
            @RequestParam(required = false) String subject,
            @RequestParam(required = false) String message) {

        // Optional: Add validation logic if needed
        if (toEmail == null || toEmail.isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("To email is required.");
        }
        subject = "Recharged Successfully";
        message = "Thanks for using DotLink. Your plan is added and will be initiated in following hours.";
        // You might want to handle subject and message here if they are used
        sendMailService.sendEmail(toEmail, subject, message);

        return ResponseEntity.ok("Email sent successfully!");
    }
}
