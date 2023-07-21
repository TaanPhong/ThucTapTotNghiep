package com.trantanphong.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class HistoryPriceKey implements Serializable {
	@Column(name = "staff_id")
	private Long staffId;

	@Column(name = "product_id")
	private Long productId;

	@Column(name = "dateStart")
	private String dateStart;

	public Long getStaffId() {
		return staffId;
	}

	public void setStaffId(Long staffId) {
		this.staffId = staffId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getDateStart() {
		return dateStart;
	}

	public void setDateStart(String dateStart) {
		this.dateStart = dateStart;
	}

	public HistoryPriceKey(Long staffId, Long productId, String dateStart) {
		super();
		this.staffId = staffId;
		this.productId = productId;
		this.dateStart = dateStart;
	}

	public HistoryPriceKey() {
		super();
	}

}
