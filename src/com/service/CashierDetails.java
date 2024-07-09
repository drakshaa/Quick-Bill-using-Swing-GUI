package com.service;

import java.util.List;

import com.model.CashierDetail;

public interface CashierDetails {
	
	void addDetail(CashierDetail cd);
	
	void deleteDetail(int index);
	
	List<CashierDetail> getAllDetail();
	
	void updateDetail(CashierDetail d);
	
}
