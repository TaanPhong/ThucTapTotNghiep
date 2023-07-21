package com.trantanphong.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "theOrderDetail")
public class TheOrderDetail {
	@EmbeddedId
	private TheOrderDetailKey id;

	@ManyToOne
	@MapsId("theOrderId")
	@JoinColumn(name = "theOrder_id")
	private TheOrder theOrder;

	@ManyToOne
	@MapsId("productId")
	@JoinColumn(name = "product_id")
	private Product product;

	private int numberOf;
	private int price;

	public TheOrderDetailKey getId() {
		return id;
	}

	public void setId(TheOrderDetailKey id) {
		this.id = id;
	}

	public TheOrder getTheOrder() {
		return theOrder;
	}

	public void setTheOrder(TheOrder theOrder) {
		this.theOrder = theOrder;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getNumberOf() {
		return numberOf;
	}

	public void setNumberOf(int numberOf) {
		this.numberOf = numberOf;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public TheOrderDetail(TheOrderDetailKey id, TheOrder theOrder, Product product, int numberOf, int price) {
		super();
		this.id = id;
		this.theOrder = theOrder;
		this.product = product;
		this.numberOf = numberOf;
		this.price = price;
	}

	public TheOrderDetail() {
		super();
	}

}
