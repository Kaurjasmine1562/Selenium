package mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Webdriverclassques4 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Navjot\\Documents\\Web Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://example.com/register");
        

        // Find input fields and submit button
        WebElement usernameInput = driver.findElement(By.id("username"));
        WebElement emailInput = driver.findElement(By.id("email"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement confirmPasswordInput = driver.findElement(By.id("confirmPassword"));
        WebElement submitButton = driver.findElement(By.id("submit"));

        // Fill out the form
        usernameInput.sendKeys("testuser");
        emailInput.sendKeys("testuser@example.com");
        passwordInput.sendKeys("password");
        confirmPasswordInput.sendKeys("password");

        // Click on the submit button
        submitButton.click();

        // Wait for registration confirmation message
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement confirmationMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("confirmation-message")));

        // Assert that the confirmation message is displayed
        if (confirmationMessage.isDisplayed()) {
            System.out.println("Registration successful!");
        } else {
            System.out.println("Registration failed!");
        }

        // Close the browser
        driver.quit();
    }

}
