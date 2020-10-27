package com.guru99.banking.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Balance_enquiry 
{
	WebDriver driver;
	By enquiry=By.linkText("Balance Enquiry");
	By account=By.name("accountno");
	By submit=By.name("AccSubmit");
	By reset=By.name("res");
	public Balance_enquiry(WebDriver x)
	{
		this.driver=x;
	}
	public void click_enquiry()
	{
		driver.findElement(enquiry).click();
	}
	public void accountno(String x)
	{
		Select s=new Select(driver.findElement(account));
		s.selectByVisibleText(x);
	}
	public void click()
	{
		driver.findElement(submit).click();
	}
	public void reset()
	{
		driver.findElement(reset).click();
	}

}
