package com.trantanphong.service;

import java.util.List;

import com.trantanphong.dto.PictureProductDTO;

public interface PrictureProductService {
	List<PictureProductDTO> getAllPictureProduct();
	PictureProductDTO save(PictureProductDTO newDTO);
	void delete(Long id);
}
