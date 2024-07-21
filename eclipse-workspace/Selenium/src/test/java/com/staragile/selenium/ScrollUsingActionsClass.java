package com.staragile.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollUsingActionsClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Navjot\\Documents\\Web Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.facebook.com/login/");
        
        Thread.sleep(2000);
        
        WebElement pp = driver.findElement(By.xpath("//a[contains(text(), 'Privacy Polcy')]"));
        Actions act = new Actions(driver);
        
        //scroll till the element is visible
        
        act.scrollToElement(pp);
        pp.click();
        
	}

}
