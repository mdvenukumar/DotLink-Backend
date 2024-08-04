package com.vk.dotlink.repository;


import com.vk.dotlink.entity.Mail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MailRepository extends JpaRepository<Mail, String> {
    Mail findByPhno(String phno); // Updated method name
}
