package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.testng.annotations.BeforeMethod;

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
		    	
		 }
		 
		 driver.get(url);
		 driver.findElement(By.name(""));
		 
	 }

}
