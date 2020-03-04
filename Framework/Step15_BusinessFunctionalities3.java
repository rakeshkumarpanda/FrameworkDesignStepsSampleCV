package com.seleniumeasy.BusinessLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.seleniumeasy.CommonLibrary.CommonFunctionalities;
import com.seleniumeasy.WebElementRepository.DemoPageElements;
import com.seleniumeasy.WebElementRepository.HomePageElement;
import com.seleniumeasy.WebElementRepository.SubmitFormPageElements;

public class BusinessFunctionalities extends CommonFunctionalities
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
		elementClick(homePageElements.getDemoWebsiteLink(), "Demo Website Link");

		// Demo Page Elements
		// 4. Click on Input Forms tab
		elementClick(demoPageElements.getInputFormsTab(), "Input Form Tab");
		// 5. Click on Input Form Submit Link
		elementClick(demoPageElements.getInputFormSubmitLink(), "Input Submit Form Link");

		// Submit Form Page Elements
		// 6. Enter First Name
		enterValueToTextField(submitFormPageElements.getFirstNameField(), "First Name Field", firstName);
		// 7. Enter Last Name
		enterValueToTextField(submitFormPageElements.getLastNameField(), "Last Name Field", lastName);
		// 8. Enter Email ID
		enterValueToTextField(submitFormPageElements.getEmailField(), "E-Mail Field", email);
		// 9. Select an option from state dropdown
		scrollPageUntilWebElementVisible(driver, submitFormPageElements.getStateDropdown(), "State Dropdown");
		selectDropdownValue(submitFormPageElements.getStateDropdown(), "State Dropdown", state);
		// 10. Click on Yes Radio Button
		elementClick(submitFormPageElements.getYesRadioButton(), "Yes Radio Button");
		//11. Clicking on Selenium easy image
		elementClick(submitFormPageElements.getSeleniumEasyImage(), "Selenium Easy image");
	}

}
