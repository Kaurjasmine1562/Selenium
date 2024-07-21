package com.staragile.testNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class TestNGAssertions {
	
	public void ass() throws InterruptedException {	
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Navjot\\Documents\\Web Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(2000);
		
	 WebElement username = driver.findElement(By.xpath("//input[@name = 'username']"));
	 
	 username.clear();
	 
    // username.sendKeys("Admin");
     
     Thread.sleep(2000);
     
     WebElement password = driver.findElement(By.xpath("//input[@name = 'password']"));
     
     password.sendKeys("admin123");
     
     Thread.sleep(2000);
     
     WebElement login = driver.findElement(By.xpath("//button[@type = 'submit']"));
     login.click();
     
     WebElement errmsg = driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']"));
     String Actualres = errmsg.getText();
     
     System.out.println(Actualres);
     
     String Expectedres = "Required";
     Assert.assertEquals(Actualres, Expectedres);
    
     
     
	
	


}
}