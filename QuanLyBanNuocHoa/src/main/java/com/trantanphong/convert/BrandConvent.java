package com.trantanphong.convert;

import org.springframework.stereotype.Component;

import com.trantanphong.dto.BrandDTO;
import com.trantanphong.entity.Brand;

@Component
public class BrandConvent {
	public Brand toEntity(BrandDTO dto) {
		Brand entity = new Brand();
		entity.setId(dto.getId());
		entity.setNameBrand(dto.getNameBrand());
		return entity;
	}

	public Brand toEntity(BrandDTO dto, Brand entity) {
		entity.setId(dto.getId());
		entity.setNameBrand(dto.getNameBrand());
		return entity;
	}

	public BrandDTO toDTO(Brand entity) {
		BrandDTO dto = new BrandDTO();
		dto.setId(entity.getId());
		dto.setNameBrand(entity.getNameBrand());
		return dto;
	}
}
