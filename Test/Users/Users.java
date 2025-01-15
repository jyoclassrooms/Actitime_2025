package Users;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



import Base.WebBase;

public class Users 
{

	@Test(dataProvider = "city" ,dataProviderClass = Users.class)
	public void create_city(String cityname,String cityDescription) 
	{
		
		System.out.print("create city "+cityname+"\t");
		System.out.print("create city "+cityDescription);

	}
	
	
	@DataProvider(name = "city")
	public Object[][] customer()
	{
		Object[][] obj= {{"bangalore","garden city"},{"Managalore","harbourcity"},{"mysore","heritage city"}};
	    return obj;
	}
	
	
	
}
