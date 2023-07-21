package com.trantanphong.convert;

import org.springframework.stereotype.Component;

import com.trantanphong.dto.SupplierDTO;
import com.trantanphong.entity.Supplier;

@Component
public class SupplierConvert {
	public Supplier toEntity(SupplierDTO dto) {
		Supplier entity = new Supplier();
		entity.setId(dto.getId());
		entity.setNameSupplier(dto.getNameSupplier());
		entity.setLocation(dto.getLocation());
		entity.setLocationWebsite(dto.getLocationWebsite());
		entity.setNumberPhone(dto.getNumberPhone());
		entity.setEmail(dto.getEmail());
		return entity;
	}
	public Supplier toEntity(SupplierDTO dto, Supplier entity) {
		entity.setId(dto.getId());
		entity.setNameSupplier(dto.getNameSupplier());
		entity.setLocation(dto.getLocation());
		entity.setLocationWebsite(dto.getLocationWebsite());
		entity.setNumberPhone(dto.getNumberPhone());
		entity.setEmail(dto.getEmail());
		return entity;
	}
	public SupplierDTO toDTO(Supplier entity) {
		SupplierDTO dto = new SupplierDTO();
		dto.setId(entity.getId());
		dto.setNameSupplier(entity.getNameSupplier());
		dto.setLocation(entity.getLocation());
		dto.setLocationWebsite(entity.getLocationWebsite());
		dto.setNumberPhone(entity.getNumberPhone());
		dto.setEmail(entity.getEmail());
		return dto;
	}
}
