package com.trantanphong.convert;

import org.springframework.stereotype.Component;

import com.trantanphong.dto.CustomerDTO;
import com.trantanphong.dto.PromotionDTO;
import com.trantanphong.entity.Customer;
import com.trantanphong.entity.Promotion;

@Component
public class PromotionConvert {
	public Promotion toEnity(PromotionDTO dto)
	{
		Promotion entity = new Promotion();
		entity.setId(dto.getId());
		entity.setDescription(dto.getDescription());
		return entity;
	}
	
	public Promotion toEnity(PromotionDTO dto, Promotion entity)
	{
		entity.setId(dto.getId());
		entity.setDescription(dto.getDescription());
		return entity;
	}
	
	public PromotionDTO toDTO(Promotion entity)
	{
		PromotionDTO dto = new PromotionDTO();
		dto.setId(entity.getId());
		dto.setDescription(entity.getDescription());
		return dto;
	}
}
