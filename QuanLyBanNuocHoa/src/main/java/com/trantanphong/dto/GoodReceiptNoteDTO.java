package com.trantanphong.dto;

public class GoodReceiptNoteDTO {
	private Long id;
	private String dateFound;
	private long totalMoney;

	public GoodReceiptNoteDTO() {
		super();
	}

	public GoodReceiptNoteDTO(Long id, String dateFound, long totalMoney) {
		super();
		this.id = id;
		this.dateFound = dateFound;
		this.totalMoney = totalMoney;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDateFound() {
		return dateFound;
	}

	public void setDateFound(String dateFound) {
		this.dateFound = dateFound;
	}

	public long getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(long totalMoney) {
		this.totalMoney = totalMoney;
	}

}
