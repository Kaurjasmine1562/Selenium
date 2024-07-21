package com.staragile.testNG;

import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest {
	
	LoginPage lp = new LoginPage();
	
	@Test
	public void login() throws InterruptedException {
		lp.setup();
		lp.login();
	}
	
	
	@Test
	public void logoverification() {
		lp.setup();
		lp.verifylogo();
	}
	
	@Test
	public void ForgotPasswordverfication() {
		lp.setup();
		lp.verifyforgotpasswordlink();
	}

}
