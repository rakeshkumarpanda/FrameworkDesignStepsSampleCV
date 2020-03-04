package com.seleniumeasy.BrowserHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BrowserHandling {
	
	public WebDriver driver;
	@BeforeTest
	public void browserHandling()
	{
		//1. Opening the Browser
		String chromeDriverPath = System.getProperty("user.dir")+"\\BrowserDrivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver = new ChromeDriver();
		
		//2. Maximize the web browser and navigate to application
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/");
	}
	@AfterTest
	public void closeBrowser() throws InterruptedException
	{
		//11. Close the browser
		Thread.sleep(3000);
		driver.quit();
	}

}
