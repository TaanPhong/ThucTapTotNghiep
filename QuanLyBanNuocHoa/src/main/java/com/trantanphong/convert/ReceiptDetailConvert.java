package com.trantanphong.convert;

import org.springframework.stereotype.Component;

import com.trantanphong.dto.ReceiptDetailDTO;
import com.trantanphong.entity.ReceiptDetail;
import com.trantanphong.entity.ReceiptDetailKey;

@Component
public class ReceiptDetailConvert {
	public ReceiptDetail toEntity(ReceiptDetailDTO dto) {
		ReceiptDetail entity = new ReceiptDetail();
		entity.setPrice(dto.getPrice());
		entity.setNumberOf(dto.getNumberOf());
		ReceiptDetailKey key = new ReceiptDetailKey();
		key.setGoodReceiptNoteId(dto.getGoodReceiptNoteId());
		key.setProductId(dto.getProductId());
		entity.setId(key);
		return entity;
	}

	public ReceiptDetail toEntity(ReceiptDetailDTO dto, ReceiptDetail entity) {
		//ReceiptDetail entity = new ReceiptDetail();
		entity.setPrice(dto.getPrice());
		entity.setNumberOf(dto.getNumberOf());
		ReceiptDetailKey key = new ReceiptDetailKey();
		key.setGoodReceiptNoteId(dto.getGoodReceiptNoteId());
		key.setProductId(dto.getProductId());
		entity.setId(key);
		return entity;
	}

	public ReceiptDetailDTO toDTO(ReceiptDetail entity) {
		ReceiptDetailDTO dto = new ReceiptDetailDTO();
		dto.setPrice(entity.getPrice());
		dto.setNumberOf(entity.getNumberOf());
		//ReceiptDetailKey key = new ReceiptDetailKey();
		dto.setGoodReceiptNoteId(entity.getId().getGoodReceiptNoteId());
		dto.setProductId(entity.getId().getProductId());
		//entity.setId(key);
		return dto;
	}
}
