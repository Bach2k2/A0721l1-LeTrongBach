package com.exercise.springcustomermanagement.controller;

import com.exercise.springcustomermanagement.model.Customer;
import com.exercise.springcustomermanagement.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public ModelAndView listCustomers() {
        ModelAndView model = new ModelAndView("list");
        model.addObject("customers", customerService.findAll());
        return model;
    }

    @GetMapping("/create-customer")
    public ModelAndView showCreateForm()
    {
        ModelAndView model=new ModelAndView("create","customer",new Customer());
        return model;
    }

    @PostMapping("/create-customer")
    public ModelAndView createCus(@ModelAttribute Customer customer) {
        customerService.save(customer);
        ModelAndView model=new ModelAndView("create");
        model.addObject("customer",new Customer());
        model.addObject("message","New customer 's created successfully");
        return model;
    }
}
