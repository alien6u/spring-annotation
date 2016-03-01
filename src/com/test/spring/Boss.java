
package com.test.spring;

import org.springframework.beans.factory.annotation.Autowired;


public class Boss {
	
	private Car car;
	
	@Autowired
	private Office office;
	
	public Boss(Car car, Office office) {
		super();
		this.car = car;
		this.office = office;
	}
	@Override
	public String toString() {
		 return "car:" + car + "\n" + "office:" + office;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public Office getOffice() {
		return office;
	}
	public void setOffice(Office office) {
		this.office = office;
	}
	
	
}
