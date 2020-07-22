package com.amazon.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.amazon.qa.base.TestBase;

public class NewAppoimentPage extends TestBase {

	public void selectDepartment() {
		Select select = new Select(driver.findElement(By.id("department")));
		select.selectByValue("medicine");
		driver.findElement(By.xpath("//input[@class='a1']")).sendKeys("11/05/2020");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	public void newAppoimentTiming() {

		Select select = new Select(driver.findElement(By.id("startTime")));
		select.selectByIndex(0);

		Select select2 = new Select(driver.findElement(By.id("endTime")));
		select2.selectByIndex(0);

		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

}
