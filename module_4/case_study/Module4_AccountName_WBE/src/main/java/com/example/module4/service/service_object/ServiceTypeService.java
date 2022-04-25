package com.example.module4.service.service;

import com.example.module4.model.ServiceType;
import com.example.module4.repository.service.ServiceTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceTypeService {
    @Autowired
    private ServiceTypeRepository serviceTypeRepository;
    public Iterable<ServiceType> findAll()
    {
        return serviceTypeRepository.findAll();
    }
}
