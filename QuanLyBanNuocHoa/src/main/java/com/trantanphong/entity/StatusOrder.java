package com.trantanphong.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "statusOrder")
public class StatusOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 100, nullable = false, unique = true)
	private String nameStatus;
	
	@ManyToMany
	@JoinTable(name = "historyStatusOrder", 
	joinColumns = @JoinColumn(name = "status_id"), 
	inverseJoinColumns = @JoinColumn(name = "theOrder_id"))
	private Set<TheOrder> orders;
	public StatusOrder() {
		super();
	}

	public StatusOrder(Long id, String nameStatus) {
		super();
		this.id = id;
		this.nameStatus = nameStatus;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameStatus() {
		return nameStatus;
	}

	public void setNameStatus(String nameStatus) {
		this.nameStatus = nameStatus;
	}

}
