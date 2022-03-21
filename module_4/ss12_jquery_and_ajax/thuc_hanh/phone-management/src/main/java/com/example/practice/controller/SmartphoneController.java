package com.example.practice.controller;

//import com.example.practice.model.Smartphone;
//import com.example.practice.service.ISmartphoneService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.ModelAndView;
//
//import java.util.Optional;
//
//
//@RestController
//@RequestMapping("/smartphones")
//public class SmartphoneController {
//    @Autowired
//    private ISmartphoneService smartphoneService;
//
//    @GetMapping("/list")
//    public ModelAndView showAllProductList() {
//        ModelAndView model = new ModelAndView("/phone/list");
//        model.addObject("smartphones", smartphoneService.findAll());
//        return model;
//    }
//
//    @PostMapping()
//    public ResponseEntity<Smartphone> createSmartphone(@RequestBody Smartphone smartphone) {
//        return new ResponseEntity<>(smartphoneService.save(smartphone), HttpStatus.CREATED);
//    }
//
//    @GetMapping()
//    public ResponseEntity<Iterable<Smartphone>> getAllPhone() {
//        return new ResponseEntity<>(smartphoneService.findAll(), HttpStatus.OK);
//    }
//
//    @PostMapping("delete/{id}")
//    public ResponseEntity<Smartphone> deleteSmartPhone(@PathVariable Long id) {
//        Optional<Smartphone> smartphone = smartphoneService.findById(id);
//        if (!smartphone.isPresent()) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//        smartphoneService.remove(id);
//        return new ResponseEntity<>(smartphone.get(), HttpStatus.NO_CONTENT);
//
//    }
//}



import com.example.practice.model.Smartphone;
import com.example.practice.service.ISmartphoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@RestController
@RequestMapping("/smartphones")
public class SmartphoneController {
    @Autowired
    private ISmartphoneService smartphoneService;

    @PostMapping
    public ResponseEntity createSmartphone(@RequestBody Smartphone smartphone) {
        smartphoneService.save(smartphone);
        return new ResponseEntity< >(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Iterable<Smartphone>> allPhones() {
        return new ResponseEntity<>(smartphoneService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/list")
    public ModelAndView getAllSmartphonePage() {
        ModelAndView modelAndView = new ModelAndView("/phone/list");
        modelAndView.addObject("smartphones", smartphoneService.findAll());
        return modelAndView;
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Smartphone> deleteSmartphone(@PathVariable Long id) {
        Optional<Smartphone> smartphoneOptional = smartphoneService.findById(id);
        if (!smartphoneOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        smartphoneService.remove(id);
        return new ResponseEntity<>(smartphoneOptional.get(), HttpStatus.NO_CONTENT);
    }
}