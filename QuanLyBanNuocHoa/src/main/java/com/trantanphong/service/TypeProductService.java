package com.trantanphong.service;

import java.util.List;

import com.trantanphong.dto.TypeProductDTO;

public interface TypeProductService {
	List<TypeProductDTO> getAllTypeProduct();

	TypeProductDTO save(TypeProductDTO newDTO);

	void delete(Long id);
}
