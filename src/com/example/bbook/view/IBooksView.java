package com.example.bbook.view;

import java.util.List;

import com.example.bbook.entity.Data;

public interface IBooksView {
	void loadRecommendBook(List<Data> list);
	void loadHotBook(List<Data> list);
	void loadNewBook(List<Data> list);
}
