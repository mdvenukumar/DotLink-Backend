package com.vk.dotlink.service;

import com.vk.dotlink.entity.Mail;
import com.vk.dotlink.repository.MailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    @Autowired
    private MailRepository mailRepository;

    public String getEmailByPhoneNumber(String phno) { // Updated parameter name
        Mail mail = mailRepository.findByPhno(phno); // Updated method call
        return mail != null ? mail.getEmail() : null;
    }
}
