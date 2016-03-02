package com.test.spring;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnoloTest_1 {

	@Test
	public void test() {
		String[] locations = {"beans.xml"};
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(locations);
		Boss boss = (Boss)ctx.getBean("boss");
		System.out.println(boss);
		ctx.destroy();
	}

}
