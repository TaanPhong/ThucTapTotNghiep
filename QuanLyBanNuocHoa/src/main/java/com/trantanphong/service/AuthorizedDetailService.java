package com.trantanphong.service;

import java.util.List;

import com.trantanphong.dto.AuthorizedDetailDTO;
import com.trantanphong.entity.AuthorizedDetail;

public interface AuthorizedDetailService {
	List<AuthorizedDetailDTO> getAllAuthorizedDetails();
	AuthorizedDetailDTO save(AuthorizedDetailDTO newDTO);
	//void delete()
}
