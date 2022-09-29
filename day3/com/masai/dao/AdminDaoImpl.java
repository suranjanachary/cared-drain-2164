package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.masai.bean.Admin;
import com.masai.exceptions.AdminException;
import com.masai.utility.DBUtill;
import com.masai.utility.DBUtill;

public class AdminDaoImpl implements AdminDao {

	@Override
	public String registerAdmin(Admin admin) {
		
		String message = "Admin Registration Failed";
	
		try(Connection conn= DBUtill.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement
			("insert into admin(busid,busname,busroute,bustype,seatavail,"
					+ "seatcapacity,dtime,atime,adminid,adminpw) values(?,?,?,?,?,?,?,?,?,?)");
			
			
			ps.setInt(1, admin.getBusid());
			ps.setString(2, admin.getBusname());
			ps.setString(3, admin.getBusroute());
			ps.setString(4, admin.getBustype());
			ps.setInt(5, admin.getSeatAvail());
			ps.setInt(6, admin.getSeatCapacity());
			ps.setString(7, admin.getDepartTime());
			ps.setString(8, admin.getAriveTime());
			ps.setString(9, admin.getAdminId());
			ps.setString(10, admin.getAdminPw());

			
			int x= ps.executeUpdate();
			
			
			if(x > 0)
				message = "Admin Registered Sucessfully !";
			
			
			
		} catch (SQLException e) {
			message = e.getMessage();
		}
		
		
		return message;
	
	}

	@Override
	public Admin loginAdmin(String adminId, String adminPw) throws AdminException {
		
		
			Admin admin = null;
			
			try(Connection conn = DBUtill.provideConnection()) {
				
				
				PreparedStatement ps= conn.prepareStatement("select * from admin where adminId = ? AND adminPw = ?");			
				
				ps.setString(1, adminId);
				ps.setString(2, adminPw);
				
				ResultSet rs= ps.executeQuery();
				
				
					if(rs.next()) {
					
					int busid= rs.getInt("busid");
					String busname= rs.getString("busname");
					String busroute= rs.getString("busroute");
					String bustype= rs.getString("bustype");
					int seatavail= rs.getInt("seatavail");
					int seatcapacity= rs.getInt("seatCapacity");
					String dtime= rs.getString("Dtime");
					String atime= rs.getString("Atime");
					String id= rs.getString("adminId");
					String pw= rs.getString("adminPw");
					
					
			admin= new Admin(busid, busname,busroute,bustype,seatavail,seatcapacity,dtime,atime,id,pw);	
					
					
				}else
					throw new AdminException("Invalid Username or password.. ");
				
				
				
				
			} catch (SQLException e) {
				throw new AdminException(e.getMessage());
			}
			
			
			return admin;
			
			
		}
		
	

}
