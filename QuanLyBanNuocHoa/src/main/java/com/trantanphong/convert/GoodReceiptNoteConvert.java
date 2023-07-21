package com.trantanphong.convert;

import org.springframework.stereotype.Component;

import com.trantanphong.dto.GoodReceiptNoteDTO;
import com.trantanphong.entity.GoodReceiptNote;

@Component
public class GoodReceiptNoteConvert {
	public GoodReceiptNote toEntity(GoodReceiptNoteDTO dto)
	{
		GoodReceiptNote entity = new GoodReceiptNote();
		entity.setDateFound(dto.getDateFound());
		entity.setId(dto.getId());
		entity.setTotalMoney(dto.getTotalMoney());
		return entity;
	}
	public GoodReceiptNote toEntity(GoodReceiptNoteDTO dto, GoodReceiptNote entity)
	{
		entity.setDateFound(dto.getDateFound());
		entity.setId(dto.getId());
		entity.setTotalMoney(dto.getTotalMoney());
		return entity;
	}
	public GoodReceiptNoteDTO toDTO(GoodReceiptNote entity)
	{
		GoodReceiptNoteDTO dto = new GoodReceiptNoteDTO();
		dto.setDateFound(entity.getDateFound());
		dto.setId(entity.getId());
		dto.setTotalMoney(entity.getTotalMoney());
		return dto;
	}
}
