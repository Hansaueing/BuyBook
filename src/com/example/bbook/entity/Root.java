package com.example.bbook.entity;

import java.util.List;

public class Root {

	private int code;

	private List<Data> data;

	public void setCode(int code) {
		this.code = code;
	}

	public int getCode() {
		return this.code;
	}

	public void setData(List<Data> data) {
		this.data = data;
	}

	public List<Data> getData() {
		return this.data;
	}

}
