package com.staragile.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Keyboard {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Navjot\\Documents\\Web Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.facebook.com/login/");
     
        Thread.sleep(2000);

        WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
        
        Actions builder = new Actions(driver);
        
        Actions seriesofact = (Actions) builder.moveToElement(email).click().keyDown(email, Keys.SHIFT).sendKeys("jasmine").build();
        
        seriesofact.perform();
        

	}

}
