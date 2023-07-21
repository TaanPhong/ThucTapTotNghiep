package com.trantanphong.service;

import java.util.List;

import com.trantanphong.dto.StatusOrderDTO;

public interface StatusOrderService {
	List<StatusOrderDTO> getAllStatus();
	StatusOrderDTO save(StatusOrderDTO newDto);
	void delete(Long id);
}
