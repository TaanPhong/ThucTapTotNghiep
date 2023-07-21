package com.trantanphong.dto;

public class TypeProductDTO {
	private Long id;
	private String nameType;

	public TypeProductDTO() {
		super();
	}

	public TypeProductDTO(Long id, String nameType) {
		super();
		this.id = id;
		this.nameType = nameType;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameType() {
		return nameType;
	}

	public void setNameType(String nameType) {
		this.nameType = nameType;
	}

}
