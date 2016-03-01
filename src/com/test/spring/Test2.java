package com.test.spring;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

	@Test
	public void test() {
		
		String[] locations = {"beans.xml"};
		ApplicationContext ctx = new ClassPathXmlApplicationContext(locations);
		Boss boss = (Boss) ctx.getBean("boss");
		System.out.println(boss);
	}
	
}
