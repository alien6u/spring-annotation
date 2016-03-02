package com.test.spring;

import org.springframework.stereotype.Component;

@Component
public class Car {
	private String brand;
	private double price;
	@Override
	public String toString() {
		return "brand" + brand + "\n" + "price" + price ;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
