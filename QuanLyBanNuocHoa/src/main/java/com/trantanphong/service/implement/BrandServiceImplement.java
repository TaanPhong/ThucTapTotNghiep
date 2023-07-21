package com.trantanphong.service.implement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trantanphong.convert.BrandConvent;
import com.trantanphong.dto.BrandDTO;
import com.trantanphong.entity.Brand;
import com.trantanphong.repository.BrandRepository;
import com.trantanphong.service.BrandService;

@Service
public class BrandServiceImplement implements BrandService{

	
	@Autowired
	private BrandRepository brandRepository;
	
	@Autowired
	private BrandConvent brandConvent;
	
	@Override
	public BrandDTO save(BrandDTO brandDTO) {
		Brand newEntity = brandConvent.toEntity(brandDTO);
		return brandConvent.toDTO(brandRepository.save(newEntity));
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		brandRepository.deleteById(id);
	}

	@Override
	public List<BrandDTO> brandDTOs() {
		List<Brand> brands = brandRepository.findAll();
		List<BrandDTO> brandDTOs = new ArrayList<BrandDTO>();
		for (Brand brand : brands) {
			brandDTOs.add(brandConvent.toDTO(brand));
		}
		return brandDTOs;
	}

}
