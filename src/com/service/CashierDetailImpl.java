package com.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.db.DB;
import com.model.CashierDetail;



public class CashierDetailImpl implements CashierDetails {
	
	List<CashierDetail> dlist = new ArrayList<>();

	@Override
	public void addDetail(CashierDetail d) {
		try {
			String sql = "insert into cashierdetail(id, name, phoneno, address, email, password)values('"+d.getId()+"','"+d.getName()+"','"+d.getPhone_no()+"','"+d.getAddress()+"','"+d.getEmail()+"','"+d.getPassword()+"')";
			Statement stm = DB.connectDb().createStatement();
			stm.execute(sql);
			}  catch (Exception e) {
		          e.printStackTrace();
				}
			
		
	}

	@Override
	public void deleteDetail(int id) {
		try {
		String sql = "delete from cashierdetail where id ="+id;
		Statement stm = DB.connectDb().createStatement();
		stm.execute(sql);
		dlist.remove(id);
	} catch (Exception e) {
		e.printStackTrace();
	}
	}

	@Override
	public List<CashierDetail> getAllDetail() {
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
	public void updateDetail(CashierDetail d) {
		
		try {
			String sql = "update cashierdetail set name='"+d.getName()+"' , phoneno = '"+d.getPhone_no()+"' , address = '"+d.getAddress()+"' , email = '"+d.getEmail()+"' , password = '"+d.getPassword()+"' where id = '"+d.getId()+"'";
			Statement stm = DB.connectDb().createStatement();
			stm.execute(sql);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}	