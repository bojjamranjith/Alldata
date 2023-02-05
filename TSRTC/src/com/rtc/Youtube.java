package com.rtc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		
		  WebDriver driver;
		  String google_url="http://www.google.com";
		  System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get(google_url);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  driver.findElement(By.className("gLFyf")).sendKeys("https://www.youtube.com");
			driver.findElement(By.className("gNO89b")).click();
		driver.findElement(By.xpath("//body/div[@id='main']/div[@id='cnt']/div[@id='rcnt']/div[@id='center_col']/div[@id='res']/div[@id='search']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
		WebElement ranjith=driver.findElement(By.xpath("//input[@id='search']"));
		ranjith.sendKeys("waltair veerayya songs");
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
	driver.findElement(By.xpath("//body/ytd-app[1]/div[1]/ytd-page-manager[1]/ytd-search[1]/div[1]/ytd-two-column-search-results-renderer[1]/div[2]/div[1]/ytd-section-list-renderer[1]/div[2]/ytd-item-section-renderer[1]/div[3]/ytd-video-renderer[5]/div[1]/ytd-thumbnail[1]/a[1]/yt-image[1]/img[1]")).click();
		driver.manage().window().maximize();
	}


}
