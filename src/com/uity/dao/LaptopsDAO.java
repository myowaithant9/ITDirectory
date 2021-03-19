package com.uity.dao;

import java.util.List;


import com.uity.model.Laptops;


public interface LaptopsDAO {
	
	
	//public void saveOrUpdate(Contact contact);
	
	//public void delete(int contactId);
	
	public List<Laptops> get(String brand, String ram, String hdd);
	
	public List<Laptops> list();
}
