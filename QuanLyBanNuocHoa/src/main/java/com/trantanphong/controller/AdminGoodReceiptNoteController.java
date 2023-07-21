package com.trantanphong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.trantanphong.dto.GoodReceiptNoteDTO;
import com.trantanphong.service.GoodReceiptNoteService;

@RestController
public class AdminGoodReceiptNoteController {
	
	@Autowired
	private GoodReceiptNoteService goodReceiptNoteService;
	
	@GetMapping("/admin/receipt")
	public List<GoodReceiptNoteDTO> getAllReceiptAdmin(){
		return goodReceiptNoteService.getAllReceipt();
	}
	
	@PostMapping("/admin/receipt")
	public GoodReceiptNoteDTO addReceipt(@RequestBody GoodReceiptNoteDTO model) {
		return goodReceiptNoteService.save(model);
	}
	
	@PutMapping("/admin/receipt/{id}")
	public GoodReceiptNoteDTO updateReceipt(@RequestBody GoodReceiptNoteDTO mode, @PathVariable("id") long id) {
		return goodReceiptNoteService.save(mode);
	}
	
	@DeleteMapping("/admin/receipt/{id}")
	public void deleteReceipt(@PathVariable("id") long id) {
		goodReceiptNoteService.delete(id);
	}
	
}
