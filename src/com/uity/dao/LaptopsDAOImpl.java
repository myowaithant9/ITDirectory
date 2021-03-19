package com.uity.dao;


import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;


import org.springframework.stereotype.Repository;


import com.uity.model.Laptops;

@Repository
public class LaptopsDAOImpl implements LaptopsDAO {

	  
	@Autowired(required=true) 
	 DataSource dataSource;
	
	
	/*public void saveOrUpdate(Contact contact) {
		JdbcTemplate jdbcTemplateObject = new JdbcTemplate(dataSource);  
		if (contact.getId() > 0) {
			// update
	String sql = "UPDATE contact SET name=?, email=?, address=?, photo=?,"
						+ "telephone=? WHERE contact_id=?";
			jdbcTemplateObject.update(sql, contact.getName(), contact.getEmail(),
					contact.getAddress(), contact.getFileName(), contact.getTelephone(), contact.getId());
		} else {
			// insert
			String sql = "INSERT INTO contact (name, email, address, telephone,photo)"
						+ " VALUES (?, ?, ?, ?,?)";
			jdbcTemplateObject.update(sql, contact.getName(), contact.getEmail(),
					contact.getAddress(), contact.getTelephone(),contact.getFileName());
		}
		
	}*/
	

	/*@Override
	public void delete(int contactId) {
		JdbcTemplate jdbcTemplateObject = new JdbcTemplate(dataSource);  
		String sql = "DELETE FROM contact WHERE contact_id=?";
		jdbcTemplateObject.update(sql, contactId);
	}*/

	@Override
	public List<Laptops> list() {
		
		JdbcTemplate jdbcTemplateObject = new JdbcTemplate(dataSource);  
		String sql = "SELECT * FROM Laptops";
		
		List <Laptops> listLaptops = jdbcTemplateObject.query(sql, new LaptopsMapper());
		
		return listLaptops;
	}

	
	@Override
	public List<Laptops> get (String brand, String ram, String hdd) {
		JdbcTemplate jdbcTemplateObject = new JdbcTemplate(dataSource);  
		String sql = "SELECT * FROM laptops WHERE brand='" + brand +"' and ram='" + ram + "' and hdd='" + hdd + "' order by rating desc;";
		List <Laptops> lstLaptops = jdbcTemplateObject.query(sql, new LaptopsMapper());
		return lstLaptops;
	}

}
