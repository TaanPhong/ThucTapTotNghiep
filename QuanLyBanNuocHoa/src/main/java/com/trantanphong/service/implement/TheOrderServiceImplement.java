package com.trantanphong.service.implement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trantanphong.convert.TheOrderConvert;
import com.trantanphong.dto.TheOrderDTO;
import com.trantanphong.entity.TheOrder;
import com.trantanphong.repository.TheOrderRepository;
import com.trantanphong.service.TheOrderService;

@Service
public class TheOrderServiceImplement implements TheOrderService{

	@Autowired
	private TheOrderRepository theOrderRepository;
	@Autowired
	private TheOrderConvert theOrderConvert;
	
	@Override
	public List<TheOrderDTO> getAllTheOrder() {
		// TODO Auto-generated method stub
		List<TheOrderDTO> theOrderDTOs = new ArrayList<TheOrderDTO>();
		List<TheOrder> theOrders = theOrderRepository.findAll();
		for (TheOrder theOrder : theOrders) {
			theOrderDTOs.add(theOrderConvert.toDTO(theOrder));
		}
		return theOrderDTOs;
	}

	@Override
	public TheOrderDTO save(TheOrderDTO newDto) {
		// TODO Auto-generated method stub
		TheOrder newEntity = theOrderConvert.toEntity(newDto);
		return theOrderConvert.toDTO(theOrderRepository.save(newEntity));
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		theOrderRepository.deleteById(id);
	}

}
