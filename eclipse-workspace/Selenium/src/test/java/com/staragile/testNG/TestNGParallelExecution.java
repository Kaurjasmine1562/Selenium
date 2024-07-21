package com.staragile.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestNGParallelExecution {
	
	@Test
	public void testcase1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Navjot\\Documents\\Web Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().minimize();
        driver.get("https://the-internet.herokuapp.com/windows");
        }
        
       
       
	   //testcase2
          @Test
         public void testcase2() {
        	
        	System.setProperty("webdriver.chrome.driver","C:\\Users\\Navjot\\Documents\\Web Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    		WebDriver driver = new ChromeDriver();
    		driver.manage().window().maximize();

    		driver.get("https://www.dummypoint.com/DragAndDrop.html");
    		
    		WebElement hi = driver.findElement(By.xpath("//p[@id='drag']"));
    		WebElement box = driver.findElement(By.xpath("//div[@id='drop']"));
    		Actions alt = new Actions(driver);
    		alt.dragAndDrop(hi, box).perform();
    		
        	}
      	
        
        //testcase3
        @Test
        public void testcase3() {
        	System.setProperty("webdriver.chrome.driver","C:\\Users\\Navjot\\Documents\\Web Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    		WebDriver driver = new ChromeDriver();
    		driver.manage().window().maximize();
            driver.get("https://the-internet.herokuapp.com/iframe");
                        
            //XPATH
            WebElement fr = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
            driver.switchTo().frame(fr);     //****************
            
            WebElement content = driver.findElement(By.xpath("//body[@id='tinymce']"));
            
            content.clear();
            
            content.sendKeys("Jasmine wrote this code");
        }
	

}
