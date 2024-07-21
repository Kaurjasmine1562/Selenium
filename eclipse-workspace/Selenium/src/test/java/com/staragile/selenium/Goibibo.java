package com.staragile.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goibibo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Navjot\\Documents\\Web Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		
		WebElement close = driver.findElement(By.xpath("//span[@class='logSprite icClose']"));
		close.click();
		
		Thread.sleep(1000);
		WebElement from = driver.findElement(By.xpath("(//p[text()='Enter city or airport'])[1]"));
		from.click();
		
		Thread.sleep(1000);
		WebElement fr = driver.findElement(By.xpath("//input[@type='text']"));
		fr.sendKeys("Pune");
		Thread.sleep(1000);
		
		WebElement pune = driver.findElement(By.xpath("//span[contains(text(),'Pune, India')]"));
		Thread.sleep(500);
		pune.click();
		
	}

}
