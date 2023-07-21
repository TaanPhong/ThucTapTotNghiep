package com.trantanphong.dto;

public class AccountDTO {
	private String userName;
	private String password;
	private String avatar;

	public AccountDTO(String userName, String password, String avatar) {
		super();
		this.userName = userName;
		this.password = password;
		this.avatar = avatar;
	}

	public AccountDTO() {
		super();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

}
