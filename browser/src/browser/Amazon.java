package browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

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
		By hellosignin=By.id("nav-link-accountList-nav-line-1");
		WebElement hello =driver.findElement(hellosignin);
		Actions action =new Actions(driver);
		action.moveToElement(hello).build().perform();
		By wishlist =By.linkText("Create a List");
		WebElement list =driver.findElement(wishlist);
		list.click();
		
		
		

	}

}
