package browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		String Google_url="https://www.google.com";
		String Expectedurl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		System.setProperty("webdriver.chome.driver","D:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(Google_url);
		driver.get(Expectedurl);
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("The expected orangeHRM url is :-"+Expectedurl);
		//driver.navigate().back();
		By username=By.name("username");
		WebElement orangeHRM=driver.findElement(username);
		orangeHRM.sendKeys("Admin");
		By password=By.name("password");
		WebElement orange=driver.findElement(password);
		orange.sendKeys("admin123");
		By login=By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button");
		WebElement loginbtn =driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]"));
		loginbtn.click();
		WebElement pim =driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]"));
pim.click();

       By Addemployee=By.linkText("Add Employee");
       WebElement add=driver.findElement(Addemployee);
       add.click();
       By first=By.name("firstName");
      WebElement firstname1=driver.findElement(first);
      firstname1.sendKeys("Ranjith010");
      firstname1.getText();
       By middlename=By.name("middleName");
       WebElement middlename1=driver.findElement(middlename);
       middlename1.sendKeys("chotu0012");
       middlename1.getText();
       By lastname=By.name("lastName");
      WebElement lastname1 = driver.findElement(lastname);
      lastname1.sendKeys("Bojjam0034");
      lastname1.getText();
       WebElement employeeid =driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/input[1]"));
       employeeid.sendKeys("0247");
       employeeid.getText();
      
       driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/button[2]")).click();
       
       
	
	}

}
