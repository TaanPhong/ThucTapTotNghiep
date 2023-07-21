package com.trantanphong.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class DiscountKey implements Serializable{
	@Column(name = "customerType_id")
	private Long customerTypeId;

	@Column(name = "product_id")
	private Long productId;

	@Column(name = "dateStart")
	private String dateStart;

	public DiscountKey(Long customerTypeId, Long productId, String dataStart) {
		super();
		this.customerTypeId = customerTypeId;
		this.productId = productId;
		this.dateStart = dataStart;
	}

	public DiscountKey() {
		super();
	}

	public String getDateStart() {
		return dateStart;
	}

	public void setDateStart(String dateStart) {
		this.dateStart = dateStart;
	}

	public Long getCustomerTypeId() {
		return customerTypeId;
	}

	public void setCustomerTypeId(Long customerTypeId) {
		this.customerTypeId = customerTypeId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

}
