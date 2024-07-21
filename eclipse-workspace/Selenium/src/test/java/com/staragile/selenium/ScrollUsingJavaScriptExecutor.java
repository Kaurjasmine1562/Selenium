package com.staragile.selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUsingJavaScriptExecutor {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Navjot\\Documents\\Web Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().minimize();
        driver.get("https://www.amazon.in/");
        
          // vertical scrolling
		
     		JavascriptExecutor js = (JavascriptExecutor)driver;
     		
     		// vertical scrolling by some pixels - down 
     		
     		js.executeScript("window.scrollBy(0 ,800)", "");
     		
     		// up scroll
     		
     		js.executeScript("window.scrollBy(0 ,-400)", "");
     		
     		
     		// horizontal
     		
     		js.executeScript("window.scrollBy(600 ,0)", "");
     		
     		// up scroll
     		
     		js.executeScript("window.scrollBy(-400  ,0)", "");




        

	}

}
