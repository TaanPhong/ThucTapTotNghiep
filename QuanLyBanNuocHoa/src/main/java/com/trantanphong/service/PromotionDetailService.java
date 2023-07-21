package com.trantanphong.service;

import java.util.List;

import com.trantanphong.dto.PromotionDetailDTO;

public interface PromotionDetailService {
	List<PromotionDetailDTO> getAllPromotionDetail();
	PromotionDetailDTO save(PromotionDetailDTO newDTO); 
}
