
package com.test.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Boss {
	
	//构造函数已经注解了，此处可以不用注解
	@Autowired
	private Car car;
	
	//构造函数已经注解 了，此处可以不用注解
	@Autowired
    @Qualifier("office")
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
	
	@Autowired
	public Boss(Car car, @Qualifier("office") Office office) {
		super();
		this.car = car;
		this.office = office;
	}
	public Car getCar() {
		System.out.println("4");
		return car;
	}
	
	public void setCar(Car car) {
		System.out.println("3");
		this.car = car;
	}
	
	public Office getOffice() {
		return office;
	}
	
	public void setOffice(@Qualifier("office") Office office) {
		this.office = office;
	}
	
	
}
