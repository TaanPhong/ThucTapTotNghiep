package com.trantanphong.service.implement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trantanphong.convert.SupplierConvert;
import com.trantanphong.dto.SupplierDTO;
import com.trantanphong.entity.Supplier;
import com.trantanphong.repository.SupplierRepository;
import com.trantanphong.service.SupplierService;

@Service
public class SupplierServiceImplement implements SupplierService{

	@Autowired
	private SupplierRepository supplierRepository;
	@Autowired
	private SupplierConvert supplierConvert;
	
	@Override
	public List<SupplierDTO> getAllSupplier() {
		// TODO Auto-generated method stub
		List<SupplierDTO> supplierDTOs = new ArrayList<SupplierDTO>();
		List<Supplier> suppliers = supplierRepository.findAll();
		for (Supplier supplier : suppliers) {
			supplierDTOs.add(supplierConvert.toDTO(supplier));
		}
		return supplierDTOs;
	}

	@Override
	public SupplierDTO save(SupplierDTO newDTO) {
		// TODO Auto-generated method stub
		Supplier newEntity = supplierConvert.toEntity(newDTO);
		return supplierConvert.toDTO(supplierRepository.save(newEntity));
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		supplierRepository.deleteById(id);
	}

}
