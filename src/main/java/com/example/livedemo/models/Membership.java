package com.example.livedemo.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Membership {

    @Id
    @GeneratedValue
    private Long id;
    private int memberNumber;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn
    private Customer customer;

    public Membership(int memberNumber, Customer customer) {
        this.memberNumber=memberNumber;
        this.customer=customer;
    }

}
