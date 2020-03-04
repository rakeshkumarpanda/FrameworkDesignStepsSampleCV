package com.seleniumeasy.RunnerClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.seleniumeasy.BrowserHandling.BrowserHandling;
import com.seleniumeasy.BusinessLib.BusinessFunctionalities;

public class DriverScript extends BrowserHandling
{
	BusinessFunctionalities businessFunctions;
	@BeforeClass
	public void initObjects()
	{
		businessFunctions = new BusinessFunctionalities(driver);
	}
	@Test(dataProvider="SubmitFormDataCollection", dataProviderClass=com.seleniumeasy.DataCollections.DataCollection.class)
	public void submitFormTest(String scenario, String firstName, String lastName, String email, String state) throws InterruptedException
	{		
		businessFunctions.submitForm(scenario, firstName, lastName, email, state);
	}
}