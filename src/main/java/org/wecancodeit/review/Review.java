package org.wecancodeit.review;

public class Review {
	private long id;
	private int month;
	private int date;
	private String title;
	private String url;
	private String category;
	private String content;
	
	public Review( long id, int month, int date, String title, String url, String category, String content) {
		this.id = id;
		this.month = month;
		this.date = date;
		this.title = title;
		this.url = url;
		this.category = category;
		this.content = content;
	}
	
	public long getId() {
		return id;
	}
	
	public String getDate() {
		return month + "/" + date;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getUrl() {
		return url;
	}
	
	public String getCategory() {
		return category;
	}
	
	public String getContent() {
		return content;
	}
}
