package com.trantanphong.service;

import java.util.List;

import com.trantanphong.dto.GoodReceiptNoteDTO;

public interface GoodReceiptNoteService {
	List<GoodReceiptNoteDTO> getAllReceipt();
	GoodReceiptNoteDTO save(GoodReceiptNoteDTO newDTO);
	void delete(Long id);
}
