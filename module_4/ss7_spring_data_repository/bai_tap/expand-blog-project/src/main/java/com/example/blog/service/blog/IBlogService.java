package com.example.blog.service.blog;

import com.example.blog.model.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;


import java.util.Optional;

public interface IBlogService {
    Iterable<Blog> findAll();
    Iterable<Blog> findAll(Pageable pageable);
    Optional<Blog> findById(Long id);
    void save(Blog blog);
    void remove(Long id);

}
