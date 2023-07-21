package com.trantanphong.dto;

import javax.persistence.Column;

public class StaffDTO {
	private Long id;
	private String firstName;
	private String lastName;
	private String fullName;
	private String numberPhone;
	private String location;
	private String dayOfBirth;
	private String citizenID;
	private int status;

	public StaffDTO(Long id, String firstyName, String lastName, String numberPhone, String location, String dayOfBirth,
			String citizenID, int status) {
		super();
		this.id = id;
		this.firstName = firstyName;
		this.lastName = lastName;
		this.numberPhone = numberPhone;
		this.location = location;
		this.dayOfBirth = dayOfBirth;
		this.citizenID = citizenID;
		this.status = status;
	}

	public StaffDTO(Long id, String firstyName, String lastName, String fullName, String numberPhone, String location,
			String dayOfBirth, String citizenID, int status) {
		super();
		this.id = id;
		this.firstName = firstyName;
		this.lastName = lastName;
		this.fullName = fullName;
		this.numberPhone = numberPhone;
		this.location = location;
		this.dayOfBirth = dayOfBirth;
		this.citizenID = citizenID;
		this.status = status;
	}

	public StaffDTO() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstyName(String firstyName) {
		this.firstName = firstyName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getNumberPhone() {
		return numberPhone;
	}

	public void setNumberPhone(String numberPhone) {
		this.numberPhone = numberPhone;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDayOfBirth() {
		return dayOfBirth;
	}

	public void setDayOfBirth(String dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}

	public String getCitizenID() {
		return citizenID;
	}

	public void setCitizenID(String citizenID) {
		this.citizenID = citizenID;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
