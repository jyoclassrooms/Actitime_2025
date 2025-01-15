package Customer;

import org.testng.annotations.Test;

import dataprovider.Customer;

public class CreateCustomer
{

	
	@Test(dataProvider ="createcustomer",dataProviderClass = Customer.class)
	public void createcustomer(String custname,String cust_desc)
	{
		System.out.print("custname->"+custname);
		System.out.print("custdescription->"+cust_desc);
	}
	
	
}
