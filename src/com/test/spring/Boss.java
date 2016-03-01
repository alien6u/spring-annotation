
package com.test.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Boss {
	
	private Car car;
	
	private Office office;
	
	//必须要用默认构造函数才能不报错，原因见：
	//http://forum.spring.io/forum/spring-projects/container/97753-how-to-autowire-a-bean-without-default-constructor
	/*public Boss(Car car) {
		super();
		System.out.println("1");
		System.out.println("2");
	}*/
	@Override
	public String toString() {
		 return "car:" + car + "\n" + "office:" + office;
	}
	public Car getCar() {
		System.out.println("4");
		return car;
	}
	
	@Autowired
	public void setCar(Car car) {
		System.out.println("3");
		this.car = car;
	}
	
	public Office getOffice() {
		return office;
	}
	
	@Autowired(required = false)
	public void setOffice(Office office) {
		this.office = office;
	}
	
	
}
