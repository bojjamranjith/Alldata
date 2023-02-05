package StepDefination;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TSRTCApplicationCucumber {
	
	public static WebDriver driver;
    // OrangeHRM Application Url Address
String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";

	@Given("^Validationg TSRTC Application$")
	public void validationg_TSRTC_Application() 
	{
		
	    
	String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/guest/home.do?h=1";
	

	}
	@When("^User should open chrome browser$")
	public void user_should_open_chrome_browser() 
	{
		System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
		driver = new ChromeDriver();

		// System.out.println(" Chorme Browser Launched Successfully ");
		Log.info(" Chorme Browser Launched Successfully ");

		driver.manage().deleteAllCookies();

		driver.get(applicationUrlAddress);
		//System.out.println(" Successfully Naviagated to OrangeHRM Application ");
		Log.info(" Successfully Naviagated to OrangeHRM Application ");

		driver.manage().window().maximize();

		// WebPage Load Time should be set
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		// waits for All the elements to be identified with the given property on the WebPage
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		}
	}

	@Then("^user should navigate to the url address TSRTC Application$")
	public void user_should_navigate_to_the_url_address_TSRTC_Application() 
	{
	    
	}


	

}
