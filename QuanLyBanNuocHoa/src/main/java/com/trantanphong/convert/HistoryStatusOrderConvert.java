package com.trantanphong.convert;

import org.springframework.stereotype.Component;

import com.trantanphong.dto.HistoryStatusOrderDTO;
import com.trantanphong.entity.HistoryStatusOrder;
import com.trantanphong.entity.HistoryStatusOrderKey;

@Component
public class HistoryStatusOrderConvert {
	public HistoryStatusOrder toEntity(HistoryStatusOrderDTO dto) {
		HistoryStatusOrder entity = new HistoryStatusOrder();
		entity.setDateShift(dto.getDateShift());
		HistoryStatusOrderKey key = new HistoryStatusOrderKey();
		key.setStatusId(dto.getStatusId());
		key.setTheOrderId(dto.getTheOrderId());
		entity.setId(key);
		return entity;
	}
	public HistoryStatusOrder toEntity(HistoryStatusOrderDTO dto, HistoryStatusOrder entity) {
		entity.setDateShift(dto.getDateShift());
		HistoryStatusOrderKey key = new HistoryStatusOrderKey();
		key.setStatusId(dto.getStatusId());
		key.setTheOrderId(dto.getTheOrderId());
		entity.setId(key);
		return entity;
	}
	public HistoryStatusOrderDTO toDTO(HistoryStatusOrder entity) {
		HistoryStatusOrderDTO dto = new HistoryStatusOrderDTO();
		dto.setDateShift(entity.getDateShift());
		//HistoryStatusOrderKey key = new HistoryStatusOrderKey();
		dto.setStatusId(entity.getId().getStatusId());
		dto.setTheOrderId(entity.getId().getTheOrderId());
		return dto;
	}
}
