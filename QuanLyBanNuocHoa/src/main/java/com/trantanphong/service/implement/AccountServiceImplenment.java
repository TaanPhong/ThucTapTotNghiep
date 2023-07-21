package com.trantanphong.service.implement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trantanphong.convert.AccountConvert;
import com.trantanphong.dto.AccountDTO;
import com.trantanphong.entity.Account;
import com.trantanphong.repository.AccountRepository;
import com.trantanphong.service.AccountService;

@Service
public class AccountServiceImplenment implements AccountService {

	@Autowired
	private AccountRepository accountRepository;
	@Autowired
	private AccountConvert accountConvert;

	@Override
	public List<AccountDTO> getAllAccount() {
		List<AccountDTO> accountDTOs= new ArrayList<AccountDTO>();
		List<Account> accounts = accountRepository.findAll();
		for (Account account : accounts) {
			accountDTOs.add(accountConvert.toDTO(account));
		}
		return accountDTOs;
	}

	@Override
	public AccountDTO save(AccountDTO accountDTO) {
		// TODO Auto-generated method stub
		Account newEntity = accountConvert.toEntity(accountDTO);
		return accountConvert.toDTO(accountRepository.save(newEntity));
	}

}
