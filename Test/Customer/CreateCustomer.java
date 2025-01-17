package Customer;

import org.testng.annotations.Test;

import Utility.Log;
import dataprovider.Customer;

public class CreateCustomer
{

	
	@Test(dataProvider ="createcustomer",dataProviderClass = Customer.class)
	public void createcustomer(String custname,String cust_desc)
	{
		Log.loginfo("custname->"+custname);
		Log.loginfo("custdescription->"+cust_desc);
	}
	
	
}
