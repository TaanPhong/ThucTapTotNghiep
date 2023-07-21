package com.trantanphong.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trantanphong.entity.PromotionDetail;
import com.trantanphong.entity.PromotionDetailKey;

public interface PromotionDetailRepository extends JpaRepository<PromotionDetail, PromotionDetailKey>{

}
