package com.trantanphong.service.implement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trantanphong.convert.CommentConvert;
import com.trantanphong.dto.CommentDTO;
import com.trantanphong.entity.Comment;
import com.trantanphong.repository.CommentRepository;
import com.trantanphong.service.CommentService;

@Service
public class CommentServiceImplement implements CommentService{

	@Autowired
	private CommentRepository commentRepository;
	
	@Autowired
	private CommentConvert commentConvert;
	
	@Override
	public List<CommentDTO> getAllCComment() {
		List<Comment> comments = commentRepository.findAll();
		List<CommentDTO> commentDTOs = new ArrayList<CommentDTO>();
		for (Comment comment : comments) {
			commentDTOs.add(commentConvert.toDTO(comment));
		}
		return commentDTOs;
	}

	@Override
	public CommentDTO save(CommentDTO newDTO) {
		// TODO Auto-generated method stub
		Comment comment = commentConvert.toEntity(newDTO);
		return commentConvert.toDTO(commentRepository.save(comment));
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		commentRepository.deleteById(id);
	}

}
