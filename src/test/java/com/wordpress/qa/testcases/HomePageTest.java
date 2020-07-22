package com.wordpress.qa.testcases;



import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.HomePage;

import com.amazon.qa.pages.LoginPage;



public class HomePageTest extends TestBase {

	

	HomePage HomePag;

	
	@BeforeMethod
	public void setup() {
		initialization();
		app_logs.debug("Lonch chrome Browser");
	}

	@AfterMethod
	public void teardown() {
		driver.close();
		app_logs.debug("close all browser");
	}

	@Test(priority = 1)
	public void wishlistTest() throws Throwable {
		HomePag = new HomePage();
		HomePag.validTital();
		app_logs.debug("Valid tital");
	}

	@Test(priority = 2)
	public void verifiloginBtn() throws Throwable {
		boolean log=HomePag.veryfiLoginbtn();
		Assert.assertTrue(log);
		app_logs.debug("verified login btn");
	}

	@Test(priority = 3)
	public void verifyNeewUser() throws Throwable {
		boolean newuser=HomePag.veryfiNewUserbtn();
		Assert.assertTrue(newuser);
		app_logs.debug("verifie new user btn");
	}

}
