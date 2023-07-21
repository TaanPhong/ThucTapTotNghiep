package com.trantanphong.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "staff")
public class Staff {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	@Column(length = 50)
	private String firstyName;
	@Column(length = 20)
	private String lastName;
	@Column(nullable = false, length = 10, unique = true)
	private String numberPhone;
	@Column(length = 100)
	private String location;
	private String dayOfBirth;
	@Column(nullable = false, length = 12, unique = true)
	private String citizenID;
	private int status;
	
	@OneToMany(mappedBy = "staff")
	private List<GoodReceiptNote> goodReceiptNotes;
	
	@OneToMany(mappedBy = "staff")
	private List<TheOrder> theOrders;
	
	@ManyToMany(mappedBy = "staffs")
	private Set<Product> products;
	
	@OneToOne(mappedBy = "staff")
	private Account account;
	
	public Staff() {
		super();
	}
	public Staff(Long id, String firstyName, String lastName, String numberPhone, String location, String dayOfBirth,
			String citizenID, int status, Account account) {
		super();
		this.id = id;
		this.firstyName = firstyName;
		this.lastName = lastName;
		this.numberPhone = numberPhone;
		this.location = location;
		this.dayOfBirth = dayOfBirth;
		this.citizenID = citizenID;
		this.status = status;
		this.account = account;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstyName() {
		return firstyName;
	}
	public void setFirstyName(String firstyName) {
		this.firstyName = firstyName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
}
