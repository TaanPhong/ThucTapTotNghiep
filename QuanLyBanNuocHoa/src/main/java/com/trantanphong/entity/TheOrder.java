package com.trantanphong.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "theOrder")
public class TheOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	private String dateFound;
	private long totalMoney;
	@Column(nullable = false)
	private String location;
	@Column(nullable = false, length = 10)
	private String numberPhone;
	//private Customer customer;
	
	@ManyToOne
	@JoinColumn(name = "staff_id")
	@JsonManagedReference
	private Staff staff;
	
	@ManyToOne
	@JoinColumn(name = "customer_id")
	@JsonManagedReference
	private Customer customer;
	
	@ManyToMany(mappedBy = "orders")
	private Set<StatusOrder> statusOrders;

	@ManyToMany(mappedBy = "orders")
	private Set<Product> products;
	
	public TheOrder() {
		super();
	}

	public TheOrder(Long id, String dateFound, long totalMoney, String location, String numberPhone, Customer customer,
			Staff staff) {
		super();
		this.id = id;
		this.dateFound = dateFound;
		this.totalMoney = totalMoney;
		this.location = location;
		this.numberPhone = numberPhone;
		this.customer = customer;
		this.staff = staff;
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
