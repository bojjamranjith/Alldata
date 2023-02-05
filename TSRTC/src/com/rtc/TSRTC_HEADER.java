package com.rtc;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_HEADER {

	public static void main(String[] args) {
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
		By tsrtcL=By.className("menu-wrap");
		WebElement tsrtcheader=driver.findElement(tsrtcL);
		By headerblockElement=By.tagName("a");
		List<WebElement>headerblocklinks=tsrtcheader.findElements(headerblockElement);
		int headerbloclinks_count=headerblocklinks.size();
		System.out.println(headerblocklinks);
		for(int index=1;index<headerbloclinks_count;index++)
		{
			String headerblock_linkname=headerblocklinks.get(index).getText();
			System.out.println(index+" "+headerblock_linkname);
			headerblocklinks.get(index).click();
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
			WebElement tsrtc_headerblock = driver.findElement(tsrtcL);
			headerblocklinks=tsrtc_headerblock.findElements(headerblockElement);
			
		}
		
		

	}

	

}
