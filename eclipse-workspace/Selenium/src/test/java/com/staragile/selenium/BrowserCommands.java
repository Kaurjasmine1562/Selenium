package com.staragile.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserCommands {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver","C:\\Users\\Navjot\\Documents\\Web Drivers\\"
				+ "chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		// launching of the browser - URL passing as a parameter 
		
		driver.get("https://www.selenium.dev/");
		
		//get Title - Page title  - string 
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		// current url - fetches the launched brower url 
		
		String currenturl = driver.getCurrentUrl();
		
		System.out.println(currenturl);
		
		// getPageSource  - this will fetch the html code 
		
		String pagesource = driver.getPageSource();
		
		System.out.println(pagesource);
		
		// close the current browser session
		
		driver.close();
		
		// driver.quit() - close all the browser sessions of chrome
		
		//driver.quit();
		
		

	}

}
