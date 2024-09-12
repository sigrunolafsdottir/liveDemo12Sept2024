package com.example.livedemo.controllers;


import com.example.livedemo.models.Customer;
import com.example.livedemo.models.Product;
import com.example.livedemo.repos.CustomerRepo;
import com.example.livedemo.repos.ProductRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private CustomerRepo pr;

    public CustomerController(CustomerRepo pr) {
        this.pr=pr;
    }

    @RequestMapping("/all")
    public List<Customer> all() {
        return pr.findAll();
    }

    @PostMapping("/add")
    public List<Customer> add(@RequestBody Customer customer) {
        pr.save(customer);
        return pr.findAll();
    }

    //http://localhost:8080/delete/2
    @RequestMapping("/delete/{id}")
    public List<Customer> delete(@PathVariable Long id) {
        pr.deleteById(id);
        return pr.findAll();
    }

    @PostMapping("/update")
    public List<Customer> update(@RequestBody Customer customer) {
        pr.save(customer);
        return pr.findAll();
    }

}
