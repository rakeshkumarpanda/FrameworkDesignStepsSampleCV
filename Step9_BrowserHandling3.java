package com.seleniumeasy.BrowserHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BrowserHandling {
	
	public WebDriver driver;
	@BeforeTest
	public void browserHandling()
	{
		String browser = "Chrome";
		if(browser.equals("Chrome"))
		{
			//1. Opening the Browser
			String chromeDriverPath = System.getProperty("user.dir")+"\\BrowserDrivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", chromeDriverPath);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(browser.equals("Headless"))
		{
			//Code for launching Headless browser
			String chromeDriverPath = System.getProperty("user.dir")+"\\BrowserDrivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", chromeDriverPath);
			ChromeOptions co = new ChromeOptions();
			co.setHeadless(true);
			driver = new ChromeDriver(co);
		}
		//2. Maximize the web browser and navigate to application
		driver.get("https://www.seleniumeasy.com/");
	}
	@AfterTest
	public void closeBrowser() throws InterruptedException
	{
		//12. Close the browser
		Thread.sleep(3000);
		driver.quit();
	}

}
