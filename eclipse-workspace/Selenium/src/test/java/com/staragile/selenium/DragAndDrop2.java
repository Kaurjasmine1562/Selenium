package com.staragile.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Navjot\\Documents\\Web Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.dummypoint.com/DragAndDrop.html");

		Thread.sleep(4000);
		
		WebElement hi = driver.findElement(By.xpath("//p[@id='drag']"));
		WebElement box = driver.findElement(By.xpath("//div[@id='drop']"));
		
		Actions alt = new Actions(driver);
		alt.dragAndDrop(hi, box).perform();
		

	}

}
