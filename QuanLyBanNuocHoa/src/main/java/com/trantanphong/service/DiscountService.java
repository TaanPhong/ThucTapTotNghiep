package com.trantanphong.service;

import java.util.List;

import com.trantanphong.dto.DiscountDTO;

public interface DiscountService {
	List<DiscountDTO> getAllDiscount();
	DiscountDTO save(DiscountDTO newDTO);
}
