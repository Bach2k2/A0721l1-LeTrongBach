package com.example.practice.service;

import com.example.practice.model.Smartphone;
import com.example.practice.repository.ISmartphoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SmartphoneService implements ISmartphoneService{

    @Autowired
    private ISmartphoneRepository repository;
    @Override
    public Iterable<Smartphone> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Smartphone> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void save(Smartphone smartphone) {
        repository.save(smartphone);
    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);
    }
}
