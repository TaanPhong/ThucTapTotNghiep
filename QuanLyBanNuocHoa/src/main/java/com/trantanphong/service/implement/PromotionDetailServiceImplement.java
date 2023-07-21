package com.trantanphong.service.implement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.trantanphong.convert.PromotionConvert;
import com.trantanphong.convert.PromotionDetailConvert;
import com.trantanphong.dto.PromotionDetailDTO;
import com.trantanphong.entity.PromotionDetail;
import com.trantanphong.repository.PromotionDetailRepository;
import com.trantanphong.service.PromotionDetailService;

public class PromotionDetailServiceImplement implements PromotionDetailService{

	@Autowired
	private PromotionDetailRepository promotionDetailRepository;
	
	@Autowired
	private PromotionDetailConvert promotionDetailConvert;
	
	@Override
	public List<PromotionDetailDTO> getAllPromotionDetail() {
		// TODO Auto-generated method stub
		List<PromotionDetailDTO> promotionDetailDTOs = new ArrayList<PromotionDetailDTO>();
		List<PromotionDetail> promotionDetails = promotionDetailRepository.findAll();
		for (PromotionDetail promotionDetail : promotionDetails) {
			promotionDetailDTOs.add(promotionDetailConvert.toDTO(promotionDetail));
		}
		return promotionDetailDTOs;
	}

	@Override
	public PromotionDetailDTO save(PromotionDetailDTO newDTO) {
		// TODO Auto-generated method stub
		PromotionDetail newEntity = promotionDetailConvert.toEntity(newDTO);
		return promotionDetailConvert.toDTO(promotionDetailRepository.save(newEntity));
	}

}
