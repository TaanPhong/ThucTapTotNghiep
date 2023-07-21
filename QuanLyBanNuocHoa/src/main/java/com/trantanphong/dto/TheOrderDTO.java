package com.trantanphong.dto;

import javax.persistence.Column;

public class TheOrderDTO {
	private Long id;
	private String dateFound;
	private long totalMoney;
	private String location;
	private String numberPhone;

	public TheOrderDTO(Long id, String dateFound, long totalMoney, String location, String numberPhone) {
		super();
		this.id = id;
		this.dateFound = dateFound;
		this.totalMoney = totalMoney;
		this.location = location;
		this.numberPhone = numberPhone;
	}

	public TheOrderDTO() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDateFound() {
		return dateFound;
	}

	public void setDateFound(String dateFound) {
		this.dateFound = dateFound;
	}

	public long getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(long totalMoney) {
		this.totalMoney = totalMoney;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getNumberPhone() {
		return numberPhone;
	}

	public void setNumberPhone(String numberPhone) {
		this.numberPhone = numberPhone;
	}

}
