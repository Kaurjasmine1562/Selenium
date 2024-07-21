package org.sample.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomerLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Navjot\\Documents\\Web Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");

		Thread.sleep(1000);

		//customer login click.
		WebElement customerlogin = driver.findElement(By.xpath("//button[contains(text(),'Customer Login')]"));
		customerlogin.click();

		Thread.sleep(1000);

		//select harry potter from dropdown				
		WebElement name = driver.findElement(By.xpath("//select[@id='userSelect']"));
		name.findElement(By.xpath("//option[contains(text(),'Harry Potter')]")).click();

		//click on login button
		WebElement login = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		login.click();

		Thread.sleep(1000);

		WebElement transactions = driver.findElement(By.xpath("//button[contains(text(),'Transactions')]"));
		WebElement deposit = driver.findElement(By.xpath("//button[contains(text(),'Deposit')]"));
		WebElement withdrawl = driver.findElement(By.xpath("//button[contains(text(),'Withdrawl')]"));

		if(transactions.isDisplayed() && deposit.isDisplayed() && withdrawl.isDisplayed()) {
			System.out.println("all tabs are displayed");
		} else {
			System.out.println("No tabs are visible");

		}

		deposit.click();

		Thread.sleep(1000);

		WebElement amount = driver.findElement(By.xpath("//input[@placeholder='amount']"));
		amount.click();
		amount.sendKeys("5000");

		WebElement deposit1 = driver.findElement(By.xpath("//button[@type='submit']"));
		deposit1.click();

		Thread.sleep(1000);

		WebElement successful = driver.findElement(By.xpath("//span[contains(text(),'Deposit Successful')]"));

		if(successful.isDisplayed()) {
			System.out.println(" Disposit successful");
		} else {
			System.out.println("Deposit unsuccessful");
		}

		transactions.click();

		Thread.sleep(1000);

		// Select May month from dropdown
		WebElement monthDropdown = driver.findElement(By.xpath("//input[@id='start']"));

		monthDropdown.click();

		// Verify that deposits are displayed in the table with the amount
		/*  WebElement depositAmount = driver.findElement(By.xpath("//td[contains(text(),'Deposit')]/following-sibling::td"));
        if (depositAmount.isDisplayed()) {
            System.out.println("Deposits are displayed in the table with the amount.");
        } else {
            System.out.println("Deposits are not displayed in the table with the amount.");
            return;
        }*/

		WebElement back = driver.findElement(By.xpath("//button[contains(text(),'Back')]"));
		back.click();

		Thread.sleep(1000);
		WebElement withdrawl1 = driver.findElement(By.xpath("//button[contains(text(),'Withdrawl')]"));
		withdrawl1.click();

		Thread.sleep(1000);

		WebElement amount1 = driver.findElement(By.xpath("//input[@placeholder='amount']"));
		amount1.click();

		amount1.sendKeys("1000");

		WebElement withdraw = driver.findElement(By.xpath("//button[@type='submit']"));
		withdraw.click();

		WebElement trnsucess = driver.findElement(By.xpath("//span[contains(text(),'Transaction successful')]"));

		if(trnsucess.isDisplayed()) {

			System.out.println("Withdrawl successful");
		} else {
			System.out.println("not successful");
		}

		WebElement transactions1 = driver.findElement(By.xpath("//button[contains(text(),'Transactions')]"));

		transactions1.click(); 

		// Verify that withdrawals are displayed in the table with the amount
		WebElement withdrawalAmount = driver.findElement(By.xpath("(//table[@class='table table-bordered table-striped'])/tbody/tr[1]"));
		
		if (withdrawalAmount.isDisplayed()) {
			System.out.println("Withdrawals are displayed in the table with the amount.");
		} else {
			System.out.println("Withdrawals are not displayed in the table with the amount.");
			return;
		}
		
		driver.close();

	}
}
