package com.example.livedemo.repos;

import com.example.livedemo.models.Customer;
import com.example.livedemo.models.Membership;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MembershipRepo extends JpaRepository<Membership, Long> {


}
