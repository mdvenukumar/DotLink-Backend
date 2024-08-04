package com.vk.dotlink.repository;

import com.vk.dotlink.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    User findByPhno(String phno);
}
