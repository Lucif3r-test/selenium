package com.guru99.banking.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.guru99.banking.webelements.Balance_enquiry;
import com.guru99.banking.webelements.Login;

public class NewTest {
  @Test
  public void f() throws InterruptedException 
  {
	  WebDriver driver=new FirefoxDriver();
	  driver.get("http://demo.guru99.com/Security/SEC_V1/index.php");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  //Handle loginpage elements
	  Login l=new Login(driver);
	  l.filuid("1303");
	  l.fillpwd("Guru99");
	  l.clicklogin();
	  Thread.sleep(5000);
	  l.click_enquiry();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  Balance_enquiry b=new Balance_enquiry(driver);
	  b.accountno("3308");
	  b.click();
  }
}
