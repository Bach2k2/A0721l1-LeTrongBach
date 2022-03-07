package com.module.repository;

import com.module.model.PersonalBlog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonalBlogRepository  extends JpaRepository<PersonalBlog,Long > {
    List<PersonalBlog> findAllByNameAndId(String name,Long id);
}
