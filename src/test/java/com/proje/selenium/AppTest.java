package com.proje.selenium;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }
    
    protected static WebDriver driver;
	
	 
	@BeforeClass
	public static void before(){
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe"); 
		driver=new ChromeDriver();
	}
	@AfterClass
	public static void after() throws InterruptedException{
		Thread.sleep(3000);
	} 
	
	public WebDriver getDriver(){
		return driver;
	}
}
