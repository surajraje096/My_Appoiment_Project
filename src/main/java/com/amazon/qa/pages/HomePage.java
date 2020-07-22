/**
 * 
 */
package com.amazon.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.actiondriver.Action;
import com.amazon.qa.base.TestBase;


public class HomePage extends TestBase {
	
	@FindBy(xpath="//span[text()='NEW USER']")
	WebElement newUser;
	
	@FindBy(xpath="//span[text()='LOGIN']")
	WebElement login;
		
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String  validTital() {
	String tital=driver.getTitle();
	return tital;
	}
	
	public boolean veryfiNewUserbtn() throws Throwable {
		Thread.sleep(3000);
		boolean newuse=driver.findElement(By.xpath("//span[text()='NEW USER']")).isDisplayed();
	return newuse;
	}
	public void clickNewUserbtn() throws Throwable {
		Action.click(driver, newUser);
	}

	public boolean veryfiLoginbtn() throws Throwable {
		Thread.sleep(3000);
		boolean login=driver.findElement(By.xpath("//span[text()='LOGIN']")).isDisplayed();
	return login;
	}
	public void clicloginbtn() throws Throwable {
	Action.click(driver, login);
	}


	public String currenturl() {
		String currenturl=driver.getCurrentUrl();
		return currenturl;
		
	}


}
