package dataprovider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import datacontroller.DataController;

public class Customer
{

	@DataProvider(name="createcustomer")
	public Object[][] createcustomer() throws IOException
	{
		return new DataController().Customer_DC();
	}
	
	
	
}
