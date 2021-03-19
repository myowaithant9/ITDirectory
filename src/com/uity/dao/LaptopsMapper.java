package com.uity.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.uity.model.Laptops;



public class LaptopsMapper implements RowMapper<Laptops>{

	@Override
	public Laptops mapRow(ResultSet rs, int rowCount) throws SQLException {
		// TODO Auto-generated method stub
		Laptops aLaptops = new Laptops();
		
		aLaptops.setId(rs.getInt("laptops_id"));
		aLaptops.setBrand(rs.getString("brand"));
		aLaptops.setModel(rs.getString("model"));
		aLaptops.setProcessor(rs.getString("processor"));
		aLaptops.setRam(rs.getString("ram"));
		aLaptops.setHdd(rs.getString("hdd"));
		aLaptops.setPrice(rs.getInt("price"));
		aLaptops.setRating(rs.getInt("rating"));
		
		return aLaptops;
	}

}
