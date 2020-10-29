package com.guru99.banking.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout 
{
 WebDriver driver;
 By logout=By.linkText("Log out");
 public Logout(WebDriver x)
 {
	 this.driver=x;
 }
 public void logout()
 {
	 driver.findElement(logout).click();
 }
}
