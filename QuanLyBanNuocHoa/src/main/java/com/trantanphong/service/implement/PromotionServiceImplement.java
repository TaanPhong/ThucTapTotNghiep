package com.trantanphong.service.implement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trantanphong.convert.PromotionConvert;
import com.trantanphong.dto.PromotionDTO;
import com.trantanphong.entity.Promotion;
import com.trantanphong.repository.PromotionRepository;
import com.trantanphong.service.PromotionService;

@Service
public class PromotionServiceImplement implements PromotionService{

	@Autowired
	private PromotionRepository promotionRepository;
	
	@Autowired
	private PromotionConvert promotionConvert;
	
	@Override
	public List<PromotionDTO> getAllPromotion() {
		// TODO Auto-generated method stub
		List<PromotionDTO> promotionDTOs = new ArrayList<PromotionDTO>();
		List<Promotion> promotions = promotionRepository.findAll();
		for (Promotion promotion : promotions) {
			promotionDTOs.add(promotionConvert.toDTO(promotion));
		}
		return promotionDTOs;
	}

	@Override
	public PromotionDTO save(PromotionDTO newDTO) {
		// TODO Auto-generated method stub
		Promotion newEntity = promotionConvert.toEnity(newDTO);
		return promotionConvert.toDTO(promotionRepository.save(newEntity));
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		promotionRepository.deleteById(id);
	}

}
