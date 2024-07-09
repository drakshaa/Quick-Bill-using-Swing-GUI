package com.service;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.db.DB;
import com.model.CashierDetail;
import com.model.UpdateStock;

public class UpdateStockServiceImpl implements UpdateStockService {

	@Override
	public void addStock(UpdateStock us) {
		try {
			String sql = "insert into updatestock(productid, productname, quantityavail, quantityadded, mrp)values('"+us.getProductId()+"','"+us.getProductName()+"', '"+us.getQuantityAvail()+"', '"+us.getQuantityAdded()+"', '"+us.getMrp()+"')";
			Statement stm = DB.connectDb().createStatement();
			stm.execute(sql);
			}  catch (Exception e) {
		          e.printStackTrace();
				}
		
	}
		
	@Override
	public List<UpdateStock> getAllStock() {
		List<CashierDetail> dlist = new ArrayList<>();
		
		try {
			String sql = "Select * from cashierdetail";
			Statement stm = DB.connectDb().createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while (rs.next()) {
				
				//row mapping object
				CashierDetail cd = new CashierDetail();
				
				cd.setId(rs.getInt("id"));
				cd.setName(rs.getString("name"));
				cd.setPhone_no(rs.getString("phoneno"));
				cd.setAddress(rs.getString("address"));
				cd.setEmail(rs.getString("email"));
				cd.setPassword(rs.getString("password"));
				
				dlist.add(cd);
			
			}
			} catch (Exception e) {
			e.printStackTrace();
		}
		return dlist;
	}

	@Override
	public void updateStock(UpdateStock us) {
		try {
			String sql = "update updatestock set productid='"+us.getProductId()+"', productname='"+us.getProductName()+"', quantityavail='"+us.getQuantityAvail()+"', quantityadded='"+us.getQuantityAdded()+"', mrp='"+us.getMrp()+"'";
			Statement stm = DB.connectDb().createStatement();
			stm.execute(sql);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
