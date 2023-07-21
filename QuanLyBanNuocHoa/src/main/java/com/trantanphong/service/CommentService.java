package com.trantanphong.service;

import java.util.List;

import com.trantanphong.dto.CommentDTO;

public interface CommentService {
	List<CommentDTO> getAllCComment();
	CommentDTO save(CommentDTO newDTO);
	void delete(Long id);
}
