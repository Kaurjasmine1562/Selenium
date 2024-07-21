package com.staragile.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigationalCommands {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Navjot\\Documents\\Web Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		// launching of the browser - URL passing as a parameter 
		
		driver.navigate().to("https://www.selenium.dev/");
		
		// back()
		
		driver.navigate().back();
		
		// forward
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		// Refresh
		
		driver.navigate().refresh();
		
		driver.quit();
		
		}
}

