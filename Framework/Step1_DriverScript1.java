package com.seleniumeasy.RunnerClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DriverScript 
{
	@Test
	public void submitFormTest() throws InterruptedException
	{
		//1. Opening the Browser
		String chromeDriverPath = System.getProperty("user.dir")+"\\BrowserDrivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		WebDriver driver = new ChromeDriver();
		
		//2. Maximize the web browser and navigate to application
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/");
		
		
		//Home Page Elements
		//3. Click on Demo Website! link
		driver.findElement(By.xpath("//a[contains(text(),'Demo Website!')]")).click();
		
		
		//Demo Page Elements
		//4. Click on Input Forms tab
		driver.findElement(By.xpath("//li[@class='dropdown']/a[contains(text(),'Input Forms')]")).click();
		//5. Click on Input Form Submit Link
		driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Input Form Submit')]")).click();
		
		
		//Submit Form Page Elements
		//6. Enter First Name
		driver.findElement(By.xpath("//label[contains(text(),'First Name')]/following-sibling::div//input")).sendKeys("First1");
		//7. Enter Last Name
		driver.findElement(By.xpath("//label[contains(text(),'Last Name')]/following-sibling::div//input")).sendKeys("Last1");
		//8. Enter Email ID
		driver.findElement(By.xpath("//label[contains(text(),'E-Mail')]/following-sibling::div//input")).sendKeys("first1@last1.com");
		//9. Select an option from state dropdown
		WebElement stateDropdown = driver.findElement(By.name("state"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", stateDropdown);
		Select sel = new Select(stateDropdown);
		sel.selectByVisibleText("Kansas");
		//10. Click on Yes Radio Button
		driver.findElement(By.xpath("//input[@value='yes']")).click();
		
		
		//11. Close the browser
		Thread.sleep(3000);
		driver.quit();
	}

}
