package com.vk.dotlink.service;

import com.vk.dotlink.entity.Annual;
import com.vk.dotlink.repository.AnnualRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnnualService {
    @Autowired
    private AnnualRepository annualRepository;

    public List<Annual> getAllAnnual() {
        return annualRepository.findAll();
    }
}