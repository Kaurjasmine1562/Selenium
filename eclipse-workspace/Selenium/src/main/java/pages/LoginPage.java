package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginPage {
	
	WebDriver driver;
	
	//Xpaths
	
	private By username = By.xpath("//input[@name='username']");
	private By password = By.xpath("//input[@name='password']");
	private By login = By.xpath("//button[@type='submit']");
	private By forgotpass = By.linkText("Forgot your passowrd? ");
	private By logo = By.xpath("//div[@class='orangehrm-login-branding']");
	
	
	//Setup
	public void setup() {
		System.setProperty("webdriver.Microsoft.driver","C:\\Users\\Navjot\\Documents\\Web Drivers\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");			
	}
	
	
	
	
	//functions
	
	//Login Function
	public void login() throws InterruptedException {
		
		 driver.findElement(username).clear();
		 driver.findElement(username).sendKeys("Admin");
	        
	        Thread.sleep(2000);
	        
	     driver.findElement(password);
	     driver.findElement(password).sendKeys("admin123");
	        
	        Thread.sleep(2000);
	        
	     driver.findElement(login).click();
	      
		}
	
	     public void verifylogo() {
	    	 driver.findElement(logo).isDisplayed();
	     }
	     
	     public void verifyforgotpasswordlink() {
	    	 driver.findElement(forgotpass).isDisplayed();
	     }




		


		


		

		


}
