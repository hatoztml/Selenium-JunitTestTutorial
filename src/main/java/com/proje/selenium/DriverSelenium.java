package com.proje.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSelenium {

	public static WebDriver webDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\76.0.3809.132\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		return driver;
	}
}
