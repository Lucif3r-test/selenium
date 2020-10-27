package com.guru99.banking.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login 
{
	WebDriver driver;
	//store login page elements
	By uid=By.name("uid");
	By pwd=By.name("password");
	By login=By.name("btnLogin");
	By msg=By.linkText("Welcome To Customer's Page of Guru99 Bank");
	public Login(WebDriver x)
	{
		this.driver=x;
	}
	public void filuid(String x)
	{
		driver.findElement(uid).sendKeys(x);
	}
	public void fillpwd(String x)
	{
		driver.findElement(pwd).sendKeys(x);
	}
	public void clicklogin()
	{
		driver.findElement(login).click();
	}

}
