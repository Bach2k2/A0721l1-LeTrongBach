package com.module.controller;

import com.module.repository.CategoryRepository;
import com.module.service.category.CategoryServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoryController {

    private CategoryServiceImpl categoryService;

    @GetMapping("category")
    public String showCategoryList(Model model)
    {
        model.addAttribute("categories",categoryService.findAll());
        return "/category/home";
    }
}
