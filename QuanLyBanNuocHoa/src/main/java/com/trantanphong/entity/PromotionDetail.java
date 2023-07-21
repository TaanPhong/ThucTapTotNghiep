package com.trantanphong.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "promotionDetail")
public class PromotionDetail {
	@EmbeddedId
	private PromotionDetailKey id;

	@ManyToOne
	@MapsId("promotionId")
	@JoinColumn(name = "promotion_id")
	private Promotion promotion;

	@ManyToOne
	@MapsId("productId")
	@JoinColumn(name = "product_id")
	private Product product;

	private String dateStart;
	private String dateEnd;

	private int present;

	public PromotionDetailKey getId() {
		return id;
	}

	public void setId(PromotionDetailKey id) {
		this.id = id;
	}

	public Promotion getPromotion() {
		return promotion;
	}

	public void setPromotion(Promotion promotion) {
		this.promotion = promotion;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
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

	public PromotionDetail(PromotionDetailKey id, Promotion promotion, Product product, String dateStart,
			String dateEnd, int present) {
		super();
		this.id = id;
		this.promotion = promotion;
		this.product = product;
		this.dateStart = dateStart;
		this.dateEnd = dateEnd;
		this.present = present;
	}

	public PromotionDetail() {
		super();
	}

}
