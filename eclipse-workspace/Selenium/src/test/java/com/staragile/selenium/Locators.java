package com.staragile.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Navjot\\Documents\\Web Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		//invoke the chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("Jasmine1562");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("jasmine");
		
		//name locator
		WebElement username1 = driver.findElement(By.name("email"));
		username1.sendKeys("jasmine1562@gmail.com");
		
		//link text
		WebElement login = driver.findElement(By.linkText("Log In"));
		login.click();
		
		//Partial link text
		WebElement forgottenpwd = driver.findElement(By.partialLinkText("Forgotten"));
		forgottenpwd.click();
		
		//tagname
		WebElement signup = driver.findElement(By.tagName("a"));
		signup.click();
		
		//css selector
		WebElement username4 = driver.findElement(By.cssSelector("div.orangehrm-login-layout div.orangehrm-login-layout-blob div.orangehrm-login-container div.orangehrm-login-slot-wrapper div.orangehrm-login-slot div.orangehrm-login-form form.oxd-form div.oxd-form-actions.orangehrm-login-action:nth-child(4) > button.oxd-button.oxd-button--medium.oxd-button--main.orangehrm-login-button"));
		username4.click();
		

	}

}
