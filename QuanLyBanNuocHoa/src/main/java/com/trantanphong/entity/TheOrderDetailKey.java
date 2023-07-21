package com.trantanphong.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TheOrderDetailKey implements Serializable{
	@Column(name = "theOrder_id")
	private Long theOrderId;

	@Column(name = "product_id")
	private Long productId;

	public Long getTheOrderId() {
		return theOrderId;
	}

	public void setTheOrderId(Long theOrderId) {
		this.theOrderId = theOrderId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public TheOrderDetailKey(Long theOrderId, Long productId) {
		super();
		this.theOrderId = theOrderId;
		this.productId = productId;
	}

	public TheOrderDetailKey() {
		super();
	}

}
