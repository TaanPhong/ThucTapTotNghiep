package com.trantanphong.convert;

import org.springframework.stereotype.Component;

import com.trantanphong.dto.PictureProductDTO;
import com.trantanphong.entity.PictureProduct;

@Component
public class PrictureProductConvert {
	public PictureProduct toEntity(PictureProductDTO dto) {
		PictureProduct entity = new PictureProduct();
		entity.setId(dto.getId());
		entity.setUrl(dto.getUrl());
		return entity;
	}
	public PictureProduct toEntity(PictureProductDTO dto, PictureProduct entity) {
		entity.setId(dto.getId());
		entity.setUrl(dto.getUrl());
		return entity;
	}
	
	public PictureProductDTO toDTO(PictureProduct entity) {
		PictureProductDTO dto = new PictureProductDTO();
		dto.setId(entity.getId());
		dto.setUrl(entity.getUrl());
		return dto;
	}
}
