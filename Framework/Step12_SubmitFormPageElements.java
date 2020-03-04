package com.seleniumeasy.WebElementRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SubmitFormPageElements 
{
	@FindBy(xpath = "//label[contains(text(),'First Name')]/following-sibling::div//input")
	private WebElement firstNameField;
	@FindBy(xpath = "//label[contains(text(),'Last Name')]/following-sibling::div//input")
	private WebElement lastNameField;
	@FindBy(xpath = "//label[contains(text(),'E-Mail')]/following-sibling::div//input")
	private WebElement emailField;
	@FindBy(name = "state")
	private WebElement stateDropdown;
	@FindBy(xpath = "//input[@value='yes']")
	private WebElement yesRadioButton;
	@FindBy(xpath = "//a[contains(text(),'Selenium Easy')]")
	private WebElement seleniumEasyImage;
	public WebElement getFirstNameField() {
		return firstNameField;
	}
	public WebElement getLastNameField() {
		return lastNameField;
	}
	public WebElement getEmailField() {
		return emailField;
	}
	public WebElement getStateDropdown() {
		return stateDropdown;
	}
	public WebElement getYesRadioButton() {
		return yesRadioButton;
	}
	public WebElement getSeleniumEasyImage() {
		return seleniumEasyImage;
	}

}
