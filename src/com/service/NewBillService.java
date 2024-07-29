package com.service;

import java.util.List;

import com.model.NewBill;
import com.model.UpdateStock;

public interface NewBillService {
	
	void addBill(NewBill nb);
	
	void deleteBill(int index);
	
	List<NewBill> getAllBill();
	
	List<NewBill> searchBill(String bdata);
	


}
