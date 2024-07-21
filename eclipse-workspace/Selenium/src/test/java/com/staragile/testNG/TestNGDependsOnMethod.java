package com.staragile.testNG;

import org.testng.annotations.Test;

public class TestNGDependsOnMethod {
	@Test
	public void dbconnection() {
		System.out.println("connected to db");
	}
	
	@Test (dependsOnMethods = {"dbconnection"})
	public void query1() {
		System.out.println("query1 is executed");
	}

}
