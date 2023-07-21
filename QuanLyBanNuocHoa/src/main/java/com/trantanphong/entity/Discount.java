package com.trantanphong.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "discount")
public class Discount {
	@EmbeddedId
	private DiscountKey id;

	@ManyToOne
	@MapsId("productId")
	@JoinColumn(name = "product_id")
	private Product product;

	@ManyToOne
	@MapsId("customerTypeId")
	@JoinColumn(name = "customerType_id")
	private CustomerType customerTypeId;

	private String dateEnd;
	private int present;

	public Discount(DiscountKey id, Product product, CustomerType customerTypeId, String dateEnd, int present) {
		super();
		this.id = id;
		this.product = product;
		this.customerTypeId = customerTypeId;
		this.dateEnd = dateEnd;
		this.present = present;
	}

	public Discount() {
		super();
	}

	public int getPresent() {
		return present;
	}

	public void setPresent(int present) {
		this.present = present;
	}

	public DiscountKey getId() {
		return id;
	}

	public void setId(DiscountKey id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public CustomerType getCustomerTypeId() {
		return customerTypeId;
	}

	public void setCustomerTypeId(CustomerType customerTypeId) {
		this.customerTypeId = customerTypeId;
	}

	public String getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(String dateEnd) {
		this.dateEnd = dateEnd;
	}

}
