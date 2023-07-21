package com.trantanphong.service.implement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trantanphong.convert.TypeProductConvert;
import com.trantanphong.dto.TypeProductDTO;
import com.trantanphong.entity.TypeProduct;
import com.trantanphong.repository.TypeProductRepository;
import com.trantanphong.service.TypeProductService;

@Service
public class TypeProductServiceImplement implements TypeProductService{

	@Autowired
	private TypeProductRepository typeProductRepository;
	
	@Autowired
	private TypeProductConvert typeProductConvent;
	
	@Override
	public List<TypeProductDTO> getAllTypeProduct() {
		// TODO Auto-generated method stub
		List<TypeProduct> typeProducts = typeProductRepository.findAll();
		List<TypeProductDTO> typeProductDTOs = new ArrayList<TypeProductDTO>();
		for (TypeProduct typeProduct : typeProducts) {
			typeProductDTOs.add(typeProductConvent.toDTO(typeProduct));
		}
		return typeProductDTOs;
	}

	@Override
	public TypeProductDTO save(TypeProductDTO newDTO) {
		// TODO Auto-generated method stub
		TypeProduct newEntity = typeProductConvent.toEntity(newDTO);
		return typeProductConvent.toDTO(typeProductRepository.save(newEntity));
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		typeProductRepository.deleteById(id);
	}

}
