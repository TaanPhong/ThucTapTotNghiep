package com.trantanphong.service;

import java.util.List;

import com.trantanphong.dto.CustomerDTO;

public interface CustomerService {
	List<CustomerDTO> getAllCustomer();
	CustomerDTO save(CustomerDTO customerDTO);
	void delete(Long id);
}
