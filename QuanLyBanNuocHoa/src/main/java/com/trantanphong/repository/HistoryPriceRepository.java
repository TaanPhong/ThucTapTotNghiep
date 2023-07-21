package com.trantanphong.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trantanphong.entity.HistoryPrice;
import com.trantanphong.entity.HistoryPriceKey;

public interface HistoryPriceRepository extends JpaRepository<HistoryPrice, HistoryPriceKey>{

}
