package com.amazon.qa.pages;

import org.openqa.selenium.By;

import com.amazon.qa.base.TestBase;

public class ProfilePage extends TestBase {
	
	
	public boolean validatename() {
		boolean pro=driver.findElement(By.xpath("//h1[text()='Welcome suarj patil']")).isDisplayed();
	return pro;
	}

	public boolean newAppoi() {
		boolean pro=driver.findElement(By.xpath("//span[text()='NEW APPOINTMENT']")).isDisplayed();
	return pro;
	}
	
	public boolean myappoi() {
		boolean pro=driver.findElement(By.xpath("//span[text()='MY APPOINTMENTS']")).isDisplayed();
	return pro;
	}
	
	public void clickNewappi() {
		driver.findElement(By.xpath("//span[text()='NEW APPOINTMENT']")).click();
	}
	
	public void clickMyappoi() {
		driver.findElement(By.xpath("//span[text()='MY APPOINTMENTS']")).click();
	}
	
	
	
	
}
