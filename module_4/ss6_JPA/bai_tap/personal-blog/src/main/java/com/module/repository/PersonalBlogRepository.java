package com.module.repository;

import com.module.model.PersonalBlog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonalBlogRepository  extends JpaRepository<PersonalBlog,Long > {
    List<PersonalBlog> findAllByNameAndId(String name,Long id);
}
