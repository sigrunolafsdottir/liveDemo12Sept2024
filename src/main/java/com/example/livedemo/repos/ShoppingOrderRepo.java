package com.example.livedemo.repos;

import com.example.livedemo.models.ShoppingOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingOrderRepo extends JpaRepository<ShoppingOrder, Long> {

}
