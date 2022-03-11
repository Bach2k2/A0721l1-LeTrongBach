package com.exercise.springcustomermanagement.controller;

import com.exercise.springcustomermanagement.model.Customer;
import com.exercise.springcustomermanagement.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public ModelAndView listCustomers() {
        ModelAndView model = new ModelAndView("/customer/list");
        model.addObject("customers", customerService.findAll());
        return model;
    }

    @GetMapping("/create-customer")
    public ModelAndView showCreateForm()
    {
        ModelAndView model=new ModelAndView("/customer/create","customer",new Customer());
        return model;
    }

    @PostMapping("/create-customer")
    public ModelAndView createCus(@ModelAttribute Customer customer) {
        customerService.save(customer);
        ModelAndView model=new ModelAndView("/customer/create");
        model.addObject("customer",new Customer());
        model.addObject("message","New customer 's created successfully");
        return model;
    }

    @GetMapping("edit-customer/{id}")
    public ModelAndView showEditForm(@PathVariable Long id)
    {
        Optional<Customer> customer=customerService.findById(id);
        if(customer.isPresent())
        {
            ModelAndView model=new ModelAndView("/customer/edit");
            model.addObject("customer",customer.get());
            return model;
        }
        else{
            ModelAndView model=new ModelAndView("/customer/error404");
            return model;
        }

    }

    @PostMapping("/edit-customer")
    public ModelAndView editCus(@ModelAttribute("customer") Customer customer, RedirectAttributes redirect){
           customerService.save(customer);
           ModelAndView model=new ModelAndView("/customer/edit");
           model.addObject("customer",customer);
           model.addObject("message","updated customer successfully");
           return model;
    }

    @GetMapping("/remove-customer/{id}")
    public ModelAndView showRemoveForm(@PathVariable Long id)
    {
        Optional<Customer> customer=customerService.findById(id);
        if(customer.isPresent())
        {
            ModelAndView model=new ModelAndView("/customer/remove");
            model.addObject("customer",customer.get());
            return model;
        }
        else{
            ModelAndView model=new ModelAndView("customer/error404");
            return model;
        }
    }

    @PostMapping("/remove-customer")
    public ModelAndView removeCus(@ModelAttribute Customer customer, RedirectAttributes redirect){
        customerService.remove(customer.getId());
        redirect.addFlashAttribute("customers",customerService.findAll());
        redirect.addAttribute("message","Xóa thành công");
        return new ModelAndView("customer/remove");
    }
}
