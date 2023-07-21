package com.trantanphong.dto;

public class CommentDTO {
	private Long id;
	private String dateComment;
	private String content;
	private int numberOfStart;

	public CommentDTO(Long id, String dateComment, String content, int numberOfStart) {
		super();
		this.id = id;
		this.dateComment = dateComment;
		this.content = content;
		this.numberOfStart = numberOfStart;
	}

	public CommentDTO() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDateComment() {
		return dateComment;
	}

	public void setDateComment(String dateComment) {
		this.dateComment = dateComment;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getNumberOfStart() {
		return numberOfStart;
	}

	public void setNumberOfStart(int numberOfStart) {
		this.numberOfStart = numberOfStart;
	}

}
