package com.trantanphong.dto;

public class PromotionDetailDTO {
	private Long promotionId;
	private Long productId;
	private String dateStart;
	private String dateEnd;
	private int present;

	public Long getPromotionId() {
		return promotionId;
	}

	public void setPromotionId(Long promotionId) {
		this.promotionId = promotionId;
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

	public int getPresent() {
		return present;
	}

	public void setPresent(int present) {
		this.present = present;
	}

	public PromotionDetailDTO(Long promotionId, Long productId, String dateStart, String dateEnd, int present) {
		super();
		this.promotionId = promotionId;
		this.productId = productId;
		this.dateStart = dateStart;
		this.dateEnd = dateEnd;
		this.present = present;
	}

	public PromotionDetailDTO() {
		super();
	}

}
