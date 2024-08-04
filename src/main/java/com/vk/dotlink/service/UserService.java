package com.vk.dotlink.service;

import com.vk.dotlink.entity.User;
import com.vk.dotlink.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public boolean isPhoneNumberValid(String phoneNumber) {
        User user = userRepository.findByPhno(phoneNumber);
        return user != null && "active".equalsIgnoreCase(user.getStatus());
    }
}
