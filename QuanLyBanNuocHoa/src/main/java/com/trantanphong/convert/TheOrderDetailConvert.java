package com.trantanphong.convert;

import org.springframework.stereotype.Component;

import com.trantanphong.dto.TheOrderDetailDTO;
import com.trantanphong.entity.TheOrderDetail;
import com.trantanphong.entity.TheOrderDetailKey;

@Component
public class TheOrderDetailConvert {
	public TheOrderDetail toEntity(TheOrderDetailDTO dto) {
		TheOrderDetail entity = new TheOrderDetail();
		entity.setNumberOf(dto.getNumberOf());
		entity.setPrice(dto.getPrice());
		TheOrderDetailKey key = new TheOrderDetailKey();
		key.setProductId(dto.getProductId());
		key.setTheOrderId(dto.getTheOrderId());
		entity.setId(key);
		return entity;
	}

	public TheOrderDetail toEntity(TheOrderDetailDTO dto, TheOrderDetail entity) {
		entity.setNumberOf(dto.getNumberOf());
		entity.setPrice(dto.getPrice());
		TheOrderDetailKey key = new TheOrderDetailKey();
		key.setProductId(dto.getProductId());
		key.setTheOrderId(dto.getTheOrderId());
		entity.setId(key);
		return entity;
	}

	public TheOrderDetailDTO toDTO(TheOrderDetail entity) {
		TheOrderDetailDTO dto = new TheOrderDetailDTO();
		dto.setNumberOf(entity.getNumberOf());
		dto.setPrice(entity.getPrice());
		//TheOrderDetailKey key = new TheOrderDetailKey();
		dto.setProductId(entity.getId().getProductId());
		dto.setTheOrderId(entity.getId().getTheOrderId());
		return dto;
	}
}
