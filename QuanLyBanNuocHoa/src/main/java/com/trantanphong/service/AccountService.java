package com.trantanphong.service;

import java.util.List;

import com.trantanphong.dto.AccountDTO;

public interface AccountService {
	List<AccountDTO> getAllAccount();
	AccountDTO save(AccountDTO accountDTO);
}
