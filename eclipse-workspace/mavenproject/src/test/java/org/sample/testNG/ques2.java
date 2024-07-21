package org.sample.testNG;

import org.testng.annotations.Test;

public class ques2 {
	
	ques2 q2 = new ques2();
	
	@Test
	public void login() {
		q2.setup();
		q2.login();
	}
	
	@Test
	public void logoverification() {
		q2.setup();
		q2.logoverification();
	}
	
	@Test
	public void ForgotPasswordverfication() {
		q2.setup();
	    q2.ForgotPasswordverfication();
	}
	
	public void verifysignup() {
		q2.setup();
		q2.verifysignup();
	}
	
	public void verifytitle() {
		q2.setup();
		q2.verifytitle();
	}

		
	}


