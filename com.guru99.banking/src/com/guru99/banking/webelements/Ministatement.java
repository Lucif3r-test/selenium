package com.guru99.banking.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Ministatement 
{
  WebDriver driver;
  By ministatement=By.linkText("Mini Statement");
  By accountno=By.name("accountno");
  By submit=By.name("AccSubmit");
  public Ministatement(WebDriver x)
  {
	  this.driver=x;
  }
  public void selectstatement()
  {
	  driver.findElement(ministatement).click();
  }
  public void selectaccount()
  {
	  Select s=new Select(driver.findElement(accountno));
	  s.selectByVisibleText("3308");
  }
  public void submit()
  {
	  driver.findElement(submit).click();
  }
}
