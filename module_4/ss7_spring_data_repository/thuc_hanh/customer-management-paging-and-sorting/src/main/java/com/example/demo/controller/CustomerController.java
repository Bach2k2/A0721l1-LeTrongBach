package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.model.Province;
import com.example.demo.service.customer.ICustomerService;
import com.example.demo.service.province.IProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @Autowired
    private IProvinceService provinceService;

    //Error :404
    @ModelAttribute("provinces")
    public Iterable<Province> provinces() {
        return provinceService.findAll();
    }

    @GetMapping("/customers")
    public ModelAndView listCustomers(@RequestParam("search") Optional<String> search, Pageable pageable) {
        Page<Customer> customers;
        if (search.isPresent()) {
            customers = customerService.findAllByFirstNameContaining(search.get(), pageable);
        } else {
            customers = customerService.findAll(pageable);
        }

        ModelAndView modelAndView = new ModelAndView("/customer/list");
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }
}
