package com.trantanphong.dto;

import javax.persistence.Column;

public class CustomerTypeDTO {
	private Long id;
	private String nameType;

	public CustomerTypeDTO() {
		super();
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
