package com.trantanphong.convert;

import org.springframework.stereotype.Component;

import com.trantanphong.dto.DecentralizationDTO;
import com.trantanphong.entity.Brand;
import com.trantanphong.entity.Decentralization;

@Component
public class DecentralizationConvert {
	public Decentralization toEntity(DecentralizationDTO dto) {
		Decentralization entity = new Decentralization();
		entity.setId(dto.getId());
		entity.setAuthorizedName(dto.getAuthorizedName());
		return entity;
	}
	public Decentralization toEntity(DecentralizationDTO dto, Decentralization entity) {
		entity.setId(dto.getId());
		entity.setAuthorizedName(dto.getAuthorizedName());
		return entity;
	}
	public DecentralizationDTO toDTO(Decentralization entity) {
		DecentralizationDTO dto = new DecentralizationDTO();
		dto.setId(entity.getId());
		dto.setAuthorizedName(entity.getAuthorizedName());
		return dto;
	}
}
