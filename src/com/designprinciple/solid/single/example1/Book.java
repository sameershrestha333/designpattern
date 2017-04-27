package com.designprinciple.solid.single.example1;

public class Book implements BookHandler{
	private int noOfPages;
	private String authorName;
	private BookPersistence bookbersistence;

	public Book(int noOfPages, String authorName) {
		// super();
		this.noOfPages = noOfPages;
		this.authorName = authorName;
		bookbersistence=new BookPersistence();
		//to avoid null pointer Exceptions.
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	
	public void save(){
		  bookbersistence.save(this);
	}
	@Override
	public String toString() {
		return getAuthorName()+"   "+ getNoOfPages();
	}
	

}
