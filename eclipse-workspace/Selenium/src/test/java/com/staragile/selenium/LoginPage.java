package com.staragile.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Navjot\\Documents\\Web Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        Thread.sleep(2000);
        
        WebElement username = driver.findElement(By.xpath("//input[@name = 'username']"));
        username.sendKeys("Admin");
        
        Thread.sleep(2000);
        
        WebElement password = driver.findElement(By.xpath("//input[@name = 'password']"));
        password.sendKeys("admin123");
        
        Thread.sleep(2000);
        
        WebElement login = driver.findElement(By.xpath("//button[@type = 'submit']"));
        login.sendKeys("admin123");
        
        
        
        
        
        
        

	}

}
