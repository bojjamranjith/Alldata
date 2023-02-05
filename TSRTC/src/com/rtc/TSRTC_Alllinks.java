package com.rtc;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_Alllinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver;
		String google_url="https://www.google.com";
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get(google_url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.className("gLFyf")).sendKeys("https://www.tsrtconline.in/oprs-web/");
		driver.findElement(By.className("gNO89b")).click();
		driver.findElement(By.xpath("//body/div[@id='main']/div[@id='cnt']/div[@id='rcnt']/div[@id='center_col']/div[@id='res']/div[@id='search']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
		
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
