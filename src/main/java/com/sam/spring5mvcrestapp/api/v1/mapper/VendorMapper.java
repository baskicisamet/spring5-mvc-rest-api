package com.sam.spring5mvcrestapp.api.v1.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.sam.spring5mvcrestapp.api.v1.model.VendorDTO;
import com.sam.spring5mvcrestapp.domain.Vendor;


@Mapper
public interface VendorMapper {

    VendorMapper INSTANCE = Mappers.getMapper(VendorMapper.class);

    VendorDTO vendorToVendorDTO(Vendor vendor);

    Vendor vendorDTOtoVendor(VendorDTO vendorDTO);
}
