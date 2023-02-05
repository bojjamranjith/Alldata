package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pageobjects.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps  {
	
	WebDriver driver;
	LoginPage lp;
	
	
	@Given("^User should be launched chrome browser$")
	public void user_should_be_launched_chrome_browser() {
	    System.setProperty("webdriver.chrome.driver","D:\\Chromedriver.exe");
	    driver=new ChromeDriver();
	    lp=new LoginPage(driver);
	    
	    
	}

	@When("^User Enter the NoCommerce Application URL address$")
	public void user_Enter_the_NoCommerce_Application_URL_address()  {
		
		String applicationUrlAddress="https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F";
		driver.manage().deleteAllCookies();
		driver.get(applicationUrlAddress);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	}

	@When("^User should enter the Emailid and password$")
	public void user_should_enter_the_Emailid_and_password()  {
		lp.setusername("admin@yourstore.com");;
		lp.setpassword("admin");
	   
	}

	@When("^User should Click Login Button$")
	public void user_should_Click_Login_Button()  {
	lp.login();
		
	}

	@Then("^User should Verify the Title$")
	public void user_should_Verify_the_Title(String title)  {
		if(driver.getPageSource().contains("Login was Unsuccessfull."))
		{
		driver.close();
		Assert.assertTrue(false);
		}
		else
		{
			Assert.assertEquals(title,driver.getTitle());
		}
	    
	}

	@When("^User should Click Logout Button$")
	public void user_should_Click_Logout_Button() {
	    lp.logout();
	}

	
	@When("^User should Close the Browser$")
	public void user_should_Close_the_Browser() {
		
	    driver.quit();
	}
}
