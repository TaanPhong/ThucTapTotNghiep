package com.trantanphong.convert;

import org.springframework.stereotype.Component;

import com.trantanphong.dto.AuthorizedDetailDTO;
import com.trantanphong.entity.AuthorizedDetail;
import com.trantanphong.entity.AuthorizedDetailKey;

@Component
public class AuthorizedDetailConvert {
	public AuthorizedDetail toEntity(AuthorizedDetailDTO dto) {

		AuthorizedDetail entity = new AuthorizedDetail();
		entity.setDateEnd(dto.getDateEnd());
		AuthorizedDetailKey key = new AuthorizedDetailKey();
		key.setAccountId(dto.getAccountId());
		key.setDateStart(dto.getDateStart());
		key.setDisplayId(dto.getDisplayId());
		key.setDecentralizationId(dto.getDecentralizationId());
		entity.setId(key);
		return entity;
	}
	public AuthorizedDetail toEntity(AuthorizedDetailDTO dto, AuthorizedDetail entity) {

		entity.setDateEnd(dto.getDateEnd());
		AuthorizedDetailKey key = new AuthorizedDetailKey();
		key.setAccountId(dto.getAccountId());
		key.setDateStart(dto.getDateStart());
		key.setDisplayId(dto.getDisplayId());
		key.setDecentralizationId(dto.getDecentralizationId());
		entity.setId(key);
		return entity;
	}
	public AuthorizedDetailDTO toDTO(AuthorizedDetail entity) {

		AuthorizedDetailDTO dto = new AuthorizedDetailDTO();
		dto.setDateEnd(entity.getDateEnd());
		dto.setAccountId(entity.getId().getAccountId());
		dto.setDateStart(entity.getId().getDateStart());
		dto.setDisplayId(entity.getId().getDisplayId());
		dto.setDecentralizationId(entity.getId().getDecentralizationId());
		return dto;
	}
}
