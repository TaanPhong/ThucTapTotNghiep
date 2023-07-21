package com.trantanphong.service;

import java.util.List;

import com.trantanphong.dto.CustomerTypeDTO;

public interface CustomerTypeService {
	List<CustomerTypeDTO> getAllTypeCustomer();
	CustomerTypeDTO save(CustomerTypeDTO newDTO);
	void delete(Long id);
}
