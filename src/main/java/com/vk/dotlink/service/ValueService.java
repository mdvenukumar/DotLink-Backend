package com.vk.dotlink.service;

import com.vk.dotlink.entity.Value;
import com.vk.dotlink.repository.ValueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ValueService {
    @Autowired
    private ValueRepository valueRepository;

    public List<Value> getAllValue() {
        return valueRepository.findAll();
    }
}