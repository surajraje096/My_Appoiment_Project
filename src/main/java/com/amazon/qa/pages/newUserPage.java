package com.amazon.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.actiondriver.Action;
import com.amazon.qa.base.TestBase;

public class newUserPage extends TestBase{
	
	@FindBy(xpath="//h1[text()='REGISTER']")
	WebElement resi;
	
	@FindBy(xpath="(//input[@class='a2'])[1]")
	WebElement FirstName;
	
	@FindBy(xpath="(//input[@class='a2'])[2]")
	WebElement LastName;
		
	@FindBy(xpath="(//input[@class='a2'])[3]")
	WebElement DateofBirth;
	
	@FindBy(xpath="(//input[@class='a2'])[4]")
	WebElement MobileNumber;
	
	@FindBy(xpath="(//input[@class='a2'])[5]")
	WebElement Emailid;
	
	@FindBy(xpath="(//input[@type='password'])[1]")
	WebElement Password;
	
	@FindBy(xpath="(//input[@type='password'])[2]")
	WebElement ConfirmPassword;
	
	@FindBy(xpath="//input[@value='Submit']")
	WebElement submit;
	
	public newUserPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String  validTital() {
	String tital=driver.getTitle();
	return tital;
	}
	
	public boolean veryfiNewUserbtnTital() throws Throwable {
		boolean ti=resi.isDisplayed();
		return ti;
	}
	
	public void fillform() throws Throwable {
		//Action.type(FirstName, name);
		//FirstName.sendKeys("suraj");
		driver.findElement(By.xpath("(//input[@class='a2'])[1]")).sendKeys("suraj");
		//Action.type(LastName, lname);
		//LastName.sendKeys("patil");
		driver.findElement(By.xpath("(//input[@class='a2'])[2]")).sendKeys("patil");
		//Action.type(DateofBirth, Bday);
		//DateofBirth.sendKeys("11/06/1993");
		driver.findElement(By.xpath("(//input[@class='a2'])[3]")).sendKeys("11/06/1993");
		//Action.type(MobileNumber, mobile);
		//MobileNumber.sendKeys("7385338463");
		driver.findElement(By.xpath("(//input[@class='a2'])[4]")).sendKeys("7385338463");
		//Action.type(Emailid, email);
		//Emailid.sendKeys("raje096@gmail.com");
		driver.findElement(By.xpath("(//input[@class='a2'])[5]")).sendKeys("raje096@gmail.com");
		//Action.type(Password, pass);
		//Password.sendKeys("Raje@123");
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("Raje@123");
		//Action.type(ConfirmPassword, passs);
		//ConfirmPassword.sendKeys("Raje@123");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Raje@123");
	}
	
	public void clicksubmit() throws Throwable {
		Action.click(driver, submit);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
