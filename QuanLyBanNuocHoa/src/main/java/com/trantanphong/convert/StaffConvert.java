package com.trantanphong.convert;

import org.springframework.stereotype.Component;

import com.trantanphong.dto.StaffDTO;
import com.trantanphong.entity.Staff;

@Component
public class StaffConvert {
	public Staff toEntity(StaffDTO dto) {
		Staff entity = new Staff();
		entity.setId(dto.getId());
		entity.setFirstyName(dto.getFirstName());
		entity.setLastName(dto.getLastName());
		entity.setNumberPhone(dto.getNumberPhone());
		entity.setLocation(dto.getLocation());
		entity.setDayOfBirth(dto.getDayOfBirth());
		entity.setCitizenID(dto.getCitizenID());
		entity.setStatus(dto.getStatus());
		return entity;
	}
	public Staff toEntity(StaffDTO dto, Staff entity) {
		//Staff entity = new Staff();
		entity.setId(dto.getId());
		entity.setFirstyName(dto.getFirstName());
		entity.setLastName(dto.getLastName());
		entity.setNumberPhone(dto.getNumberPhone());
		entity.setLocation(dto.getLocation());
		entity.setDayOfBirth(dto.getDayOfBirth());
		entity.setCitizenID(dto.getCitizenID());
		entity.setStatus(dto.getStatus());
		return entity;
	}
	public StaffDTO toDTO(Staff entity) {
		StaffDTO dto = new StaffDTO();
		dto.setId(entity.getId());
		dto.setFirstyName(entity.getFirstyName());
		dto.setLastName(entity.getLastName());
		dto.setNumberPhone(entity.getNumberPhone());
		dto.setLocation(entity.getLocation());
		dto.setDayOfBirth(entity.getDayOfBirth());
		dto.setCitizenID(entity.getCitizenID());
		dto.setStatus(entity.getStatus());
		dto.setFullName(entity.getFirstyName()+ " " + entity.getLastName());
		return dto;
	}
}
