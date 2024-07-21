package com.staragile.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Navjot\\Documents\\Web Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");    //get method will launch the browser
		
		
		
	//	SELENIUM WebDriver BROWSER COMMANDS
		
		
		
		//get title - page title -store t in a string
		String title = driver.getTitle();
		System.out.println(title);
		
		//current URl - fetches the launched browser URL
		
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		
		// getpagesource - whole html code print
		
		String pagesource = driver.getPageSource();
		System.out.println(pagesource); 
		
		//     - close browser session (imp)
		driver.close();
		
		// close all browser sessions of chrome
	//	driver.quit();
		
		
		

	}

}
