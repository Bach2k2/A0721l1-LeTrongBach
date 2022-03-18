package com.exercise.practice.service;

import com.exercise.practice.model.Product;
import com.exercise.practice.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface IProductService {
    Iterable<Product> findAll();
    Optional<Product> findById(Long id);

}
