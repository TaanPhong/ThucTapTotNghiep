package com.trantanphong.dto;

public class ReceiptDetailDTO {
	private Long goodReceiptNoteId;
	private Long productId;
	private int numberOf;
	private int price;

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

	public ReceiptDetailDTO(Long goodReceiptNoteId, Long productId, int numberOf, int price) {
		super();
		this.goodReceiptNoteId = goodReceiptNoteId;
		this.productId = productId;
		this.numberOf = numberOf;
		this.price = price;
	}

	public ReceiptDetailDTO() {
		super();
	}

}
