package mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ques3 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Navjot\\Documents\\Web Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");

		Thread.sleep(1000);

		//customer login click
		WebElement customerlogin = driver.findElement(By.xpath("//button[contains(text(),'Customer Login')]"));
		customerlogin.click();

		Thread.sleep(1000);

		//select harry potter from dropdown				
		WebElement name = driver.findElement(By.xpath("//select[@id='userSelect']"));
		name.findElement(By.xpath("//option[contains(text(),'Harry Potter')]")).click();
		
		//click on login button
				WebElement login = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
				login.click();

}
}