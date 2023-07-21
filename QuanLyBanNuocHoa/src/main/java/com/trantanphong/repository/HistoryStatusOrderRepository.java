package com.trantanphong.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trantanphong.entity.HistoryStatusOrder;
import com.trantanphong.entity.HistoryStatusOrderKey;

public interface HistoryStatusOrderRepository extends JpaRepository<HistoryStatusOrder, HistoryStatusOrderKey>{

}
