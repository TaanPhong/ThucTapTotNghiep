package com.trantanphong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.trantanphong.dto.HistoryPriceDTO;
import com.trantanphong.service.HistoryPriceService;

@RestController
public class AdminHistoryPriceController {
	
	@Autowired
	private HistoryPriceService historyPriceService;
	
	@GetMapping("/admin/historyprice")
	public List<HistoryPriceDTO> getAllHistoryPriceAdmin(){
		return historyPriceService.getAllHistoryPrice();
	}
	
	@PostMapping("admin/historyprice")
	public HistoryPriceDTO addHistoryPrice(@RequestBody HistoryPriceDTO model) {
		return historyPriceService.save(model);
	}
	
	@PutMapping("/admin/historyprice/{id}")
	public HistoryPriceDTO updateHistoryPirce(@RequestBody HistoryPriceDTO model)
	{
		return historyPriceService.save(model);
	}
	
}
