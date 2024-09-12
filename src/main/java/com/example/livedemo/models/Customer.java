package com.example.livedemo.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Customer {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @OneToMany
    @JoinColumn(name="customerId")
    private List<ShoppingOrder> shoppingorder = new ArrayList<>();

    public Customer(String name) {
        this.name=name;
    }

    public Customer(String name, List<ShoppingOrder> shoppingorder) {
        this.name=name;
        this.shoppingorder=shoppingorder;
    }

}
