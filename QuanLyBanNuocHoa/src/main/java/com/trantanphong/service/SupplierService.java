package com.trantanphong.service;

import java.util.List;

import com.trantanphong.dto.SupplierDTO;

public interface SupplierService {
	List<SupplierDTO> getAllSupplier();
	SupplierDTO save(SupplierDTO newDTO);
	void delete(Long id);
}
