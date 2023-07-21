package com.trantanphong.dto;

public class ProductDTO {
	private Long id;
	private String nameProduct;
	private int status;
	private int numberOf;
	private String nameType;
	private String nameBrand;
	private String description;

	public ProductDTO(Long id, String nameProduct, int status, int numberOf, String nameType, String nameBrand,
			String description) {
		super();
		this.id = id;
		this.nameProduct = nameProduct;
		this.status = status;
		this.numberOf = numberOf;
		this.nameType = nameType;
		this.nameBrand = nameBrand;
		this.description = description;
	}

	public ProductDTO() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getNumberOf() {
		return numberOf;
	}

	public void setNumberOf(int numberOf) {
		this.numberOf = numberOf;
	}

	public String getNameType() {
		return nameType;
	}

	public void setNameType(String nameType) {
		this.nameType = nameType;
	}

	public String getNameBrand() {
		return nameBrand;
	}

	public void setNameBrand(String nameBrand) {
		this.nameBrand = nameBrand;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
