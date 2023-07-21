package com.trantanphong.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "historyStatusOrder")
public class HistoryStatusOrder {
	@EmbeddedId
	private HistoryStatusOrderKey id;

	@ManyToOne
	@MapsId("theOrderId")
	@JoinColumn(name = "theOrder_id")
	private TheOrder theOrder;

	@ManyToOne
	@MapsId("statusId")
	@JoinColumn(name = "status_id")
	private StatusOrder statusOrder;

	private String dateShift;

	public HistoryStatusOrder() {
		super();
	}

	public HistoryStatusOrder(HistoryStatusOrderKey id, TheOrder theOrder, StatusOrder statusOrder, String dateShift) {
		super();
		this.id = id;
		this.theOrder = theOrder;
		this.statusOrder = statusOrder;
		this.dateShift = dateShift;
	}

	public HistoryStatusOrderKey getId() {
		return id;
	}

	public void setId(HistoryStatusOrderKey id) {
		this.id = id;
	}

	public TheOrder getTheOrder() {
		return theOrder;
	}

	public void setTheOrder(TheOrder theOrder) {
		this.theOrder = theOrder;
	}

	public StatusOrder getStatusOrder() {
		return statusOrder;
	}

	public void setStatusOrder(StatusOrder statusOrder) {
		this.statusOrder = statusOrder;
	}

	public String getDateShift() {
		return dateShift;
	}

	public void setDateShift(String dateShift) {
		this.dateShift = dateShift;
	}

}
