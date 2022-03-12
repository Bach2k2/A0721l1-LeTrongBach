package com.module.service.personal_blog;

import com.module.model.PersonalBlog;
import com.module.repository.PersonalBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Iterator;
import java.util.Optional;

public class PersonalBlogServiceImpl implements IPersonalBlogService {

    @Autowired
    private PersonalBlogRepository personalBlogRepository;

    @Override
    public Iterable<PersonalBlog> findAll() {
        return personalBlogRepository.findAll();
    }

    @Override
    public Optional<PersonalBlog> findById(Long id) {
        return personalBlogRepository.findById(id);
    }

    @Override
    public void save(PersonalBlog personalBlog) {
        personalBlogRepository.save(personalBlog);
    }

    @Override
    public void remove(Long id) {
        personalBlogRepository.deleteById(id);
    }
}
