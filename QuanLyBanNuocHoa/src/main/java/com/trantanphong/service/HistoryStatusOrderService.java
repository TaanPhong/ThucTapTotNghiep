package com.trantanphong.service;

import java.util.List;

import com.trantanphong.dto.HistoryStatusOrderDTO;

public interface HistoryStatusOrderService {
	List<HistoryStatusOrderDTO> getAllHistoryStatus();
	HistoryStatusOrderDTO save(HistoryStatusOrderDTO newDto);
}
