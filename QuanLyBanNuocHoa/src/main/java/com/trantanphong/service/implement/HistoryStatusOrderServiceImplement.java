package com.trantanphong.service.implement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trantanphong.convert.HistoryStatusOrderConvert;
import com.trantanphong.dto.HistoryStatusOrderDTO;
import com.trantanphong.entity.HistoryStatusOrder;
import com.trantanphong.repository.HistoryStatusOrderRepository;
import com.trantanphong.service.HistoryStatusOrderService;

@Service
public class HistoryStatusOrderServiceImplement implements HistoryStatusOrderService{

	@Autowired
	private HistoryStatusOrderRepository historyStatusOrderRepository;
	
	@Autowired
	private HistoryStatusOrderConvert historyStatusOrderConvert;
	
	@Override
	public List<HistoryStatusOrderDTO> getAllHistoryStatus() {
		// TODO Auto-generated method stub
		List<HistoryStatusOrderDTO> historyStatusOrderDTOs = new ArrayList<HistoryStatusOrderDTO>();
		List<HistoryStatusOrder> historyStatusOrders = historyStatusOrderRepository.findAll();
		for (HistoryStatusOrder historyStatusOrder : historyStatusOrders) {
			historyStatusOrderDTOs.add(historyStatusOrderConvert.toDTO(historyStatusOrder));
		}
		return historyStatusOrderDTOs;
	}

	@Override
	public HistoryStatusOrderDTO save(HistoryStatusOrderDTO newDto) {
		// TODO Auto-generated method stub
		HistoryStatusOrder newEntity = historyStatusOrderConvert.toEntity(newDto);
		return historyStatusOrderConvert.toDTO(historyStatusOrderRepository.save(newEntity));
	}

}
