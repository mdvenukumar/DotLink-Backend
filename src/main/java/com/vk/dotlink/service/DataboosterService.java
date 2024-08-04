package com.vk.dotlink.service;

import com.vk.dotlink.entity.Databooster;
import com.vk.dotlink.repository.DataboosterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataboosterService {
    @Autowired
    private DataboosterRepository databoosterRepository;

    public List<Databooster> getAllDatabooster() {
        return databoosterRepository.findAll();
    }
}