package com.trantanphong.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trantanphong.entity.AuthorizedDetail;
import com.trantanphong.entity.AuthorizedDetailKey;

public interface AuthorizedDetailRepository extends JpaRepository<AuthorizedDetail, AuthorizedDetailKey>{

}
