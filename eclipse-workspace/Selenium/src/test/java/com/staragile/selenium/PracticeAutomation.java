package com.staragile.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeAutomation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Navjot\\Documents\\Web Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/cart");

		WebElement electronics = driver.findElement(By.xpath("//a[@href='/electronics']"));

		electronics.click();

		WebElement camandphoto = driver.findElement(By.linkText("Camera & photo"));
		
		camandphoto.click();

		WebElement addtocart = driver.findElement(By.cssSelector("div.master-wrapper-page:nth-child(7) div.master-wrapper-content div.master-column-wrapper div.center-2 div.page.category-page div.page-body div.products-container div.products-wrapper div.product-grid div.item-grid div.item-box:nth-child(1) div.product-item div.details div.add-info div.buttons > button.button-2.product-box-add-to-cart-button:nth-child(1)"));
		addtocart.click();
		
//		WebElement blackcam = driver.findElement(By.xpath("//div[contains(text(),'Nikon D5500 DSLR - Black')]"));
		
//		WebElement black = driver.findElement(By.linkText("Nikon D5500 DSLR - Black"));
		
		
      //   Actions act = new Actions(driver);
                
      //   act.moveToElement(blackcam).perform();
		


		WebElement addtocart1 = driver.findElement(By.xpath("//button[@id='add-to-cart-button-14']"));

	//	Actions act = new Actions(driver);
        
	  //  act.moveToElement(addtocart1).build().perform();
	     
	  //  act.scrollToElement(addtocart1);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0 ,800)", "");
		
	    addtocart1.click();
	    
	    WebElement cart = driver.findElement(By.id("topcartlink"));
	    
	    cart.click();
	    
	}

}
