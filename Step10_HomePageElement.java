package com.seleniumeasy.WebElementRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageElement 
{
	@FindBy(xpath = "//a[contains(text(),'Demo Website!')]")
	private WebElement demoWebsiteLink;

	public WebElement getDemoWebsiteLink() 
	{
		return demoWebsiteLink;
	}
	
	

}
