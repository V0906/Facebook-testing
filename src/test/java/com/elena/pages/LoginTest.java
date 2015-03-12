package com.elena.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("elena.forrest@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Bruce2003$");
		driver.findElement(By.id("u_0_n")).click();
		driver.findElement(By.id("userNavigationLabel")).click();
		driver.findElement(By.cssSelector("input.uiLinkButtonInput")).click();
		/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
	}

}
