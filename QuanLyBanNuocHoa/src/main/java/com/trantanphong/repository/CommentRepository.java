package com.trantanphong.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trantanphong.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long>{

}
