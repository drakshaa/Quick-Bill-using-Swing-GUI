package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.db.DB;
import com.model.Product;
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
		List<UpdateStock> slist = new ArrayList<>();
		
		try {
			String sql = "Select * from updatestock";
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
			} catch (Exception e) {
			e.printStackTrace();
		}
		return slist;
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

	@Override
	public List<UpdateStock> searchUpdateStock(String sdata) {
	List<UpdateStock> slist = new ArrayList<>();
		
		try {
			
		String sql = "select * from updatestock where productid like '%"+sdata+"%' OR productname like '%"+sdata+"%' OR quantityavail like '%"+sdata+"%' OR quantityadded like '%"+sdata+"%' OR mrp like '%"+sdata+"%'";
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
