package com.vk.dotlink.repository;


import com.vk.dotlink.entity.AddUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddUserRepository extends JpaRepository<AddUser, Long> {
}