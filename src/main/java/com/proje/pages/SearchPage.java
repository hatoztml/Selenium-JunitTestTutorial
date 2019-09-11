package com.proje.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {

	private String countResult;
	
	public static void searchSamsung(WebDriver driver) {

		driver.findElement(By.id("searchData")).sendKeys("samsung");
		driver.findElement(By.className("searchBtn")).click();

		secondPageForSamsungSearch(driver);
		//selectProduct(driver);

	}

	
	public static void secondPageForSamsungSearch(WebDriver driver) {
		//TODO This method not working
		//driver.findElement(By.xpath("//*[@id='contentListing']/div/div/div[2]/div[3]/a[2]")).click();
		selectProduct(driver);
	}
	
	public static void selectProduct(WebDriver driver) {
		
		driver.navigate().to("https://www.n11.com/arama?q=samsung&pg=2");
		
		driver.findElement(By.xpath("//*[@id='p-323058214']/div[1]/a")).click();
		
		FavoritePage.addFavList(driver);

	}


	public String getCountResult() {
		return countResult;
	}


	public void setCountResult(String countResult) {
		this.countResult = countResult;
	}
}
