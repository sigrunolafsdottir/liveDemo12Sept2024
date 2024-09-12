package com.example.livedemo.controllers;


import com.example.livedemo.models.ShoppingOrder;
import com.example.livedemo.repos.ShoppingOrderRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class ShoppingOrderController {

    private ShoppingOrderRepo pr;

    public ShoppingOrderController(ShoppingOrderRepo pr) {
        this.pr=pr;
    }

    @RequestMapping("/all")
    public List<ShoppingOrder> all() {
        return pr.findAll();
    }

    @PostMapping("/add")
    public List<ShoppingOrder> add(@RequestBody ShoppingOrder order) {
        pr.save(order);
        return pr.findAll();
    }

    //http://localhost:8080/delete/2
    @RequestMapping("/delete/{id}")
    public List<ShoppingOrder> delete(@PathVariable Long id) {
        pr.deleteById(id);
        return pr.findAll();
    }

    @PostMapping("/update")
    public List<ShoppingOrder> update(@RequestBody ShoppingOrder order) {
        pr.save(order);
        return pr.findAll();
    }

}
