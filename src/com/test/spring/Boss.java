package com.test.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Boss {

	@Resource
	private Car car;

	@Resource(name = "office")
	private Office office;

	// 必须要用默认构造函数才能不报错，原因见：
	// http://forum.spring.io/forum/spring-projects/container/97753-how-to-autowire-a-bean-without-default-constructor
	/*
	 * public Boss(Car car) { super(); System.out.println("1");
	 * System.out.println("2"); }
	 */

	@PostConstruct
	public void postConstruct1() {
		System.out.println("postConstruct1");
	}

	@PreDestroy
	public void postConstruct2() {
		System.out.println("postConstruct2");
	}

	@Override
	public String toString() {
		return "car:" + car + "\n" + "office:" + office;
	}

	/*
	 * @Autowired public Boss(Car car, @Qualifier("office") Office office) {
	 * super(); this.car = car; this.office = office; }
	 */
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
