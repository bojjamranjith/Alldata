package com.TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotations1 {
	
	@Test
	public void gmailApplicationLaunch()
	{
		System.out.println(" *** Ranjith Bojjam *** ");
	}
	@AfterTest
	public void gmailInbox()
	{
		System.out.println("  Gmail Application in Inbox ");
		
	}
	@BeforeSuite
	public void gmailclose()
	{
		System.out.println(" ===== Ranjith ====");
	}

}
