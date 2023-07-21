package com.trantanphong.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trantanphong.entity.Brand;

public interface BrandRepository extends JpaRepository<Brand, Long>{
	Brand findByNameBrand(String nameBrand);
}
