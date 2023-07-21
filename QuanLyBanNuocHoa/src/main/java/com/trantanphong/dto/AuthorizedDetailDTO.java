package com.trantanphong.dto;

public class AuthorizedDetailDTO {
	private String accountId;
	private String dateEnd;
	private Long decentralizationId;
	private String dateStart;
	private String displayId;

	public AuthorizedDetailDTO(String accountId, String dateEnd, Long decentralizationId, String dateStart,
			String displayId) {
		super();
		this.accountId = accountId;
		this.dateEnd = dateEnd;
		this.decentralizationId = decentralizationId;
		this.dateStart = dateStart;
		this.displayId = displayId;
	}

	public AuthorizedDetailDTO() {
		super();
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(String dateEnd) {
		this.dateEnd = dateEnd;
	}

	public Long getDecentralizationId() {
		return decentralizationId;
	}

	public void setDecentralizationId(Long decentralizationId) {
		this.decentralizationId = decentralizationId;
	}

	public String getDateStart() {
		return dateStart;
	}

	public void setDateStart(String dateStart) {
		this.dateStart = dateStart;
	}

	public String getDisplayId() {
		return displayId;
	}

	public void setDisplayId(String displayId) {
		this.displayId = displayId;
	}

}
