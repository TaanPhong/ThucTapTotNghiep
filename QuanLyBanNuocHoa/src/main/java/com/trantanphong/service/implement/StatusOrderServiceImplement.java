package com.trantanphong.service.implement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trantanphong.convert.StatusOrderConvert;
import com.trantanphong.dto.StatusOrderDTO;
import com.trantanphong.entity.StatusOrder;
import com.trantanphong.repository.StatusOrderRepository;
import com.trantanphong.service.StatusOrderService;

@Service
public class StatusOrderServiceImplement implements StatusOrderService{

	@Autowired
	private StatusOrderRepository statusOrderRepository;
	@Autowired
	private StatusOrderConvert statusOrderConvert;
	
	@Override
	public List<StatusOrderDTO> getAllStatus() {
		// TODO Auto-generated method stub
		List<StatusOrderDTO> statusOrderDTOs = new ArrayList<StatusOrderDTO>();
		List<StatusOrder> statusOrders = statusOrderRepository.findAll();
		for (StatusOrder statusOrder : statusOrders) {
			statusOrderDTOs.add(statusOrderConvert.toDTO(statusOrder));
		}
		return statusOrderDTOs;
	}

	@Override
	public StatusOrderDTO save(StatusOrderDTO newDto) {
		// TODO Auto-generated method stub
		StatusOrder newEntity = statusOrderConvert.toEntity(newDto);
		return statusOrderConvert.toDTO(statusOrderRepository.save(newEntity));
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		statusOrderRepository.deleteById(id);
		
	}

}
