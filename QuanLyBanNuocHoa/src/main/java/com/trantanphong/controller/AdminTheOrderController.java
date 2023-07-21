package com.trantanphong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.trantanphong.entity.HistoryStatusOrder;
import com.trantanphong.service.HistoryStatusOrderService;
import com.trantanphong.service.TheOrderService;

@RestController
public class AdminTheOrderController {
	@Autowired
	private TheOrderService theOrderService;
	
	@Autowired
	private HistoryStatusOrderService historyStatusOrderService;
}
