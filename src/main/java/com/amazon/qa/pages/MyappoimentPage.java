package com.amazon.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.amazon.qa.base.TestBase;

public class MyappoimentPage extends TestBase{
	
	
	public void howManyAppoiment() throws InterruptedException {
		Thread.sleep(3000);
		List<WebElement>list=driver.findElements(By.xpath("//*[@class=\"e1\"]"));
	System.out.println(list.size());
	}
	

}
