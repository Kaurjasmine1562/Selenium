package mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ques2 {
	
	WebDriver driver;
	
	
	
	//Xpaths
	
		private By email = By.xpath("//input[@id='email']");
		private By password = By.xpath("//input[@id='pass']");
		private By login = By.xpath("//button[@id='loginbutton']");
		private By forgotaccount = By.xpath("//a[contains(text(),'Forgotten account?')]");
		private By signup = By.xpath("//a[contains(text(),'Sign up for Facebook')]");
		private By title = By.xpath("//div[contains(text(),'Log in to Facebook')]");
		private By logo = By.xpath("//img[@class='_97vu img']");
		
		//Setup
		public void setup() {
		 System.setProperty("webdriver.Microsoft.driver","C:\\Users\\Navjot\\Documents\\Web Drivers\\edgedriver_win32\\msedgedriver.exe");
		 WebDriver driver = new EdgeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/login");			
			}
		
		//functions
		
		//Login Function
		public void login() throws InterruptedException {
		driver.findElement(email).click();
		driver.findElement(email).sendKeys("Jasmine");
		
		Thread.sleep(1000);
		
		driver.findElement(password).click();
		driver.findElement(password).sendKeys("123456");
		
		Thread.sleep(1000);
		
		driver.findElement(login).click();
            }
		
		 public void verifylogo() {
	    	 driver.findElement(logo).isDisplayed();
	     }
	     
	     public void verifyforgotaccount() {
	    	 driver.findElement(forgotaccount).isDisplayed();
	     }
	     
	     public void verifysignup() {
	    	 driver.findElement(signup).isDisplayed();
	     }
	     
	     public void verifytitle() {
	    	 driver.findElement(title).isDisplayed();
	     }
		
		
		
		
		
		}
