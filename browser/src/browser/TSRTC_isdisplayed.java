package browser;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TSRTC_isdisplayed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		String Google_url="https://www.google.com";
		String Application_url="https://www.amazon.com/";
		System.setProperty("webdriver.chome.driver","D:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(Google_url);
		driver.get(Application_url);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.navigate().back();
		By valueL=By.id("navbarSupportedContent");
		WebElement value=driver.findElement(valueL);
		//Action action=new Action(driver);
		//action.Movetoelement(value).build().perform();
		By headerblockL=By.tagName("a");
		List<WebElement>headerblocklinks=value.findElements(headerblockL);
		for(int index=0;index<headerblocklinks.size();index++)
		{
			if(headerblocklinks.get(index).isDisplayed())
			{
				String headerblocklinknames=headerblocklinks.get(index).getText();
				System.out.println(index+" "+"the hidden links is :-"+headerblocklinknames);
			}
		}
	}




}

