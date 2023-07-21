package com.trantanphong.dto;

import javax.persistence.Column;

public class SupplierDTO {
	private Long id;
	private String nameSupplier;
	private String location;
	private String locationWebsite;
	private String numberPhone;
	private String email;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameSupplier() {
		return nameSupplier;
	}

	public void setNameSupplier(String nameSupplier) {
		this.nameSupplier = nameSupplier;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLocationWebsite() {
		return locationWebsite;
	}

	public void setLocationWebsite(String locationWebsite) {
		this.locationWebsite = locationWebsite;
	}

	public String getNumberPhone() {
		return numberPhone;
	}

	public void setNumberPhone(String numberPhone) {
		this.numberPhone = numberPhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public SupplierDTO(Long id, String nameSupplier, String location, String locationWebsite, String numberPhone,
			String email) {
		super();
		this.id = id;
		this.nameSupplier = nameSupplier;
		this.location = location;
		this.locationWebsite = locationWebsite;
		this.numberPhone = numberPhone;
		this.email = email;
	}

	public SupplierDTO() {
		super();
	}

}
