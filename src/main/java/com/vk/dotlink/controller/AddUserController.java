package com.vk.dotlink.controller;

import com.vk.dotlink.entity.AddUser;
import com.vk.dotlink.repository.AddUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addusers")
public class AddUserController {

    @Autowired
    private AddUserRepository addUserRepository;
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping
    public AddUser createUser(@RequestBody AddUser user) {
        if (user.getStatus() == null) {
            user.setStatus("active");
        }
        return addUserRepository.save(user);
    }
}