package com.seleniumeasy.WebElementRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoPageElements 
{
	@FindBy(xpath = "//li[@class='dropdown']/a[contains(text(),'Input Forms')]")
	private WebElement inputFormsTab;
	@FindBy(xpath = "//ul[@class='dropdown-menu']//a[contains(text(),'Input Form Submit')]")
	private WebElement inputFormSubmitLink;
	public WebElement getInputFormsTab() {
		return inputFormsTab;
	}
	public WebElement getInputFormSubmitLink() {
		return inputFormSubmitLink;
	}

}
