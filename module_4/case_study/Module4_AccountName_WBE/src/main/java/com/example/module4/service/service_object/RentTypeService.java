package com.example.module4.service.service;


import com.example.module4.model.RentType;
import com.example.module4.repository.service.RentTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RentTypeService  {
    @Autowired
    private RentTypeRepository rentTypeRepository;

    public Iterable<RentType> findAll()
    {
        return rentTypeRepository.findAll();
    }
}
