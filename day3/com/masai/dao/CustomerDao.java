package com.masai.dao;

import com.masai.bean.Customer;
import com.masai.exceptions.CustomerException;

public interface CustomerDao {

	public String registerCustomer(Customer customer);
	
	public Customer loginCustomer(String cuId, String cPw) throws CustomerException;
}
