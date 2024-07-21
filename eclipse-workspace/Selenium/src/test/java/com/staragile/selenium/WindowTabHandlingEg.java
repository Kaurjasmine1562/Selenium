package com.staragile.selenium;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class WindowTabHandlingEg {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Navjot\\Documents\\Web Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/#top");

		WebElement radiobutton = driver.findElement(By.xpath("//input[@value='radio2']"));
		radiobutton.click();

		WebElement country = driver.findElement(By.xpath("//input[@id='autocomplete']"));
		country.clear();
		country.sendKeys("India");   

		Thread.sleep(1000);

		WebElement India = driver.findElement(By.xpath("//div[@id='ui-id-3']"));
		India.click();

		WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		dropdown.click();

		Select dd = new Select(dropdown);
		dd.selectByIndex(2);

		WebElement check = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		check.click();

		WebElement check3 = driver.findElement(By.xpath("//input[@id='checkBoxOption3']"));
		check3.click();

		WebElement openwindow = driver.findElement(By.xpath("//button[@id='openwindow']"));
		openwindow.click();

		//Get current window handle(Parent window handle)
		String parentWindowHandle = driver.getWindowHandle();

		//Get all window handles
		Set<String> allWindowHandles = driver.getWindowHandles();

		//Switch to child window
		for(String handle: allWindowHandles ) {
			if(!handle.equalsIgnoreCase(parentWindowHandle)) {
				driver.switchTo().window(handle);

				Thread.sleep(1000);

				//You can perform any action on child window here

				//Close the child window
				driver.close();

				//Switch the control back to the parent window
				driver.switchTo().window(parentWindowHandle);

				WebElement opentab = driver.findElement(By.xpath("//a[@id='opentab']"));
				opentab.click();

				//Get current window handle(Parent window handle)
				String parentWindowHandle1 = driver.getWindowHandle();

				//Get all window handles
				Set<String> allWindowHandles1 = driver.getWindowHandles();

				//Switch to child window
				for (String handle1 : allWindowHandles1) {
					if (!handle1.equals(parentWindowHandle1)) {
						driver.switchTo().window(handle1);

						Thread.sleep(1000);

						//Perform action on child window
						driver.close();

						//Switch the control back to the parent window
						driver.switchTo().window(parentWindowHandle1);


						WebElement entername = driver.findElement(By.xpath("//input[@id='name']"));
						entername.click();
						entername.sendKeys("Jasmine");

						WebElement alert = driver.findElement(By.xpath("//input[@id='alertbtn']"));
						alert.click();

						Thread.sleep(1000);

						Alert alt = driver.switchTo().alert();    
						alt.accept();
						
						JavascriptExecutor js = (JavascriptExecutor)driver;
			     		
			     		js.executeScript("window.scrollBy(0 ,400)", "");

						//find the no. of rows in a web table
						List<WebElement> rowno = driver.findElements(By.xpath("//table[@id='product']/tbody/tr"));
						int rowsize = rowno.size();
						System.out.println(rowsize);

						//Find no. of columns in a web table
						List<WebElement> colno = driver.findElements(By.xpath("//table[@id='product']/tbody/tr[1]/td"));
						int colsize = colno.size();
						System.out.println(colsize);
						
						Thread.sleep(2000);

						WebElement hide = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
						hide.click();

						Thread.sleep(2000);

						WebElement show = driver.findElement(By.xpath("//input[@id='show-textbox']"));
						show.click();
						
						Thread.sleep(1000);

						WebElement mousehover = driver.findElement(By.xpath("//button[@id='mousehover']"));
						mousehover.click();

						WebElement top = driver.findElement(By.xpath("//a[contains(text(),'Top')]"));
						top.click();
                       
					}
				}
                  }
			}
                }
                      }
