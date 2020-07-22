
package com.wordpress.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.HomePage;
import com.amazon.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage LoginPage;
	HomePage HomePage;

	@BeforeMethod
	public void setup() throws Throwable {
		initialization();
		HomePage = new HomePage();
		LoginPage = new LoginPage();
		HomePage.clicloginbtn();

	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

	@Test(priority = 1)
	public void loginTest() throws Throwable {

		LoginPage.login();

	}

}
