package com.trantanphong.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ReceiptDetailKey implements Serializable {
	@Column(name = "goodReceiptNote_id")
	private Long goodReceiptNoteId;

	@Column(name = "product_id")
	private Long productId;

	public ReceiptDetailKey(Long goodReceiptNoteId, Long productId) {
		super();
		this.goodReceiptNoteId = goodReceiptNoteId;
		this.productId = productId;
	}

	public ReceiptDetailKey() {
		super();
	}

	public Long getGoodReceiptNoteId() {
		return goodReceiptNoteId;
	}

	public void setGoodReceiptNoteId(Long goodReceiptNoteId) {
		this.goodReceiptNoteId = goodReceiptNoteId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

}
