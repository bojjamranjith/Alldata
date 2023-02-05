package com.OrangeHRMApplication;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Log;


public class OrangeHRMLogInPage extends BaseTest {
	
	public OrangeHRMLogInPage() // its a constructor
	{
	PageFactory.initElements(driver, this);
	}

	// Should be written with Identification of Elements of the Webpage
	// Should be written with Business Logics(User Defined methods) - to perform operation
	// on the Elements

	// Object Repository Class

	// WebElement orangeHRMLogo=driver.findElementBy(xpath="//*[@id=\"divLogo\"]/img");

	/* @FindBy(xpath="//*[@id=\"divLogo\"]/img")
	 WebElement orangeHRMLogo;

	 @FindBy(id="logInPanelHeading")
	*/// WebElement orangeHRMLogInPageText;
	 
	 @FindBy(name="username")
	 WebElement userName;
	 
	 @FindBy(name="password")
	 WebElement Password;
	 
	 @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	 WebElement logInButton;

	 
	/* public void logInPageLogoValidation()
	 {
	 boolean flag=orangeHRMLogo.isDisplayed();
	 
	 if(flag)
	 {
	 Log.info("OrangeHRM Application logo found on OrangeHRM Application LogIn Page - PASS ");
	 }
	 else
	 {
	 Log.info("OrangeHRM Application logo NOT found on OrangeHRM Application LogIn Page - FAIL ");
	 }
	 
	 }
	 
	 public void logInPageTextValidation()
	 {
	 
	 String expected_OrangeHRLApplicationLogInPageText="LOGIN Panel";
	 Log.info("The expected LogIN Page Text is :- "+expected_OrangeHRLApplicationLogInPageText);
	 
	 String actual_OrangeHRLApplicationLogInPageText=orangeHRMLogInPageText.getText();
	 Log.info("The actual LogIn Page Text is :- "+actual_OrangeHRLApplicationLogInPageText);
	 
	 if(actual_OrangeHRLApplicationLogInPageText.equals(expected_OrangeHRLApplicationLogInPageText))
	 {
	 Log.info("Successfully navigated to OrangeHRM Application LogIN page - PASS");
	 }
	 else
	 {
	 Log.info("Failed to navigat to OrangeHRM Application LogIn Page - FAIL");
	 }
	   
	 
	 }
	 
	*/ 
	 public void logInPageLogInFuncationality(String userNameTestData, String passwordTestData)
	 {
	 userName.sendKeys(userNameTestData);
	 Password.sendKeys(passwordTestData);
	 logInButton.click();
	 
	 }

}
