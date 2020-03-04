package com.seleniumeasy.BusinessLib;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BusinessFunctionalities 
{
	WebDriver driver;
	public BusinessFunctionalities(WebDriver driver)
	{
		this.driver = driver;
	}

	public void submitForm(String scenario, String firstName, String lastName, String email, String state) 
	{
		// Home Page Elements
		// 3. Click on Demo Website! link
		driver.findElement(By.xpath("//a[contains(text(),'Demo Website!')]")).click();

		// Demo Page Elements
		// 4. Click on Input Forms tab
		driver.findElement(By.xpath("//li[@class='dropdown']/a[contains(text(),'Input Forms')]")).click();
		// 5. Click on Input Form Submit Link
		driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Input Form Submit')]")).click();

		// Submit Form Page Elements
		// 6. Enter First Name
		driver.findElement(By.xpath("//label[contains(text(),'First Name')]/following-sibling::div//input"))
				.sendKeys(firstName);
		// 7. Enter Last Name
		driver.findElement(By.xpath("//label[contains(text(),'Last Name')]/following-sibling::div//input"))
				.sendKeys(lastName);
		// 8. Enter Email ID
		driver.findElement(By.xpath("//label[contains(text(),'E-Mail')]/following-sibling::div//input"))
				.sendKeys(email);
		// 9. Select an option from state dropdown
		WebElement stateDropdown = driver.findElement(By.name("state"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", stateDropdown);
		Select sel = new Select(stateDropdown);
		sel.selectByVisibleText(state);
		// 10. Click on Yes Radio Button
		driver.findElement(By.xpath("//input[@value='yes']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Selenium Easy')]")).click();
	}

}
