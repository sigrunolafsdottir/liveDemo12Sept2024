package com.example.livedemo.repos;

import com.example.livedemo.models.Customer;
import com.example.livedemo.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepo extends JpaRepository<Customer, Long> {
    public List<Customer> findByName(String name);

}
