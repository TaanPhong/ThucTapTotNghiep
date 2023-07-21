package com.trantanphong.service.implement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trantanphong.convert.ReceiptDetailConvert;
import com.trantanphong.dto.ReceiptDetailDTO;
import com.trantanphong.entity.ReceiptDetail;
import com.trantanphong.repository.ReceiptDetailRepository;
import com.trantanphong.service.ReceiptDetailService;

@Service
public class ReceiptDetailServiceImplement implements ReceiptDetailService{

	@Autowired
	private ReceiptDetailRepository receiptDetailRepository;
	@Autowired
	private ReceiptDetailConvert receiptDetailConvert;
	
	@Override
	public List<ReceiptDetailDTO> getAllReceiptDetail() {
		// TODO Auto-generated method stub
		List<ReceiptDetailDTO> receiptDetailDTOs = new ArrayList<ReceiptDetailDTO>();
		List<ReceiptDetail> receiptDetails = receiptDetailRepository.findAll();
		for (ReceiptDetail receiptDetail : receiptDetails) {
			receiptDetailDTOs.add(receiptDetailConvert.toDTO(receiptDetail));
		}
		return receiptDetailDTOs;
	}

	@Override
	public ReceiptDetailDTO save(ReceiptDetailDTO newDTO) {
		// TODO Auto-generated method stub
		ReceiptDetail newEntity = receiptDetailConvert.toEntity(newDTO);
		return receiptDetailConvert.toDTO(receiptDetailRepository.save(newEntity));
	}

}
