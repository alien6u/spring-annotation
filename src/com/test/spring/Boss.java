
package com.test.spring;


public class Boss {
	
	private Car car;
	private Office office;
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
