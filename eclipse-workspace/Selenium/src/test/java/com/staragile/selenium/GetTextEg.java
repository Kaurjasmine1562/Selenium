package com.staragile.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Navjot\\Documents\\Web Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		//invoke the chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login");

		Thread.sleep(2000);

		// getText()

		WebElement login = driver.findElement(By.xpath("//div[contains(text(),'Log in to Facebook')]"));

		String text = login.getText();



		// getAttribute 

		WebElement button = driver.findElement(By.xpath("//button[@id='loginbutton']"));

		String idtext = button.getAttribute("id");

		System.out.println(idtext);

		// get css value 

		WebElement loginbutton = driver.findElement(By.xpath("//button[@id='loginbutton']"));

		String cssvalue  = loginbutton.getCssValue("color");

		System.out.println(cssvalue);

		//is displayed
		WebElement button1 = driver.findElement(By.xpath("//button[@id='loginbutton']"));
		if (button1.isDisplayed()) {
			//button.click();
		}

		// is enabled
		WebElement button2 = driver.findElement(By.xpath("//button[@id='loginbutton']"));

		if(button1.isDisplayed()) {
			//button2.click();
		}

		// get location
		WebElement button3 = driver.findElement(By.xpath("//button[@id='loginbutton']"));
		System.out.println(button3.getLocation());

		//get size
		WebElement button4 = driver.findElement(By.xpath("//button[@id='loginbutton']"));
		System.out.println(button4.getSize());



	}}

