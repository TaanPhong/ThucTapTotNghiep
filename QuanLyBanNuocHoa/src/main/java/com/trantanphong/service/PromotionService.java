package com.trantanphong.service;

import java.util.List;

import com.trantanphong.dto.PromotionDTO;

public interface PromotionService {
	List<PromotionDTO> getAllPromotion();
	PromotionDTO save(PromotionDTO newDTO);
	void delete(Long id);
}
