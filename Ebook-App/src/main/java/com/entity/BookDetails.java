package com.entity;

public class BookDetails {
	private int bookId;
	private String bookName;
	private String author;
	private double price;
	private String booksCategory;
	private String status;
	private String photo;
	private String user_email;
	
	public BookDetails() {
		
	}

	public BookDetails(String bookName, String author, double price, String booksCategory, String status, String photo,
			String user_email) {
		this.bookName = bookName;
		this.author = author;
		this.price = price;
		this.booksCategory = booksCategory;
		this.status = status;
		this.photo = photo;
		this.user_email = user_email;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBooksCategory() {
		return booksCategory;
	}

	public void setBooksCategory(String booksCategory) {
		this.booksCategory = booksCategory;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	@Override
	public String toString() {
		return "BookDetails [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", price=" + price
				+ ", booksCategory=" + booksCategory + ", status=" + status + ", photo=" + photo + ", user_email="
				+ user_email + "]";
	}

}
