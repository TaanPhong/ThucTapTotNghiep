package com.trantanphong.service;

import java.util.List;

import com.trantanphong.dto.StaffDTO;

public interface StaffService {
	List<StaffDTO> getAllSatff();
	StaffDTO save(StaffDTO newDto);
	void delete(Long id);
}
