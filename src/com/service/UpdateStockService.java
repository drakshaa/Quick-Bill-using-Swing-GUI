package com.service;

import java.util.List;

import com.model.UpdateStock;

public interface UpdateStockService {
	
	void addStock(UpdateStock us);

	List<UpdateStock> getAllStock();
	
	void updateStock(UpdateStock us);
	
	List<UpdateStock> searchUpdateStock(String sdata);

	
}