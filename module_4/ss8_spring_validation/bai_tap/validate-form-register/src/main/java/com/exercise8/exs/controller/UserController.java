package com.exercise8.exs.controller;

import com.exercise8.exs.model.User;
import com.exercise8.exs.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("")
    public String userForm(Model model)
    {
        Iterable<User> users= userService.findAll();
        model.addAttribute("users",users);
        return "register-form";
    }

    @PostMapping("/register")
    public ModelAndView register(@Valid @ModelAttribute User user, BindingResult result, Model model)
    {
        if(result.hasErrors())
        {
            return new ModelAndView("register-form");
        }
        return new ModelAndView("result","user",user);
    }
}
