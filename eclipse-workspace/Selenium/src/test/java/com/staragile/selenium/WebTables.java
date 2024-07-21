package com.staragile.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Navjot\\Documents\\Web Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/tables");

		Thread.sleep(4000);
		
		//find the no. of rows
		List<WebElement> rowno = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		int rowsize = rowno.size();
		System.out.println(rowsize);
		
		//Find no. of columns
		List<WebElement> colno = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[1]/td"));
		int colsize = colno.size();
		System.out.println(colsize);
		
		WebElement Celldata = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[1]/td[2]"));
		String Celltext = Celldata.getText();
		System.out.println(Celltext);
		 
		String ExpectedText = "John";
		
		if(Celltext.equals(ExpectedText)) {         //comparing both strings for equal results
			System.out.println("The cell data matches");
		} else {
			System.out.println("The cell data does not match");
		}
		
		
		
		

	}

}
