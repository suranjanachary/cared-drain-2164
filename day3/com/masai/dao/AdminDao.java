package com.masai.dao;

import com.masai.bean.Admin;
import com.masai.exceptions.AdminException;

public interface AdminDao {

	public String registerAdmin(Admin admin);
	
	public Admin loginAdmin(String adminId, String adminPw)throws AdminException;

}
