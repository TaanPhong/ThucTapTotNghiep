package com.trantanphong.dto;

public class TheOrderDetailDTO {
	private Long theOrderId;
	private Long productId;
	private int numberOf;
	private int price;

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

	public TheOrderDetailDTO(Long theOrderId, Long productId, int numberOf, int price) {
		super();
		this.theOrderId = theOrderId;
		this.productId = productId;
		this.numberOf = numberOf;
		this.price = price;
	}

	public TheOrderDetailDTO() {
		super();
	}

}
