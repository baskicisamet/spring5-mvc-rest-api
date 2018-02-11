package com.sam.spring5mvcrestapp.service;

import java.util.List;

import com.sam.spring5mvcrestapp.api.v1.model.CustomerDTO;

/**
 * Created by jt on 9/27/17.
 */
public interface CustomerService {

    List<CustomerDTO> getAllCustomers();

    CustomerDTO getCustomerById(Long id);
    
    CustomerDTO createNewCustomer(CustomerDTO customerDTO);
}
