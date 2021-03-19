package com.uity.model;

import java.util.List;

public class Laptops {
	private int id;
	private String brand;
	private String model;
	private String processor;
	private String ram;
	private String hdd;
	private int price;
	private int rating;
	//private String fileName;
	private List<Laptops> laptopsList;
	private Laptops laptops;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
		public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getHdd() {
		return hdd;
	}
	public void setHdd(String hdd) {
		this.hdd = hdd;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public List<Laptops> getLaptopsList() {
		return laptopsList;
	}
	public void setLaptopsList(List<Laptops> laptopsList) {
		this.laptopsList = laptopsList;
	}
	public Laptops getLaptops() {
		return laptops;
	}
	public void setLaptops(Laptops laptops) {
		this.laptops = laptops;
	}
	
	public Laptops() {
	}

	public Laptops(String brand, String model, String processor, String ram, String hdd, int price, int rating) {
		this.brand = brand;
		this.model = model;
		this.processor = processor;
		this.ram = ram;
		this.hdd = hdd;
		this.price = price;
		this.rating = rating;
	}
	
}
