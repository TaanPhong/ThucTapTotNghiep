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
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "goodReceiptNote")
public class GoodReceiptNote {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	private String dateFound;
	private Long totalMoney;
	
	@ManyToOne
	@JoinColumn(name = "supplier_id")
	@JsonManagedReference
	private Supplier supplier;
	
	@ManyToOne
	@JoinColumn(name = "staff_id")
	@JsonManagedReference
	private Staff staff;

	@ManyToMany(mappedBy = "goodReceiptNotes")
	private Set<Product> products;
	
	public GoodReceiptNote() {
		super();
	}

	public GoodReceiptNote(Long id, String dateFound, Long totalMoney, Supplier supplier, Staff staff) {
		super();
		this.id = id;
		this.dateFound = dateFound;
		this.totalMoney = totalMoney;
		this.supplier = supplier;
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

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

}
