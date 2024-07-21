package com.staragile.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Navjot\\Documents\\Web Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
		
		Thread.sleep(2000);
		
		WebElement radio = driver.findElement(By.xpath("//input[@value = 'Female'])[1]"));
		
		radio.click();
		
		WebElement valuecheclk = driver.findElement(By.xpath("//button[@id='buttoncheck']"));
		valuecheclk.click();
		
		
//		if(!radio.isSelected()) {
	//		radio.click(); 
		}
		
	}


