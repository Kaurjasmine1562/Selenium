package com.staragile.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Navjot\\Documents\\Web Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dropdown");
     

		
		Thread.sleep(2000);
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown']"));
		Select dd = new Select(dropdown);
		dd.selectByIndex(1);  //option 1
		
		Thread.sleep(2000);   //for waiting time
		
		dd.selectByVisibleText("Option 2");
		
        Thread.sleep(2000);
		
		dd.selectByValue("1");
		
		Thread.sleep(2000);
		
		dd.deselectByVisibleText("Option 1"); //not possible here coz we can only select one option at a time.
		
		dd.getAllSelectedOptions();
	}

}
