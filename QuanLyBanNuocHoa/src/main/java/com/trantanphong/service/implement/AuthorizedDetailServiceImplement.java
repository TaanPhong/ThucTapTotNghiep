package com.trantanphong.service.implement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trantanphong.convert.AuthorizedDetailConvert;
import com.trantanphong.dto.AuthorizedDetailDTO;
import com.trantanphong.entity.AuthorizedDetail;
import com.trantanphong.repository.AuthorizedDetailRepository;
import com.trantanphong.service.AuthorizedDetailService;

@Service
public class AuthorizedDetailServiceImplement implements AuthorizedDetailService{

	@Autowired
	private AuthorizedDetailRepository authorizedDetailRepository;
	@Autowired
	private AuthorizedDetailConvert authorizedDetailConvert;
	
	@Override
	public List<AuthorizedDetailDTO> getAllAuthorizedDetails() {
		// TODO Auto-generated method stub
		List<AuthorizedDetailDTO> authorizedDetailDTOs = new ArrayList<AuthorizedDetailDTO>();
		List<AuthorizedDetail> authorizedDetails = authorizedDetailRepository.findAll();
		for (AuthorizedDetail authorizedDetail : authorizedDetails) {
			authorizedDetailDTOs.add(authorizedDetailConvert.toDTO(authorizedDetail));
		}
		return authorizedDetailDTOs;
	}

	@Override
	public AuthorizedDetailDTO save(AuthorizedDetailDTO newDTO) {
		// TODO Auto-generated method stub
		AuthorizedDetail newEntity = authorizedDetailConvert.toEntity(newDTO);
		return authorizedDetailConvert.toDTO(authorizedDetailRepository.save(newEntity));
	}
	
}
