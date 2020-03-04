package com.seleniumeasy.DataCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class DataCollection {
	
	String excelPath = System.getProperty("user.dir")+"\\Test Data\\Testdata.xlsx";
	Fillo fillo;
	Connection excelConnection;
	Recordset excelRecords;
	
	public DataCollection() throws FilloException
	{
		fillo = new Fillo();
		excelConnection = fillo.getConnection(excelPath);
	}
	
	@DataProvider(name="SubmitFormDataCollection")
	public Iterator<String[]> submitFormDataCollection() throws FilloException
	{
		String query = "select scenario, firstname, lastname, email, state from sheet1 where flag = 'Y' and scenario = 'Submit Form'";
		excelRecords = excelConnection.executeQuery(query);
		List<String[]> lst = new ArrayList<>();
		try
		{
			if(excelRecords!=null)
			{
				while(excelRecords.next())
				{
					String[] str = new String[5];
					str[0] = excelRecords.getField("scenario");
					str[1] = excelRecords.getField("firstname");
					str[2] = excelRecords.getField("lastname");
					str[3] = excelRecords.getField("email");
					str[4] = excelRecords.getField("state");
					lst.add(str);
				}
			}
		}
		catch(NullPointerException e)
		{
			Reporter.log("Getting Null value");
		}
		catch(Exception e)
		{
			Reporter.log(e.toString());
		}
		return lst.iterator();
	}
	

}
