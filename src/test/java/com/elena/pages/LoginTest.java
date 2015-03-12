package com.elena.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
	
protected WebDriver driver;
	
	@BeforeSuite(alwaysRun = true)
	public void setUp(){
		driver = new FirefoxDriver();
		}
	@AfterSuite(alwaysRun = true)
	public void tearDown(){
		driver.quit();
		}
	
	
	@Test
	public void login(){
		driver.get("http://www.facebook.com/");
		/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
	}

}
