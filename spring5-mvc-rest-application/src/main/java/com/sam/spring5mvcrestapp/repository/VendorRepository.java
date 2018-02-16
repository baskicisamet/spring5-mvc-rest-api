package com.sam.spring5mvcrestapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sam.spring5mvcrestapp.domain.Vendor;


public interface VendorRepository extends JpaRepository<Vendor, Long> {
}
