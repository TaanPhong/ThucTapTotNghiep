package com.trantanphong.convert;

import org.springframework.stereotype.Component;

import com.trantanphong.dto.TypeProductDTO;
import com.trantanphong.entity.TypeProduct;

@Component
public class TypeProductConvert {
	public TypeProduct toEntity(TypeProductDTO dto) {
		TypeProduct entity = new TypeProduct();
		entity.setId(dto.getId());
		entity.setNameType(dto.getNameType());
		return entity;
	}
	public TypeProduct toEntity(TypeProductDTO dto, TypeProduct entity) {
		entity.setId(dto.getId());
		entity.setNameType(dto.getNameType());
		return entity;
	}
	public TypeProductDTO toDTO(TypeProduct entity) {
		TypeProductDTO dto = new TypeProductDTO();
		dto.setId(entity.getId());
		dto.setNameType(entity.getNameType());
		return dto;
	}
}
