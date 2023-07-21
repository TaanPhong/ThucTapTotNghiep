package com.trantanphong.dto;

public class PictureProductDTO {
	private Long id;
	private String url;

	public PictureProductDTO() {
		super();
	}

	public PictureProductDTO(Long id, String url) {
		super();
		this.id = id;
		this.url = url;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
