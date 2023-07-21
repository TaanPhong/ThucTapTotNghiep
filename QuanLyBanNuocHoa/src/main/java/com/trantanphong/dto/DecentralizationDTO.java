package com.trantanphong.dto;

public class DecentralizationDTO {
	private Long id;
	private String authorizedName;

	public DecentralizationDTO(Long id, String authorizedName) {
		super();
		this.id = id;
		this.authorizedName = authorizedName;
	}

	public DecentralizationDTO() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAuthorizedName() {
		return authorizedName;
	}

	public void setAuthorizedName(String authorizedName) {
		this.authorizedName = authorizedName;
	}

}
