package com.trantanphong.convert;

import org.springframework.stereotype.Component;

import com.trantanphong.dto.CommentDTO;
import com.trantanphong.entity.Comment;


@Component
public class CommentConvert {
	public Comment toEntity(CommentDTO dto) {
		Comment entity = new Comment();
		entity.setId(dto.getId());
		entity.setContent(dto.getContent());
		entity.setDateComment(dto.getDateComment());
		entity.setNumberOfStart(dto.getNumberOfStart());
		return entity;
	}
	public Comment toEntity(CommentDTO dto, Comment entity) {
		entity.setId(dto.getId());
		entity.setContent(dto.getContent());
		entity.setDateComment(dto.getDateComment());
		entity.setNumberOfStart(dto.getNumberOfStart());
		return entity;
	}
	public CommentDTO toDTO(Comment entity) {
		CommentDTO dto = new CommentDTO();
		dto.setId(entity.getId());
		dto.setContent(entity.getContent());
		dto.setDateComment(entity.getDateComment());
		dto.setNumberOfStart(entity.getNumberOfStart());
		return dto;
	}
}
