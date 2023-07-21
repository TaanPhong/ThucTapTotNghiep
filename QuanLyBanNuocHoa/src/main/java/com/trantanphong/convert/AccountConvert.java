package com.trantanphong.convert;

import org.springframework.stereotype.Component;

import com.trantanphong.dto.AccountDTO;
import com.trantanphong.entity.Account;

@Component
public class AccountConvert {
	public Account toEntity(AccountDTO dto) {
		Account entity = new Account();
		entity.setUserName(dto.getUserName());
		entity.setPassword(dto.getPassword());
		entity.setAvatar(dto.getAvatar());
		return entity;
	}

	public Account toEntity(AccountDTO dto, Account entity) {
		entity.setUserName(dto.getUserName());
		entity.setPassword(dto.getPassword());
		entity.setAvatar(dto.getAvatar());
		return entity;
	}

	public AccountDTO toDTO(Account entity) {
		AccountDTO dto = new AccountDTO();
		dto.setUserName(entity.getUserName());
		dto.setPassword(entity.getPassword());
		dto.setAvatar(entity.getAvatar());
		return dto;
	}
}
