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
@Table(name = "brand")
public class Brand {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 100, nullable = false, unique = true)
	private String nameBrand;

	@OneToMany(mappedBy = "brand")
	private List<Product> lisProducts;

	public Brand() {
		super();
	}

	public Brand(Long id, String nameBrand, List<Product> lisProducts) {
		super();
		this.id = id;
		this.nameBrand = nameBrand;
		this.lisProducts = lisProducts;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameBrand() {
		return nameBrand;
	}

	public void setNameBrand(String nameBrand) {
		this.nameBrand = nameBrand;
	}

	public List<Product> getLisProducts() {
		return lisProducts;
	}

	public void setLisProducts(List<Product> lisProducts) {
		this.lisProducts = lisProducts;
	}

}
