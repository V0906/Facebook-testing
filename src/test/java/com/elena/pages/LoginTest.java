package com.elena.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
	public LoginTest() {
		super(driver);
	}	
	@Test
	public void login(){
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("elena.forrest@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Bruce2003$");
		driver.findElement(By.id("u_0_n")).click();
		List<WebElement> list = driver.findElements(By.tagName("a"));
		for(WebElement link : list){
			System.out.println(link.getText());
		}
		/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
	}
	@Test
	public void logout(){
		List<WebElement> buttons = driver.findElements(By.cssSelector("button"));
		for(WebElement button : buttons){
		System.out.println(button.getText());
		System.out.println("HELLO ELENA");
		driver.findElement(By.id("userNavigationLabel")).click();
		driver.findElement(By.cssSelector("input.uiLinkButtonInput")).click();
		
	}

}
