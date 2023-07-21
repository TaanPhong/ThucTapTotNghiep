package com.trantanphong.service;

import java.util.List;

import com.trantanphong.dto.ReceiptDetailDTO;

public interface ReceiptDetailService {
	List<ReceiptDetailDTO> getAllReceiptDetail();
	ReceiptDetailDTO save(ReceiptDetailDTO newDTO);
}
