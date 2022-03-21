package com.example.practice.service;

import com.example.practice.model.Smartphone;

import java.util.Optional;

public interface ISmartphoneService {
    Iterable<Smartphone> findAll();

    Optional<Smartphone> findById(Long id);

    void save(Smartphone smartphone);

    void remove(Long id);
}
