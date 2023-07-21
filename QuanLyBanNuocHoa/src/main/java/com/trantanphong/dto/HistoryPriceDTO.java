package com.trantanphong.dto;

public class HistoryPriceDTO {
	private Long staffId;
	private Long productId;
	private String dateStart;
	private String dateEnd;
	private int price;

	public HistoryPriceDTO() {
		super();
	}

	public HistoryPriceDTO(Long staffId, Long productId, String dateStart, String dateEnd, int price) {
		super();
		this.staffId = staffId;
		this.productId = productId;
		this.dateStart = dateStart;
		this.dateEnd = dateEnd;
		this.price = price;
	}

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

}
