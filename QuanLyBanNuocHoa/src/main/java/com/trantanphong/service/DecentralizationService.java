package com.trantanphong.service;

import java.util.List;

import com.trantanphong.dto.DecentralizationDTO;
import com.trantanphong.entity.Decentralization;

public interface DecentralizationService {
	List<DecentralizationDTO> getAllDecentralizationDTOs();
	DecentralizationDTO save(DecentralizationDTO newDTO);
}
