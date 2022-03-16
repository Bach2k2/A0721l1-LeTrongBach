package com.example.blog.service.category;

import com.example.blog.model.Category;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ICategoryService {
    Iterable<Category> findAll();
    Iterable<Category> findAll(Pageable pageable);
    Optional<Category> findById(Long id);
    void save(Category Category);
    void remove(Long id);
}
