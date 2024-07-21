package com.staragile.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Navjot\\Documents\\Web Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.facebook.com/login/");
        
        //implicit waits
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        
        WebElement username = driver.findElement(By.xpath("//input[@name = 'username']"));
        username.sendKeys("Admin");
        
        
        //explicit wait
        
        WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(5));
        wt.until(ExpectedConditions.visibilityOf(username));
        
        
        WebElement password = driver.findElement(By.xpath("//input[@name = 'password']"));
        password.sendKeys("admin123");
        
        
        WebElement login = driver.findElement(By.xpath("//button[@type = 'submit']"));
        login.sendKeys("admin123");

	}

}
