package com.trantanphong.convert;

import org.springframework.stereotype.Component;

import com.trantanphong.dto.TheOrderDTO;
import com.trantanphong.entity.TheOrder;

@Component
public class TheOrderConvert {
	public TheOrder toEntity(TheOrderDTO dto)
	{
		TheOrder entity = new TheOrder();
		entity.setId(dto.getId());
		entity.setDateFound(dto.getDateFound());
		entity.setTotalMoney(dto.getTotalMoney());
		entity.setNumberPhone(dto.getNumberPhone());
		entity.setLocation(dto.getLocation());
		return entity;
	}
	public TheOrder toEntity(TheOrderDTO dto, TheOrder entity)
	{
		//TheOrder entity = new TheOrder();
		entity.setId(dto.getId());
		entity.setDateFound(dto.getDateFound());
		entity.setTotalMoney(dto.getTotalMoney());
		entity.setNumberPhone(dto.getNumberPhone());
		entity.setLocation(dto.getLocation());
		return entity;
	}
	public TheOrderDTO toDTO(TheOrder entity)
	{
		TheOrderDTO dto = new TheOrderDTO();
		dto.setId(entity.getId());
		dto.setDateFound(entity.getDateFound());
		dto.setTotalMoney(entity.getTotalMoney());
		dto.setNumberPhone(entity.getNumberPhone());
		dto.setLocation(entity.getLocation());
		return dto;
	}
}
