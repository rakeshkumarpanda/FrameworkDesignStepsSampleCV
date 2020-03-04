package com.seleniumeasy.CommonLibrary;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class CommonFunctionalities {
	
	public void elementClick(WebElement element, String elementName)
	{
		try
		{
			if(element.isDisplayed())
			{
				Reporter.log(elementName+" is displaying on UI");
				if(element.isEnabled())
				{
					Reporter.log(elementName+" is enabled on UI");
					element.click();
					Reporter.log(elementName+" is clicked");
				}
			}
		}
		catch(NoSuchElementException e)
		{
			Reporter.log(elementName+" is not displayed on UI");
		}
		catch(Exception e)
		{
			Reporter.log(e.toString());
		}
	}
	public void enterValueToTextField(WebElement element, String elementName, String value)
	{
		try
		{
			if(element.isDisplayed())
			{
				Reporter.log(elementName+" is displaying on UI");
				if(element.isEnabled())
				{
					Reporter.log(elementName+" is enabled on UI");
					element.sendKeys(value);
					Reporter.log(elementName+" is entered with "+value);
				}
			}
		}
		catch(NoSuchElementException e)
		{
			Reporter.log(elementName+" is not displayed on UI");
		}
		catch(Exception e)
		{
			Reporter.log(e.toString());
		}
	}
	public void selectDropdownValue(WebElement element, String elementName, String option)
	{
		try
		{
			if(element.isDisplayed())
			{
				Reporter.log(elementName+" is displaying on UI");
				if(element.isEnabled())
				{
					Reporter.log(elementName+" is enabled on UI");
					Select sel = new Select(element);
					sel.selectByVisibleText(option);
					Reporter.log(elementName+" is selected with option "+option);
				}
			}
		}
		catch(NoSuchElementException e)
		{
			Reporter.log(elementName+" is not displayed on UI");
		}
		catch(Exception e)
		{
			Reporter.log(option+" is not displaying on "+element+" dropdown");
		}
	}
	public void scrollPageUntilWebElementVisible(WebDriver driver, WebElement element, String elementName)
	{
		try
		{
			if(element.isDisplayed())
			{
				Reporter.log(elementName+" is displaying on UI");
				if(element.isEnabled())
				{
					Reporter.log(elementName+" is enabled on UI");
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("arguments[0].scrollIntoView()", element);
					Reporter.log("Page is scrolled down until "+elementName+" is visible");
				}
			}
		}
		catch(NoSuchElementException e)
		{
			Reporter.log(elementName+" is not displayed on UI");
		}
		catch(Exception e)
		{
			Reporter.log(e.toString());
		}
	}
	public void explicitWait(WebDriver driver, WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
}
