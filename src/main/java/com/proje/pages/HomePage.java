package com.proje.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.proje.selenium.DriverSelenium;

public class HomePage {

	

	public static void  openHomePage() {
		
		DriverSelenium webdriver= null;
		
		WebDriver driver = webdriver.webDriver();
		
		driver.navigate().to("https://n11.com.tr");
		
		LoginPage.loginPageOpen(driver);
		
		
	}
	
	
	
	
}
