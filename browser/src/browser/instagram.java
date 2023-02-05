package browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriver driver;
		  String google_url="https://www.instagram.com/";
		  System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get(google_url);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  WebElement insta=driver.findElement(By.name("username"));
		  insta.sendKeys("9989200381");
		  driver.findElement(By.name("password")).sendKeys("Ranjith@123");
		  //driver.findElement(By.xpath("//span[contains(text(),'Log in with Facebook')]")).click();
		  driver.findElement(By.xpath("//div[contains(text(),'Log in')]")).click();	
		  
		  

	}

}
