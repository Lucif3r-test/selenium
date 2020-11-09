package com.way2sms.login.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Message 
{
	//enter message and send
	WebDriver driver;
	By mobile=By.name("toMobile");
	By msg=By.name("message");
	By send=By.id("sendButton");
	public Message(WebDriver x)
	{
		this.driver=x;
	}
	public void mobile(String x)
	{
		driver.findElement(mobile).sendKeys(x);
	}
	public void msg(String x)
	{
		driver.findElement(msg).sendKeys(x);
	}
	public void send()
	{
		driver.findElement(send).click();
	}

}
