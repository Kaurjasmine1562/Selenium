package com.staragile.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameters {

	@Test
	@Parameters("browser")
	public void invokechrome(String browser) {

		if(browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver","C:\\Users\\Navjot\\Documents\\Web Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.selenium.dev/");


		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.firefox.driver","C:\\Users\\Navjot\\Documents\\Web Drivers\\geckodriver-v0.34.0-win32\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.selenium.dev/");


		} else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.Microsoft.driver","C:\\Users\\Navjot\\Documents\\Web Drivers\\edgedriver_win32\\msedgedriver.exe");
			WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.selenium.dev/");

		}


	}
}
