package com.staragile.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Navjot\\Documents\\Web Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/iframe");
        
        //frames using INDEX, ID, NAME, XPATH
        
        //XPATH
        WebElement fr = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
        
        //INDEX
   //     driver.switchTo().frame(0);
        
        //ID
 //       driver.switchTo().frame("mce_0_ifr");
        
        
        driver.switchTo().frame(fr);     //****************
        
        WebElement content = driver.findElement(By.xpath("//body[@id='tinymce']"));
        
        content.clear();
        
        content.sendKeys("Jasmine wrote this code");
        
        

	}

}
