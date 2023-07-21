package com.trantanphong.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "supplier")
public class Supplier {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 100, nullable = false, unique = true)
	private String nameSupplier;
	@Column(nullable = false)
	private String location;
	@Column(nullable = false, unique = true)
	private String locationWebsite;
	@Column(length = 10, nullable = false, unique = true)
	private String numberPhone;
	@Column(length = 100, nullable = false, unique = true)
	private String email;

	@OneToMany(mappedBy = "supplier")
	private List<GoodReceiptNote> lisGoodReceiptNotes;

	public Supplier() {
		super();
	}

	public Supplier(Long id, String nameSupplier, String location, String locationWebsite, String numberPhone,
			String email) {
		super();
		this.id = id;
		this.nameSupplier = nameSupplier;
		this.location = location;
		this.locationWebsite = locationWebsite;
		this.numberPhone = numberPhone;
		this.email = email;
	}

	public Supplier(Long id, String nameSupplier, String location, String locationWebsite, String numberPhone,
			String email, List<GoodReceiptNote> lisGoodReceiptNotes) {
		super();
		this.id = id;
		this.nameSupplier = nameSupplier;
		this.location = location;
		this.locationWebsite = locationWebsite;
		this.numberPhone = numberPhone;
		this.email = email;
		this.lisGoodReceiptNotes = lisGoodReceiptNotes;
	}

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

}
