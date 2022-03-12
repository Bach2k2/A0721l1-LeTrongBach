package com.module.controller;

import com.module.model.Category;
import com.module.model.PersonalBlog;
import com.module.repository.PersonalBlogRepository;
import com.module.service.category.CategoryServiceImpl;
import com.module.service.personal_blog.PersonalBlogServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BlogController {
    private PersonalBlogServiceImpl blogService;

    private CategoryServiceImpl categoryService;

    @ModelAttribute("category")
    public Iterable<Category>categories()
    {
        return categoryService.findAll();
    }

    @GetMapping("/personal_blog")
    public String showHome(Model model) {
        // ModelAndView model=new ModelAndView("/blog/home");
        Iterable<PersonalBlog> blogs=blogService.findAll();
        model.addAttribute("blogs",blogs);
        return "blog/home";
    }

    @GetMapping("/create-blog")
    public ModelAndView showCreateBlog() {
        ModelAndView modelAndView = new ModelAndView("blog/create-blog", "blog", new PersonalBlog());
        return modelAndView;
    }

    @PostMapping("/create-blog")
    public ModelAndView createBlog(@ModelAttribute PersonalBlog blog) {
        blogService.save(blog);
        ModelAndView model = new ModelAndView("/blog/create");
        model.addObject("message", "Create successfully");
        return model;
    }

}
