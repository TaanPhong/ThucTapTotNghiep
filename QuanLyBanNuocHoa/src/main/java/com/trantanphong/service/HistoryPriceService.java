package com.trantanphong.service;

import java.util.List;

import com.trantanphong.dto.HistoryPriceDTO;

public interface HistoryPriceService {
	List<HistoryPriceDTO> getAllHistoryPrice();
	HistoryPriceDTO save(HistoryPriceDTO newDTO);
	
}
