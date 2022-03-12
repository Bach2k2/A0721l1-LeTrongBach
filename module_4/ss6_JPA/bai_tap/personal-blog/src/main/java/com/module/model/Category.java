package com.module.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String content;

    @ManyToMany
    @JoinColumn(name="blog_id")
    List<PersonalBlog> blogs;
    public Category() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<PersonalBlog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<PersonalBlog> blogs) {
        this.blogs = blogs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
