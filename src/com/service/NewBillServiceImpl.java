package com.service;

import java.sql.Statement;
import java.util.List;

import com.db.DB;
import com.model.NewBill;

public class NewBillServiceImpl implements NewBillService {

	@Override
	public void addBill(NewBill nb) {
		try {
			String sql = "insert into newbill(billno, custname, productid, name, mrp, quantity, discount)values('"+nb.getBillno()+"','"+nb.getCustomername()+"','"+nb.getProductid()+"','"+nb.getName()+"','"+nb.getMrp()+"','"+nb.getQuantity()+"','"+nb.getDiscount()+"')";
			Statement stm = DB.connectDb().createStatement();
			stm.execute(sql);
			}  catch (Exception e) {
		          e.printStackTrace();
				}
		
	}

	@Override
	public void deleteBill(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<NewBill> getAllBill() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
