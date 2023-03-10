package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
public WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(id="Email")
	@CacheLookup
	WebElement txtusername;
	@FindBy(id="Password")
	@CacheLookup
	WebElement txtPassword;
	@FindBy(xpath="/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")
	@CacheLookup
	WebElement btnlogin;
	@FindBy(xpath="//*[@id=\"navbarText\"]/ul/li[3]/a")
	@CacheLookup
	WebElement btnlogout;
	
	public void setusername(String uname)
	{
		txtusername.clear();
		txtusername.sendKeys(uname);
		
	}
	public void setpassword(String pwd)
	{
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
	}
	
	public void login()
	{
		btnlogin.click();
	}
	public void logout()
	{
		btnlogout.click();
	}
	
	
	
	

}
