package com.staragile.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Navjot\\Documents\\Web Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/tables");

		Thread.sleep(4000);
		
		//context click
		WebElement rtclick = driver.findElement(By.xpath("//div[@id='hot-spot']"));
		Actions act = new Actions(driver);
		act.contextClick(rtclick).perform();   //.perform is necessary to run actions class 
		                                       // build.perform for multiple actions
		Thread.sleep(3000);
		
		Alert alt = driver.switchTo().alert();    //to click back from the pop up coming on screen
		alt.accept();
		
		Thread.sleep(3000);

		//double click
		WebElement ele = driver.findElement(By.xpath("//a[text()='Elemental Selenium']"));
		act.contextClick(ele).perform();       //.perform is necessary to run actions class 
		//wait
		Thread.sleep(2000);
		

	}

}
