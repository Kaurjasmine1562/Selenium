package com.staragile.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvokeFireFox {

	public static void main(String[] args) {
   System.setProperty("webdriver.firefox.driver","C:\\Users\\Navjot\\Documents\\Web Drivers\\geckodriver-v0.34.0-win32\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/");


	}



}
