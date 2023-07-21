package com.trantanphong.dto;

public class DiscountDTO {
	private String dateEnd;
	private int present;
	private Long customerTypeId;
	private Long productId;
	private String dateStart;

	public DiscountDTO() {
		super();
	}

	public DiscountDTO(String dateEnd, int present, Long customerTypeId, Long productId, String dateStart) {
		super();
		this.dateEnd = dateEnd;
		this.present = present;
		this.customerTypeId = customerTypeId;
		this.productId = productId;
		this.dateStart = dateStart;
	}

	public String getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(String dateEnd) {
		this.dateEnd = dateEnd;
	}

	public int getPresent() {
		return present;
	}

	public void setPresent(int present) {
		this.present = present;
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

	public String getDateStart() {
		return dateStart;
	}

	public void setDateStart(String dateStart) {
		this.dateStart = dateStart;
	}

}
