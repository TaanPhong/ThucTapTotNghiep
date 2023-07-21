package com.trantanphong.convert;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.trantanphong.dto.ProductDTO;
import com.trantanphong.entity.Brand;
import com.trantanphong.entity.Product;
import com.trantanphong.repository.BrandRepository;
import com.trantanphong.repository.TypeProductRepository;

@Component
public class ProductConvert {
	@Autowired
	private TypeProductRepository typeProductRepository;
	@Autowired
	private BrandRepository brandRepository;
	
	private org.slf4j.Logger logger = LoggerFactory.getLogger(ProductConvert.class);
	
	public Product toEntity(ProductDTO dto)
	{
		Product entity = new Product();
		entity.setId(dto.getId());
		entity.setNameProduct(dto.getNameProduct());
		entity.setStatus(dto.getStatus());
		entity.setNumber_of(0);
		entity.setDescription(dto.getDescription());
		//entity.setBrand(brandRepository.findByNameBrand());
		return entity;
	}
	
	public Product toEntity(ProductDTO dto, Product entity)
	{
		entity.setId(dto.getId());
		entity.setNameProduct(dto.getNameProduct());
		entity.setStatus(dto.getStatus());
		entity.setNumber_of(0);
		entity.setDescription(dto.getDescription());
		//entity.setBrand(brandRepository.findByNameBrand());
		return entity;
	}
	
	public ProductDTO toDTO(Product entity) {
		ProductDTO dto = new ProductDTO();
		if(entity.getId() != null)
		{
			dto.setId(entity.getId());
		}
		dto.setDescription(entity.getDescription());
		dto.setNameBrand(entity.getBrand().getNameBrand());
		dto.setNameProduct(entity.getNameProduct());
		dto.setNameType(entity.getTypeProduct().getNameType());
		dto.setNumberOf(entity.getNumber_of());
		dto.setStatus(entity.getStatus());
		logger.info(dto.toString());
		return dto;
	}
	
}
