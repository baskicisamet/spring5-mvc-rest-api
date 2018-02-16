package com.sam.spring5mvcrestapp.service;

import com.sam.spring5mvcrestapp.api.v1.model.VendorDTO;
import com.sam.spring5mvcrestapp.api.v1.model.VendorListDTO;



public interface VendorService {

    VendorDTO getVendorById(Long id);

    VendorListDTO getAllVendors();

    VendorDTO createNewVendor(VendorDTO vendorDTO);

    VendorDTO saveVendorByDTO(Long id, VendorDTO vendorDTO);

    VendorDTO patchVendor(Long id, VendorDTO vendorDTO);

    void deleteVendorById(Long id);
}
