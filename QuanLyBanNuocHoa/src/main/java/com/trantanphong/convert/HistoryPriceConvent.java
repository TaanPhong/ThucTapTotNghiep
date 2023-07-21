package com.trantanphong.convert;

import org.springframework.stereotype.Component;

import com.trantanphong.dto.HistoryPriceDTO;
import com.trantanphong.entity.HistoryPrice;
import com.trantanphong.entity.HistoryPriceKey;

@Component
public class HistoryPriceConvent {
	public HistoryPrice toEntity(HistoryPriceDTO dto) {
		HistoryPrice entity = new HistoryPrice();
		entity.setDateEnd(dto.getDateEnd());
		entity.setPrice(dto.getPrice());
		HistoryPriceKey key = new HistoryPriceKey();
		key.setDateStart(dto.getDateStart());
		key.setProductId(dto.getProductId());
		key.setStaffId(dto.getStaffId());
		entity.setId(key);
		return entity;
	}
	public HistoryPrice toEntity(HistoryPriceDTO dto, HistoryPrice entity) {
		entity.setDateEnd(dto.getDateEnd());
		entity.setPrice(dto.getPrice());
		HistoryPriceKey key = new HistoryPriceKey();
		key.setDateStart(dto.getDateStart());
		key.setProductId(dto.getProductId());
		key.setStaffId(dto.getStaffId());
		entity.setId(key);
		return entity;
	}
	
	public HistoryPriceDTO toDTO(HistoryPrice entity) {
		HistoryPriceDTO dto = new HistoryPriceDTO();
		dto.setDateEnd(entity.getDateEnd());
		dto.setPrice(entity.getPrice());
		dto.setDateStart(entity.getId().getDateStart());
		dto.setProductId(entity.getId().getProductId());
		dto.setStaffId(entity.getId().getStaffId());
		return dto;
	}
	
}
