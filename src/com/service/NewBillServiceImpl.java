package com.service;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.db.DB;
import com.model.CashierDetail;
import com.model.NewBill;
import com.model.UpdateStock;

public class NewBillServiceImpl implements NewBillService {
	
	List<NewBill> blist = new ArrayList<>();


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
	public void deleteBill(int billno) {
		try {
			String sql = "delete from newbill where billno ="+billno;
			Statement stm = DB.connectDb().createStatement();
			stm.execute(sql);
			blist.remove(billno);
		} catch (Exception e) {
			e.printStackTrace();
		}
		}


	@Override
	public List<NewBill> getAllBill() {
List<NewBill> nlist = new ArrayList<>();
		
		try {
			String sql = "Select * from newbill";
			Statement stm = DB.connectDb().createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while (rs.next()) {
				
				//row mapping object
				NewBill nb = new NewBill();

				nb.setName(rs.getString("name"));
				nb.setMrp(rs.getInt("mrp"));
				nb.setQuantity(rs.getInt("quantity"));
				nb.setDiscount(rs.getDouble("discount"));
				nb.calculateTotalPriceWithDiscount();
				
				nlist.add(nb);
			
			}
			} catch (Exception e) {
			e.printStackTrace();
		}
		return nlist;
	}

	@Override
	public List<NewBill> searchBill(String bdata) {
	List<NewBill> blist = new ArrayList<>();
		
		try {
			
		String sql = "select * from newbill where billno like '%"+sdata+"%' ";
		Statement stm = DB.connectDb().createStatement();
		ResultSet rs = stm.executeQuery(sql);
		
		while (rs.next()) {
			
			//row mapping object
			UpdateStock us = new UpdateStock();
			
			us.setProductId(rs.getInt("productid"));
			us.setProductName(rs.getString("productname"));
			us.setQuantityAvail(rs.getInt("quantityavail"));
			us.setQuantityAdded(rs.getInt("quantityadded"));
			us.setMrp(rs.getInt("mrp"));
			
			slist.add(us);
		}
		}  catch (Exception e) {
			e.printStackTrace();
		}
		
		return slist;
	}
	}
	
