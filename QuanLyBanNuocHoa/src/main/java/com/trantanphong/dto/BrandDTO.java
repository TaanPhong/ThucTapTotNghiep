package com.trantanphong.dto;

public class BrandDTO {
	private Long id;
	private String nameBrand;

	public BrandDTO() {
		super();
	}

	public BrandDTO(Long id, String nameBrand) {
		super();
		this.id = id;
		this.nameBrand = nameBrand;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameBrand() {
		return nameBrand;
	}

	public void setNameBrand(String nameBrand) {
		this.nameBrand = nameBrand;
	}

}
