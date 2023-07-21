package com.trantanphong.service.implement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trantanphong.convert.HistoryPriceConvent;
import com.trantanphong.dto.HistoryPriceDTO;
import com.trantanphong.entity.HistoryPrice;
import com.trantanphong.repository.HistoryPriceRepository;
import com.trantanphong.service.HistoryPriceService;

@Service
public class HistoryPriceServiceImplement implements HistoryPriceService {

	@Autowired
	private HistoryPriceRepository historyPriceRepository;
	@Autowired
	private HistoryPriceConvent historyPriceConvent;

	@Override
	public List<HistoryPriceDTO> getAllHistoryPrice() {
		// TODO Auto-generated method stub
		List<HistoryPriceDTO> historyPriceDTOs = new ArrayList<HistoryPriceDTO>();
		List<HistoryPrice> historyPrices = historyPriceRepository.findAll();
		for (HistoryPrice historyPrice : historyPrices) {
			historyPriceDTOs.add(historyPriceConvent.toDTO(historyPrice));
		}
		return historyPriceDTOs;
	}

	@Override
	public HistoryPriceDTO save(HistoryPriceDTO newDTO) {
		// TODO Auto-generated method stub
		HistoryPrice newEntity = historyPriceConvent.toEntity(newDTO);
		return historyPriceConvent.toDTO(historyPriceRepository.save(newEntity));
	}

}
