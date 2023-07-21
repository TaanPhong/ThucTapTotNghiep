package com.trantanphong.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "decentralization")
public class Decentralization {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 100, nullable = false, unique = true)
	private String authorizedName;

	@ManyToMany(mappedBy = "decentralizations")
	private Set<Account> accounts;
	
	public Decentralization() {
		super();
	}

	public Decentralization(Long id, String authorizedName) {
		super();
		this.id = id;
		this.authorizedName = authorizedName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAuthorizedName() {
		return authorizedName;
	}

	public void setAuthorizedName(String authorizedName) {
		this.authorizedName = authorizedName;
	}
}
