package com.example.bbook.entity;

import java.io.Serializable;

public class Data implements Serializable{
	private long add_time;

	private String author;

	private String author_summary;

	private String catalogue;

	private double dangPrice;

	private String description;

	private double fixedPrice;

	private int has_deleted;

	private int id;

	private String isbn;

	private String keywords;

	private String printNumber;

	private int printTime;

	private String productName;

	private String product_pic;

	private long publishTime;

	private String publishedTime;

	private String publishing;

	private String totalPage;

	private String whichEdtion;

	private String wordNumber;
	

	public Data() {
		super();
	}

	public void setAdd_time(long add_time) {
		this.add_time = add_time;
	}

	public long getAdd_time() {
		return this.add_time;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor_summary(String author_summary) {
		this.author_summary = author_summary;
	}

	public String getAuthor_summary() {
		return this.author_summary;
	}

	public void setCatalogue(String catalogue) {
		this.catalogue = catalogue;
	}

	public String getCatalogue() {
		return this.catalogue;
	}

	public void setDangPrice(double dangPrice) {
		this.dangPrice = dangPrice;
	}

	public double getDangPrice() {
		return this.dangPrice;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}

	public void setFixedPrice(double fixedPrice) {
		this.fixedPrice = fixedPrice;
	}

	public double getFixedPrice() {
		return this.fixedPrice;
	}

	public void setHas_deleted(int has_deleted) {
		this.has_deleted = has_deleted;
	}

	public int getHas_deleted() {
		return this.has_deleted;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getIsbn() {
		return this.isbn;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getKeywords() {
		return this.keywords;
	}

	public void setPrintNumber(String printNumber) {
		this.printNumber = printNumber;
	}

	public String getPrintNumber() {
		return this.printNumber;
	}

	public void setPrintTime(int printTime) {
		this.printTime = printTime;
	}

	public int getPrintTime() {
		return this.printTime;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProduct_pic(String product_pic) {
		this.product_pic = product_pic;
	}

	public String getProduct_pic() {
		return this.product_pic;
	}

	public void setPublishTime(long publishTime) {
		this.publishTime = publishTime;
	}

	public long getPublishTime() {
		return this.publishTime;
	}

	public void setPublishedTime(String publishedTime) {
		this.publishedTime = publishedTime;
	}

	public String getPublishedTime() {
		return this.publishedTime;
	}

	public void setPublishing(String publishing) {
		this.publishing = publishing;
	}

	public String getPublishing() {
		return this.publishing;
	}

	public void setTotalPage(String totalPage) {
		this.totalPage = totalPage;
	}

	public String getTotalPage() {
		return this.totalPage;
	}

	public void setWhichEdtion(String whichEdtion) {
		this.whichEdtion = whichEdtion;
	}

	public String getWhichEdtion() {
		return this.whichEdtion;
	}

	public void setWordNumber(String wordNumber) {
		this.wordNumber = wordNumber;
	}

	public String getWordNumber() {
		return this.wordNumber;
	}

	@Override
	public String toString() {
		return "Data [add_time=" + add_time + ", author=" + author
				+ ", author_summary=" + author_summary + ", catalogue="
				+ catalogue + ", dangPrice=" + dangPrice + ", description="
				+ description + ", fixedPrice=" + fixedPrice + ", has_deleted="
				+ has_deleted + ", id=" + id + ", isbn=" + isbn + ", keywords="
				+ keywords + ", printNumber=" + printNumber + ", printTime="
				+ printTime + ", productName=" + productName + ", product_pic="
				+ product_pic + ", publishTime=" + publishTime
				+ ", publishedTime=" + publishedTime + ", publishing="
				+ publishing + ", totalPage=" + totalPage + ", whichEdtion="
				+ whichEdtion + ", wordNumber=" + wordNumber + "]";
	}
	

}
