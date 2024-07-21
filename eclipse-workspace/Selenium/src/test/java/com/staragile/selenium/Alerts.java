package com.staragile.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Navjot\\Documents\\Web Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");

        
        Thread.sleep(2000);
        
        //simple alert
        WebElement simpalert = driver.findElement(By.xpath("//input[@name='alert']"));
        simpalert.click();
        
        Alert alt = driver.switchTo().alert();    //****** alerts will work with this
        alt.accept();
        
        Thread.sleep(4000);
        
        //confirmation alert
        WebElement confalert = driver.findElement(By.xpath("//input[@name='alert']"));
        confalert.click();
        Alert alt1 = driver.switchTo().alert();
        alt1.dismiss();
        
        Thread.sleep(4000);
        
        //prompt alert
        WebElement prompalert = driver.findElement(By.xpath("//input[@name ='prompt']"));
		
		prompalert.click();
		
		Alert alt2 = driver.switchTo().alert();
		
		Thread.sleep(2000);
		
		alt2.sendKeys("Jasmine");
		
		String altetxt = alt2.getText();
		
		System.out.println(altetxt);
		
		alt2.accept();

        
        
        
        
        

	}

}
