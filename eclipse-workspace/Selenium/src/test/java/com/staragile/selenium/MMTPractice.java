package com.staragile.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MMTPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Navjot\\Documents\\Web Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/international-flights/?gclid=Cj0KCQjw0_WyBhDMARIsAL1Vz8tNxc4kQY0xxC5TibPAkTlLUqL0WUe2lqbVltfyg2p_OTkKPgO2aigaApxYEALw_wcB&cmp=SEM|D|IF|G|Brand|IF_Brand_Exact-Ex_India|Brand_Exact_Ex_india|RSA|Regular|NewFunnel|645153719700&s_kwcid=AL!1631!3!645153719700!e!!g!!mmt&ef_id=Cj0KCQjw0_WyBhDMARIsAL1Vz8tNxc4kQY0xxC5TibPAkTlLUqL0WUe2lqbVltfyg2p_OTkKPgO2aigaApxYEALw_wcB:G:s&gad_source=1");
		
		
		

	}

}
