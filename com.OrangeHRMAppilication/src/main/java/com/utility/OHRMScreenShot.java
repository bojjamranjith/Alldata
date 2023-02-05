package com.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class OHRMScreenShot {
	public static void takeScreenShot(WebDriver driver,String imageName) throws IOException
	{
		TakesScreenshot takeScreenShot=(TakesScreenshot)driver;
		File errorScreenshot=takeScreenShot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(errorScreenshot,new File("D:\\ECLIPS WORK SPACE\\com.OrangeHRMAppilication\\ApplicationerroScreenShots"+imageName+".png"));
	}

}
