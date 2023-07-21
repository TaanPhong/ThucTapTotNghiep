package com.trantanphong.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "historyPrice")
public class HistoryPrice {
	@EmbeddedId
	private HistoryPriceKey id;

	@ManyToOne
	@MapsId("staffId")
	@JoinColumn(name = "staff_id")
	private Staff staff;

	@ManyToOne
	@MapsId("productId")
	@JoinColumn(name = "product_id")
	private Product product;

	private String dateEnd;
	private int price;

	public HistoryPriceKey getId() {
		return id;
	}

	public void setId(HistoryPriceKey id) {
		this.id = id;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(String dateEnd) {
		this.dateEnd = dateEnd;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public HistoryPrice(HistoryPriceKey id, Staff staff, Product product, String dateEnd, int price) {
		super();
		this.id = id;
		this.staff = staff;
		this.product = product;
		this.dateEnd = dateEnd;
		this.price = price;
	}

	public HistoryPrice() {
		super();
	}

}
