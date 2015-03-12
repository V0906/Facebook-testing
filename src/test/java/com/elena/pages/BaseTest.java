package com.elena.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public abstract class BaseTest {
	
	static protected WebDriver driver;
	
	public BaseTest(WebDriver driver2) {
		BaseTest.driver=driver;
	}
	@BeforeSuite(alwaysRun = true)
	public void setUp(){
		driver = new FirefoxDriver();
		}
	@AfterSuite(alwaysRun = true)
	public void tearDown(){
		driver.quit();
		}

}
