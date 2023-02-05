package browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class chromebrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
         ChromeOptions options=new ChromeOptions();
  		options.addArguments("--disable-notifications");
         WebDriver driver = new ChromeDriver(options);
         
        
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
         driver.get("https://facebook.com");
         driver.manage().window().maximize();
         driver.findElement(By.id("email")).sendKeys("9989200381");;
         driver.findElement(By.id("pass")).sendKeys("Ranjith@123");
        // Thread.sleep(1000);
          driver.findElement(By.name("login")).click();
          driver.findElement(By.partialLinkText("log out")).click();
          
          
                   //driver.quit();
         ///html/body/div[1]/div/div[1]/div/div[2]/div[4]/div[1]/span/div/div[1]/div/svg/g/image
          //Thread.sleep(2000);
          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
          WebElement AccSettings = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/span[1]/div[1]/div[1]/div[1]/svg[1]/g[1]/image[1]"));
          AccSettings.click();
         
	}

}
