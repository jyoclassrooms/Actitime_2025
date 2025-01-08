package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.testng.annotations.BeforeMethod;

import pageobject.Login_Page;

public class WebBase 
{
	 WebDriver driver=null;
	 String browser="chrome";
	 String url="http://127.0.0.1/login.do";
	 @BeforeMethod
	 public void login()
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
		 login.get_username().sendKeys("admin");
		 login.get_password().sendKeys("manager");
		 login.get_login().click();
	 }

}
