package com.trantanphong.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PromotionDetailKey implements Serializable {
	@Column(name = "product_id")
	private Long productId;

	@Column(name = "promotion_id")
	private Long promotionId;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getPromotionId() {
		return promotionId;
	}

	public void setPromotionId(Long promotionId) {
		this.promotionId = promotionId;
	}

	public PromotionDetailKey(Long productId, Long promotionId) {
		super();
		this.productId = productId;
		this.promotionId = promotionId;
	}

	public PromotionDetailKey() {
		super();
	}

}
