package com.trantanphong.service;

import java.util.List;

import com.trantanphong.dto.TheOrderDTO;

public interface TheOrderService {
	List<TheOrderDTO> getAllTheOrder();
	TheOrderDTO save(TheOrderDTO newDto);
	void delete(Long id);
}
