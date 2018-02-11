package com.sam.spring5mvcrestapp.api.v1.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.sam.spring5mvcrestapp.api.v1.model.CustomerDTO;
import com.sam.spring5mvcrestapp.domain.Customer;


@Mapper
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    CustomerDTO customerToCustomerDTO(Customer customer);
    
    Customer customerDtoToCustomer(CustomerDTO customerDTO);
}
