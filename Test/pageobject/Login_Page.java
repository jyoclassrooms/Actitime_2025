package pageobject;

import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Login_Page 
{

	WebDriver driver;
	
	public Login_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);	
			
	}
	
	@FindBy(name = "username")
	 private WebElement un;
	
	@FindBy(name = "pwd")
	private WebElement password;
	
	@FindBy(id = "loginButton")
	private WebElement login;
	
	@FindBys({
	    @FindBy(xpath = "//a"),
	    
	    })
	    public List<WebElement> allElementsInList;
	
	public WebElement get_username()
	{
		return un;
	}
	
	public WebElement get_password()
	{
		return  password;
	}
	
	public WebElement get_login()
	{
		return login;
	}
	
}
