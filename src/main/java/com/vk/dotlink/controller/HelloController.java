package com.vk.dotlink.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {

    @GetMapping("/")
    public String helloWorld() {
        return "<html>" +
                "<body>" +
                "<h1>Welcome to the API!</h1>" +
                "<p>Here are the available endpoints:</p>" +
                "<ul>" +
                "<li><a href=\"/gettrue5g\">/gettrue5g</a> - Fetch True 5G information</li>" +
                "<li><a href=\"/getdatabooster\">/getdatabooster</a> - Fetch data booster information</li>" +
                "<li><a href=\"/getpopular\">/getpopular</a> - Fetch popular items</li>" +
                "<li><a href=\"/getvalue\">/getvalue</a> - Fetch value information</li>" +
                "<li><a href=\"/getannual\">/getannual</a> - Fetch annual data</li>" +
                "<li><a href=\"/validatePhoneNumber\">/validatePhoneNumber</a> - Checks the phone number in the database (http://localhost:8080/validatePhoneNumber?phoneNumber=7382254266)</li>"+
                "</ul>" +
                "<p>Use these endpoints to interact with our API.</p>" +
                "</body>" +
                "</html>";
    }
}
