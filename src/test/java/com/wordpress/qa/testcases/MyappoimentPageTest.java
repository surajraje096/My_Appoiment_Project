package com.wordpress.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.HomePage;
import com.amazon.qa.pages.LoginPage;
import com.amazon.qa.pages.MyappoimentPage;
import com.amazon.qa.pages.ProfilePage;

public class MyappoimentPageTest extends TestBase {
	
	LoginPage LoginPage;
	HomePage HomePage;
	ProfilePage ProfilePage;
	MyappoimentPage MyappoimentPage; 
	@BeforeMethod
	public void setup() throws Throwable {
		initialization();
		HomePage = new HomePage();
		LoginPage = new LoginPage();
		HomePage.clicloginbtn();
		ProfilePage = new ProfilePage();
		MyappoimentPage=new MyappoimentPage();

	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

	@Test(priority = 1)
	public void loginTest() throws Throwable {

		LoginPage.login();
		ProfilePage.clickMyappoi();
		MyappoimentPage.howManyAppoiment();
	}

	

}
