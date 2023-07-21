package com.trantanphong.dto;

public class StatusOrderDTO {
	private Long id;
	private String nameStatus;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameStatus() {
		return nameStatus;
	}

	public void setNameStatus(String nameStatus) {
		this.nameStatus = nameStatus;
	}

	public StatusOrderDTO(Long id, String nameStatus) {
		super();
		this.id = id;
		this.nameStatus = nameStatus;
	}

	public StatusOrderDTO() {
		super();
	}

}
