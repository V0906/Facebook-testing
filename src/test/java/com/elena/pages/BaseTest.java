package com.elena.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public abstract class BaseTest {
	
	static protected WebDriver driver;
	
	public BaseTest(WebDriver driver) {
		this.driver=driver;
	}
	@BeforeSuite(alwaysRun = true)
	public void setUp(){
		driver = new FirefoxDriver();
		}
	@AfterSuite(alwaysRun = true)
	public void tearDown(){
		driver.quit();
		}
	
	//BOTTOM METHOD CREATED FOR CONFIGURATION IN POM.XML(UNDER PLUGINS, CONFIGURATION, 
		//SYSTEM.VARIABLES PROPERTY
		/*public void setUp(){
			//driver = new FirefoxDriver();
			if(browser == "chrome"){
			driver = new ChromeDriver();
			//}
		}else if(browser == "ie"){
			driver = new InternetExplorerDriver();
			
		}else if(browser == "opera"){
			driver = new OperaDriver();
			
		}else if(browser == "firefox"){
			driver = new FirefoxDriver();
		}
	}*/

}
