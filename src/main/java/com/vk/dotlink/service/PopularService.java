package com.vk.dotlink.service;

import com.vk.dotlink.entity.Popular;
import com.vk.dotlink.repository.PopularRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PopularService {
    @Autowired
    private PopularRepository popularRepository;

    public List<Popular> getAllPopular() {
        return popularRepository.findAll();
    }
}