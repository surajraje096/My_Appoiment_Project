/**
 * 
 */
package com.amazon.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amazon.qa.actiondriver.Action;
import com.amazon.qa.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(xpath = "//input[@class='a1 chromexPathFinder1']")
	WebElement Username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement signbtn;
	



public void login() throws Throwable {
	Thread.sleep(3000);
driver.findElement(By.xpath("(//input[@class='a1'])[1]")).sendKeys("raje@gmail.com");
driver.findElement(By.xpath("(//input[@class='a1'])[2]")).sendKeys("Suraj@123");
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@type='submit']")).click();
Thread.sleep(3000);
}


}
