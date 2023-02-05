package com.OrangeHRMApplication;

import org.testng.annotations.Test;

public class OrangeHRMLogInPageTest extends BaseTest {
	
	OrangeHRMLogInPage lip;

	/*@Test(priority=1,description=" validating OrangeHRM Application LogIN Page Logo Test ")
	public void logInPageLogoValidationTest()
	{
	lip= new OrangeHRMLogInPage();
	lip.logInPageLogoValidation();
	}

	@Test(priority=2,description=" validating OrangeHRM Application LogIN Page Text Test ")
	public void logInPageTextValidationTest()
	{
	lip= new OrangeHRMLogInPage();
	lip.logInPageTextValidation();
	}
*/
	@Test(priority=1,description=" validating OrangeHRM Application LogIN Page LogIn Funcationality Test ")
	public void logInPageLogInFuncationalityTest()
	{
	lip= new OrangeHRMLogInPage();
	lip.logInPageLogInFuncationality("Admin","admin123");
	}

}
