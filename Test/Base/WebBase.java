package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import pageobject.Login_Page;

public class WebBase 
{
	 WebDriver driver=null;
	 
	 
	 @Parameters({"browser","url","username","password"})
	
	 @BeforeMethod
	 public void login(String browser,String url,String username,String password)
	 {
		 switch( browser)
		 {
		    case "chrome":
		    	driver=new ChromeDriver();
		        break;
		    case "edge":
		    	driver=new EdgeDriver();
		    	break;
		    case "firefox":
		    	driver=new FirefoxDriver();
		    	break;
		    //"*************************"
		 }
		 
		 driver.get(url);
		 Login_Page login=new Login_Page(driver);
		 login.get_username().sendKeys(username);
		 login.get_password().sendKeys(password);
		 login.get_login().click();
	 }

}
