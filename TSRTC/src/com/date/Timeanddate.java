package com.date;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Timeanddate {
	   
	WebDriver driver;
	String aplicationurladdress="https://www.timeanddate.com/worldclock/";
	
	public void applicationlunch()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get(aplicationurladdress);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	public void getapplication()
	{
		By Locator=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]");
		List<WebElement> data =driver.findElements(Locator);
		for(int i=0;i<data.size();i++)
		{
			String rrr=data.get(i).getText();
			System.out.println(rrr);
			
		}
		
	   
	
			}
		
		
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Timeanddate obj=new Timeanddate();
		obj.applicationlunch();
		obj.getapplication();
		obj.quit();
		

	}
	public void quit()
	{
		driver.quit();
	}

}
