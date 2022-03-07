package com.module.controller;

import jdk.jfr.Category;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class BlogController {

    @GetMapping("")
    public String showHome()

}
