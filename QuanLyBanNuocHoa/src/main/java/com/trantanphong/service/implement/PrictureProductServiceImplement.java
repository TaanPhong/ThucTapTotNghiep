package com.trantanphong.service.implement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trantanphong.convert.PrictureProductConvert;
import com.trantanphong.dto.PictureProductDTO;
import com.trantanphong.entity.PictureProduct;
import com.trantanphong.repository.PrictureProductRepository;
import com.trantanphong.service.PrictureProductService;

@Service
public class PrictureProductServiceImplement implements PrictureProductService{

	@Autowired
	private PrictureProductRepository prictureProductRepository;
	
	@Autowired
	private PrictureProductConvert prictureProductConvert;
	
	@Override
	public List<PictureProductDTO> getAllPictureProduct() {
		// TODO Auto-generated method stub
		List<PictureProductDTO> pictureProductDTOs = new ArrayList<PictureProductDTO>();
		List<PictureProduct> pictureProducts = prictureProductRepository.findAll();
		for (PictureProduct pictureProduct : pictureProducts) {
			pictureProductDTOs.add(prictureProductConvert.toDTO(pictureProduct));
		}
		return pictureProductDTOs;
	}

	@Override
	public PictureProductDTO save(PictureProductDTO newDTO) {
		// TODO Auto-generated method stub
		PictureProduct newEntity = prictureProductConvert.toEntity(newDTO);
		return prictureProductConvert.toDTO(prictureProductRepository.save(newEntity));
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		prictureProductRepository.deleteById(id);
		
	}

}
