package com.trantanphong.service;

import java.util.List;

import com.trantanphong.dto.TheOrderDetailDTO;

public interface TheOrderDetailService {
	List<TheOrderDetailDTO> getAllOrderDetail();
	TheOrderDetailDTO save(TheOrderDetailDTO newDTO);
}
