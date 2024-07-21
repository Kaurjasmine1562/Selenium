package com.staragile.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Navjot\\Documents\\Web Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.click();
		search.sendKeys("Korean Ramen");
		
		WebElement enter = driver.findElement(By.xpath("(//div[@class='nav-right'])[1]"));
		enter.click();
		
		WebElement addtocart = driver.findElement(By.id("a-autoid-6"));
		addtocart.click();
		
		Thread.sleep(4000);
		
		WebElement cart = driver.findElement(By.xpath("//span[@id='nav-cart-count']"));
		cart.click();
		
		Thread.sleep(4000);
		
		WebElement proceed = driver.findElement(By.xpath("//input[@value='Proceed to checkout']"));
		proceed.click();
		
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.xpath("//input[@id='ap_email']"));
		email.sendKeys("kaurjasmine1562@gmail.com");
		
	   WebElement continue1 = driver.findElement(By.xpath("//input[@id='continue']"));
		continue1.click();
		
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.xpath("//input[@id='ap_password']"));
		password.sendKeys("zirakpur");
		
		WebElement signin = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		signin.click();
			
			
		
		
		
		
		
		

	}

}
