package com.staragile.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationExerciseContactUs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Navjot\\Documents\\Web Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		//invoke the chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/contact_us");

		WebElement name = driver.findElement(By.name("name"));
		name.sendKeys("Jasmine");

		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("kaurjasmine1562@gmail.com");

		WebElement subject = driver.findElement(By.name("subject"));
		subject.sendKeys("error");

		WebElement message = driver.findElement(By.id("message"));
		message.sendKeys("Site is giving runtime error");

		WebElement submit = driver.findElement(By.linkText("Submit"));
		submit.click();

	}

}
