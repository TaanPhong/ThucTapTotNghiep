package com.trantanphong.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "comment")
public class Comment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String dateComment;
	private String content;
	private int numberOfStart;

	@ManyToOne
	@JoinColumn(name = "product_id")
	@JsonManagedReference
	private Product product;

	@ManyToOne
	@JoinColumn(name = "customer_id")
	@JsonManagedReference
	private Customer customer;

	public Comment() {
		super();
	}

	public Comment(Long id, String dateComment, String content, int numberOfStart, Product product, Customer customer) {
		super();
		this.id = id;
		this.dateComment = dateComment;
		this.numberOfStart = numberOfStart;
		this.product = product;
		this.customer = customer;
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDateComment() {
		return dateComment;
	}

	public void setDateComment(String dateComment) {
		this.dateComment = dateComment;
	}

	public int getNumberOfStart() {
		return numberOfStart;
	}

	public void setNumberOfStart(int numberOfStart) {
		this.numberOfStart = numberOfStart;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
