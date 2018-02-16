package com.sam.spring5mvcrestapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sam.spring5mvcrestapp.domain.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Long>{
}
