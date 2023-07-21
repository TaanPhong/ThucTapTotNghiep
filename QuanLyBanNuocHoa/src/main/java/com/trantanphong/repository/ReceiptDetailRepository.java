package com.trantanphong.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trantanphong.entity.ReceiptDetail;
import com.trantanphong.entity.ReceiptDetailKey;

public interface ReceiptDetailRepository extends JpaRepository<ReceiptDetail, ReceiptDetailKey>{

}
