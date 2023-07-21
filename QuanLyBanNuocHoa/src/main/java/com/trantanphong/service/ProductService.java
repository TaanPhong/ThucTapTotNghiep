package com.trantanphong.service;

import java.util.List;

import com.trantanphong.dto.ProductDTO;

public interface ProductService {
	List<ProductDTO> getAllProduct();
	ProductDTO save(ProductDTO newDTO);
	void delete(Long id);
	ProductDTO findByID(Long id);
	List<ProductDTO> getProductByTypeCode(String name);
}
