package com.seleniumeasy.BusinessLib;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.seleniumeasy.WebElementRepository.DemoPageElements;
import com.seleniumeasy.WebElementRepository.HomePageElement;
import com.seleniumeasy.WebElementRepository.SubmitFormPageElements;

public class BusinessFunctionalities 
{
	WebDriver driver;
	HomePageElement homePageElements;
	DemoPageElements demoPageElements;
	SubmitFormPageElements submitFormPageElements;
	public BusinessFunctionalities(WebDriver driver)
	{
		this.driver = driver;
	}
	private void initPages()
	{
		homePageElements = PageFactory.initElements(driver, HomePageElement.class);
		demoPageElements = PageFactory.initElements(driver, DemoPageElements.class);
		submitFormPageElements = PageFactory.initElements(driver, SubmitFormPageElements.class);
	}

	public void submitForm(String scenario, String firstName, String lastName, String email, String state) 
	{
		initPages();
		// Home Page Elements
		// 3. Click on Demo Website! link
		homePageElements.getDemoWebsiteLink().click();

		// Demo Page Elements
		// 4. Click on Input Forms tab
		demoPageElements.getInputFormsTab().click();
		// 5. Click on Input Form Submit Link
		demoPageElements.getInputFormSubmitLink().click();

		// Submit Form Page Elements
		// 6. Enter First Name
		submitFormPageElements.getFirstNameField().sendKeys(firstName);
		// 7. Enter Last Name
		submitFormPageElements.getLastNameField().sendKeys(lastName);
		// 8. Enter Email ID
		submitFormPageElements.getEmailField().sendKeys(email);
		// 9. Select an option from state dropdown
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", submitFormPageElements.getStateDropdown());
		Select sel = new Select(submitFormPageElements.getStateDropdown());
		sel.selectByVisibleText(state);
		// 10. Click on Yes Radio Button
		submitFormPageElements.getYesRadioButton().click();		
		//11. Clicking on Selenium easy image
		submitFormPageElements.getSeleniumEasyImage().click();
	}

}
