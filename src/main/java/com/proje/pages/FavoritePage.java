package com.proje.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FavoritePage {

	public static void addFavList(WebDriver driver) {
	
		driver.findElement(By.xpath("//*[@id='contentProDetail']/div/div[3]/div[2]/div[3]/div[3]/a[3]")).click();
		
		driver.findElement(By.xpath("//*[@id='contentProDetail']/div/div[3]/div[2]/div[3]/div[3]/div[1]/div/a[1]")).click();
		
	}
	
	public static void removeFavList(WebDriver driver) {
		
		driver.findElement(By.xpath("//*[@id='header']/div/div/div[2]/div[2]/div[2]/div/a[2]")).click();

		driver.findElement(By.xpath("//*[@id='myAccount']/div[3]/ul/il[1]/a")).click();
		
		driver.findElement(By.xpath("//*[@id='view']/ul/li/div/div[3]/a")).click();
		
		

	}
}

