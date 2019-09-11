package com.proje.selenium;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebElement;

import com.proje.pages.FavoritePage;
import com.proje.pages.HomePage;
import com.proje.pages.LoginPage;
import com.proje.pages.SearchPage;

public class OtherTest  extends  AppTest{
	
	public OtherTest(String testName) {
		super(testName);
		// TODO Auto-generated constructor stub
	}

	@Test
	public void test_1_1_homePageControl(){ 
		HomePage homePage=new HomePage();
		homePage.openHomePage();
		Assert.assertTrue(driver.getTitle().equals("n11.com - Alışverişin Uğurlu Adresi")); 
		System.out.println("N11 Alışveriş sitesi başarılı bir şekilde açıldı");
	}
	
	@Test
	public void test_1_2_loginPage(){ 
		LoginPage loginPage=new LoginPage();
		loginPage.loginPageOpen(driver);
		Assert.assertTrue(driver.getTitle().equals("Giriş Yap - n11.com"));
		System.out.println("Kullanıcı girişi için sayfa başarılı bir şekilde açıldı...");
	}
	
	@Test
	public void test_1_3_signIn(){
		LoginPage loginPage =new LoginPage();
		loginPage.signIn(driver); 
		Assert.assertTrue(loginPage.getUsername().equals("Hatip Öztemel"));
		System.out.println("Kullanıcı Girişi Başarılı ...");
	 
	}
	
	@Test
	public void test_1_4_dataSearch() {  
		SearchPage searchPage =new SearchPage(); 
		Assert.assertTrue(!searchPage.getCountResult().equals(""));
		System.out.println("Samsung için sonuç bulundu");
	 
	}
	
	@Test
	public void test_1_5_searchSecondPage() {
		SearchPage searchPage =new SearchPage();
		Assert.assertTrue(driver.getTitle().contains("Samsung - n11.com - 2/"));
		System.out.println("2. Sayfa başarılı bir şekilde açıldı...");
	 
	}
	
	@Test
	public void test_1_6_selectThirdProductAndAddToFavorites (){ 
		SearchPage searchPage =new SearchPage();
		searchPage.selectProduct(driver);
		System.out.println("Favoriye Eklenen Ürün Getirilemedi");
	 
	}
	
	@Test
	public void test_1_7_clickMyFavorites () {  
		FavoritePage favouritePage =new FavoritePage();
		favouritePage.addFavList(driver);
		System.out.println("Favoriler için hesap sayfası başarılı bir şekilde açıldı...");
	 
	}

}