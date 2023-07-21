package com.trantanphong.entity;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "authorizedDetail")
public class AuthorizedDetail {
	@EmbeddedId
	private AuthorizedDetailKey id;

	@ManyToOne
	@MapsId("accountId")
	@JoinColumn(name = "account_id")
	private Account account;

	@ManyToOne
	@MapsId("decentralizationId")
	@JoinColumn(name = "decentralization_id")
	private Decentralization decentralization;

	private String dateEnd;

	public AuthorizedDetail() {
		super();
	}

	public AuthorizedDetail(AuthorizedDetailKey id, Account account, Decentralization decentralization,
			String dateEnd) {
		super();
		this.id = id;
		this.account = account;
		this.decentralization = decentralization;
		this.dateEnd = dateEnd;
	}

	public AuthorizedDetailKey getId() {
		return id;
	}

	public void setId(AuthorizedDetailKey id) {
		this.id = id;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Decentralization getDecentralization() {
		return decentralization;
	}

	public void setDecentralization(Decentralization decentralization) {
		this.decentralization = decentralization;
	}

	public String getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(String dateEnd) {
		this.dateEnd = dateEnd;
	}

}
