package com.example.livedemo.controllers;


import com.example.livedemo.models.Customer;
import com.example.livedemo.models.Membership;
import com.example.livedemo.repos.CustomerRepo;
import com.example.livedemo.repos.MembershipRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/membership")
public class MembershipController {

    private MembershipRepo pr;

    public MembershipController(MembershipRepo pr) {
        this.pr=pr;
    }

    @RequestMapping("/all")
    public List<Membership> all() {
        return pr.findAll();
    }

    @PostMapping("/add")
    public List<Membership> add(@RequestBody Membership membership) {
        pr.save(membership);
        return pr.findAll();
    }

    //http://localhost:8080/delete/2
    @RequestMapping("/delete/{id}")
    public List<Membership> delete(@PathVariable Long id) {
        pr.deleteById(id);
        return pr.findAll();
    }

    @PostMapping("/update")
    public List<Membership> update(@RequestBody Membership membership) {
        pr.save(membership);
        return pr.findAll();
    }

}
