package com.trantanphong.service.implement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trantanphong.convert.DecentralizationConvert;
import com.trantanphong.dto.DecentralizationDTO;
import com.trantanphong.entity.Decentralization;
import com.trantanphong.repository.DecentralizationRepository;
import com.trantanphong.service.DecentralizationService;

@Service
public class DecentralizationServiceImplement implements DecentralizationService {

	@Autowired
	private DecentralizationRepository decentralizationRepository;
	@Autowired
	private DecentralizationConvert decentralizationConvert;

	@Override
	public List<DecentralizationDTO> getAllDecentralizationDTOs() {
		List<DecentralizationDTO> decentralizationDTOs = new ArrayList<DecentralizationDTO>();
		List<Decentralization> decentralizationcs = decentralizationRepository.findAll();
		for (Decentralization decentralization : decentralizationcs) {
			decentralizationDTOs.add(decentralizationConvert.toDTO(decentralization));
		}
		return decentralizationDTOs;
	}

	@Override
	public DecentralizationDTO save(DecentralizationDTO newDTO) {
		// TODO Auto-generated method stub
		Decentralization newEntity = decentralizationConvert.toEntity(newDTO);
		return decentralizationConvert.toDTO(decentralizationRepository.save(newEntity));
	}

}
