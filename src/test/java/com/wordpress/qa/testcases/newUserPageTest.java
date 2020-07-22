package com.wordpress.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.HomePage;
import com.amazon.qa.pages.newUserPage;
public class newUserPageTest extends TestBase{
	
HomePage HomePag;
newUserPage newUserPage;
	
	@BeforeMethod
	public void setup() {
		initialization();
	}

	@AfterMethod
	public void teardown() {
		driver.close();
	}

	@Test(priority = 1)
	public void wishlistTest() throws Throwable {
		HomePag = new HomePage();
		newUserPage = new newUserPage();
		HomePag.clickNewUserbtn();
		newUserPage.fillform();
		newUserPage.clicksubmit();
	}

	/*@Test(priority = 2)
	public void verifiloginBtn() throws Throwable {
		newUserPage.fillform("Suraja", "patla", "11/06/1993", "7385338463", "xyz@gmail.com", "raje@123", "raje@123");
	}

	@Test(priority = 3)
	public void clicksubmit() throws Throwable {
		newUserPage.clicksubmit();
	}
*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
