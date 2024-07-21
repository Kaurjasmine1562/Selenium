package com.staragile.testNG;

import org.testng.annotations.Test;

public class TestNGSkip {
	
	@Test  (priority = 0, enabled = false)
	public void testcase1() {
		System.out.println("testcase1 is executed");
	}
	
	@Test (priority = 2)
	public void testcase2() {
		System.out.println("testcase2 is executed");
	}
	
	@Test (priority = 1)
	public void testcase3() {
		System.out.println("testcase3 is executed");
	}
	
	@Test (priority = 3 )
	public void testcase4() {
		System.out.println("testcase4 is executed");
	}
	

}
