package com.proje.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private static String Username="14545515@firat.edu.tr";

	public static void loginPageOpen(WebDriver driver) {
		
		driver.findElement(By.className("btnSignIn")).click();
		signIn(driver);
	}
	
	public static void signIn(WebDriver driver) {
		
		driver.findElement(By.id("email")).sendKeys(Username);
		driver.findElement(By.id("password")).sendKeys("H123456");
		driver.findElement(By.id("loginButton")).click();
		
		SearchPage.searchSamsung(driver);

	}

	public static String getUsername() {
		return Username;
	}

	public static void setUsername(String username) {
		Username = username;
	}
}
