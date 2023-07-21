package com.trantanphong.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trantanphong.entity.TheOrderDetail;
import com.trantanphong.entity.TheOrderDetailKey;

public interface TheOrderDetailReposiotry extends JpaRepository<TheOrderDetail, TheOrderDetailKey>{

}
