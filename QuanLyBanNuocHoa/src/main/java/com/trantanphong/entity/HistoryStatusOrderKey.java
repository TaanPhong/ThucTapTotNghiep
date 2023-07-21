package com.trantanphong.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class HistoryStatusOrderKey implements Serializable {
	@Column(name = "theOrder_id")
	private Long theOrderId;

	@Column(name = "status_id")
	private Long statusId;

	public Long getTheOrderId() {
		return theOrderId;
	}

	public void setTheOrderId(Long theOrderId) {
		this.theOrderId = theOrderId;
	}

	public Long getStatusId() {
		return statusId;
	}

	public void setStatusId(Long statusId) {
		this.statusId = statusId;
	}

	public HistoryStatusOrderKey(Long theOrderId, Long statusId) {
		super();
		this.theOrderId = theOrderId;
		this.statusId = statusId;
	}

	public HistoryStatusOrderKey() {
		super();
	}

}
