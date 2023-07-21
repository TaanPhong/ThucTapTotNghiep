package com.trantanphong.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trantanphong.entity.Discount;
import com.trantanphong.entity.DiscountKey;

public interface DiscountRepository extends JpaRepository<Discount, DiscountKey>{

}
