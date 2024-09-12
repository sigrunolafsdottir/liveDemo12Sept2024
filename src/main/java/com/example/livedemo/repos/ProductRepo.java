package com.example.livedemo.repos;

import com.example.livedemo.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Long> {
    public List<Product> findByName(String name);
    public List<Product> findByPrice(int price);
    public List<Product> findByNameAndPrice(String name, int price);
}
