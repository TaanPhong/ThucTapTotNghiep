package com.trantanphong.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "receiptDetail")
public class ReceiptDetail {
	@EmbeddedId
	private ReceiptDetailKey id;

	@ManyToOne
	@MapsId("productId")
	@JoinColumn(name = "product_id")
	private Product product;

	@ManyToOne
	@MapsId("goodReceiptNoteId")
	@JoinColumn(name = "goodReceiptNote_id")
	private GoodReceiptNote goodReceiptNote;

	private int numberOf;
	private int price;

	public ReceiptDetail(ReceiptDetailKey id, Product product, GoodReceiptNote goodReceiptNote, int numberOf,
			int price) {
		super();
		this.id = id;
		this.product = product;
		this.goodReceiptNote = goodReceiptNote;
		this.numberOf = numberOf;
		this.price = price;
	}

	public ReceiptDetail() {
		super();
	}

	public ReceiptDetailKey getId() {
		return id;
	}

	public void setId(ReceiptDetailKey id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public GoodReceiptNote getGoodReceiptNote() {
		return goodReceiptNote;
	}

	public void setGoodReceiptNote(GoodReceiptNote goodReceiptNote) {
		this.goodReceiptNote = goodReceiptNote;
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

}
