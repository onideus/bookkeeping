package com.oni.bookkeeping.repository;

import com.oni.bookkeeping.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByFirstName(String FirstName);
    List<Customer> findAll();
}