package com.example.livedemo.controllers;


import com.example.livedemo.models.Product;
import com.example.livedemo.repos.ProductRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

    private ProductRepo pr;

    public ProductController(ProductRepo pr) {
        this.pr=pr;
    }

    @RequestMapping("/all")
    public List<Product> all() {
        return pr.findAll();
    }

    @PostMapping("/add")
    public List<Product> add(@RequestBody Product product) {
        logger.info("Product was added");
        pr.save(product);
        return pr.findAll();
    }

    //http://localhost:8080/delete/2
    @RequestMapping("/delete/{id}")
    public List<Product> delete(@PathVariable Long id) {
        pr.deleteById(id);
        return pr.findAll();
    }

    @PostMapping("/update")
    public List<Product> update(@RequestBody Product product) {
        pr.save(product);
        return pr.findAll();
    }

    @RequestMapping("/findByNameAndPrice")
    public List<Product> findByNameAndPrice(@RequestParam String name, @RequestParam int price) {
        return pr.findByNameAndPrice(name, price);
    }
}
