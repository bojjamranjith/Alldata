package browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		String Google_url="https://www.google.com";
		String Application_url="https://www.tsrtconline.in/oprs-web/";
		System.setProperty("webdriver.chome.driver","D:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(Google_url);
		driver.get(Application_url);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.navigate().back();
		By TsrtcbtnL=By.id("searchBtn");
		WebElement button =driver.findElement(TsrtcbtnL);
		button.click();
		Alert alert=driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		driver.close();

	}

}
