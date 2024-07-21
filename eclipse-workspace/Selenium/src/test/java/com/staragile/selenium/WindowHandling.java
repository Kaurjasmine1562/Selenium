package com.staragile.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Navjot\\Documents\\Web Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().minimize();
		driver.get("https://the-internet.herokuapp.com/windows");

		Thread.sleep(4000);

		//get the parent window handling

		String parentwindow = driver.getWindowHandle();

		System.out.println(parentwindow);

		WebElement click = driver.findElement(By.xpath("//a[contains(text(),'Click Here')]"));

		click.click();

		//Get all window handles
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);

		//Iterate among windows
		Iterator<String> iterator = windowhandles.iterator();

		while (iterator.hasNext()) {
			String childwindow = iterator.next();

			//Giving control to child window
			if(!parentwindow.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);

				//Performing actions on child window
				String text = driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText();
				System.out.println(text);

				driver.close();

				//switch back to parent window
				driver.switchTo().defaultContent();


			}
		}




	}

}
