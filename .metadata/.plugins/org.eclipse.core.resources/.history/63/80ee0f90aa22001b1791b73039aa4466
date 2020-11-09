package com.way2sms.login.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login 
{
	//store login elements
	WebDriver driver;
	By uid=By.name("mobileNo");
	By pwd=By.name("password");
	By clicklogin=By.xpath(".//*[@id='loginform']/div[2]/div[2]/button");
	public Login(WebDriver x)
	{
		this.driver=x;
	}
	public void uid(String x)
	{
		driver.findElement(uid).sendKeys(x);
	}

}
