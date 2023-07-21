package com.trantanphong.dto;

public class HistoryStatusOrderDTO {
	private Long theOrderId;
	private Long statusId;
	private String dateShift;

	public HistoryStatusOrderDTO() {
		super();
	}

	public HistoryStatusOrderDTO(Long theOrderId, Long statusId, String dateShift) {
		super();
		this.theOrderId = theOrderId;
		this.statusId = statusId;
		this.dateShift = dateShift;
	}

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

	public String getDateShift() {
		return dateShift;
	}

	public void setDateShift(String dateShift) {
		this.dateShift = dateShift;
	}

}
