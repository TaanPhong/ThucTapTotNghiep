package com.trantanphong.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AuthorizedDetailKey implements Serializable {
	@Column(name = "account_id")
	private String accountId;

	@Column(name = "decentralization_id")
	private Long decentralizationId;

	@Column(name = "display_id")
	private String displayId;

	@Column(name = "dateStart")
	private String dateStart;

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public Long getDecentralizationId() {
		return decentralizationId;
	}

	public void setDecentralizationId(Long decentralizationId) {
		this.decentralizationId = decentralizationId;
	}

	public String getDisplayId() {
		return displayId;
	}

	public void setDisplayId(String displayId) {
		this.displayId = displayId;
	}

	public String getDateStart() {
		return dateStart;
	}

	public void setDateStart(String dateStart) {
		this.dateStart = dateStart;
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountId, dateStart, decentralizationId, displayId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AuthorizedDetailKey other = (AuthorizedDetailKey) obj;
		return Objects.equals(accountId, other.accountId) && Objects.equals(dateStart, other.dateStart)
				&& Objects.equals(decentralizationId, other.decentralizationId)
				&& Objects.equals(displayId, other.displayId);
	}

	public AuthorizedDetailKey(String accountId, Long decentralizationId, String displayId, String dateStart) {
		super();
		this.accountId = accountId;
		this.decentralizationId = decentralizationId;
		this.displayId = displayId;
		this.dateStart = dateStart;
	}

	public AuthorizedDetailKey() {
		super();
	}

}
