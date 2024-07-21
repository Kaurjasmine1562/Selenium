package com.staragile.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class InvokeMicrosoftEdge {

	public static void main(String[] args) {
		   System.setProperty("webdriver.Microsoft.driver","C:\\Users\\Navjot\\Documents\\Web Drivers\\edgedriver_win32\\msedgedriver.exe");
				
				WebDriver driver = new EdgeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://www.selenium.dev/");


			}

}
