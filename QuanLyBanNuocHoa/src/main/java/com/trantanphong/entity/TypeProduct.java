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
@Table(name = "typeProduct")
public class TypeProduct {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 100, nullable = false, unique = true)
	private String nameType;

	@OneToMany(mappedBy = "typeProduct")
	private List<Product> lisProducts;

	public TypeProduct() {
		super();
	}

	public TypeProduct(Long id, String nameType, List<Product> lisProducts) {
		super();
		this.id = id;
		this.nameType = nameType;
		this.lisProducts = lisProducts;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameType() {
		return nameType;
	}

	public void setNameType(String nameType) {
		this.nameType = nameType;
	}

	public List<Product> getLisProducts() {
		return lisProducts;
	}

	public void setLisProducts(List<Product> lisProducts) {
		this.lisProducts = lisProducts;
	}

}
