package com.vk.dotlink.repository;

import com.vk.dotlink.entity.Value;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ValueRepository extends JpaRepository<Value, Long> {
}