package com.trantanphong.convert;

import org.springframework.stereotype.Component;

import com.trantanphong.dto.DiscountDTO;
import com.trantanphong.entity.Discount;
import com.trantanphong.entity.DiscountKey;

@Component
public class DiscountConvert {
	public Discount toEntity(DiscountDTO dto) {
		Discount entity = new Discount();
		entity.setDateEnd(dto.getDateEnd());
		entity.setPresent(dto.getPresent());
		DiscountKey key = new DiscountKey();
		key.setCustomerTypeId(dto.getCustomerTypeId());
		key.setDateStart(dto.getDateStart());
		key.setProductId(dto.getProductId());
		entity.setId(key);
		return entity;
	}
	public Discount toEntity(DiscountDTO dto, Discount entity) {
		entity.setDateEnd(dto.getDateEnd());
		entity.setPresent(dto.getPresent());
		DiscountKey key = new DiscountKey();
		key.setCustomerTypeId(dto.getCustomerTypeId());
		key.setDateStart(dto.getDateStart());
		key.setProductId(dto.getProductId());
		entity.setId(key);
		return entity;
	}
	public DiscountDTO toDTO(Discount entity) {
		DiscountDTO dto = new DiscountDTO();
		dto.setDateEnd(entity.getDateEnd());
		dto.setPresent(entity.getPresent());
		dto.setCustomerTypeId(entity.getId().getCustomerTypeId());
		dto.setDateStart(entity.getId().getDateStart());
		dto.setProductId(entity.getId().getProductId());
		return dto;
	}
}
