package com.service;

import java.util.List;

import com.model.NewBill;

public interface NewBillService {
	
	void addBill(NewBill nb);
	
	void deleteBill(int index);
	
	List<NewBill> getAllBill();
	
	


}
