package com.trantanphong.service;

import java.util.List;

import com.trantanphong.dto.BrandDTO;

public interface BrandService {
	BrandDTO save(BrandDTO brandDTO);
	void delete(Long id);
	List<BrandDTO> brandDTOs();
}
