package com.trantanphong.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class Account {
	@Id
	@Column(length = 50)
	private String userName;
	@Column(nullable = false)
	private String password;
	private String avatar;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_id", referencedColumnName = "id")
	private Customer customer;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "staff_id", referencedColumnName = "id")
	private Staff staff;

	@ManyToMany
	@JoinTable(name = "authorizedDetail", 
	joinColumns = @JoinColumn(name = "usename"), 
	inverseJoinColumns = @JoinColumn(name = "decentralization_id"))
	private Set<Decentralization> decentralizations;
	
	public Account() {
		super();
	}

	public Account(String userName, String password, String avatar, Customer customer, Staff staff) {
		super();
		this.userName = userName;
		this.password = password;
		this.avatar = avatar;
		this.customer = customer;
		this.staff = staff;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

}
