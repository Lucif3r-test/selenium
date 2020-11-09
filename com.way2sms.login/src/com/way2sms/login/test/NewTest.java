package com.way2sms.login.test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.way2sms.login.webelements.Login;
import com.way2sms.login.webelements.Message;

public class NewTest 
{
  WebDriver driver;
  @Test
  public void f() throws IOException, InterruptedException 
  {
	 driver=new FirefoxDriver();
	 driver.get("https://www.way2sms.com"); 
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 File ss1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 File F1=new File("C:\\Git\\Selenium(N)\\com.guru99.banking\\balance enquiry.png");
	 FileUtils.copyFile(ss1, F1);
	 Login l=new Login(driver);
	 l.uid("8895788442");
	 l.pwd("pup500");
	 l.clicklogin();
	 Thread.sleep(5000);
	 Message m=new Message(driver); 
	 m.mobile("8553782862");
	 m.msg("Au sabu bhala ta");
	 m.send();
	 Thread.sleep(3000);
	 driver.close();
	  
  }
}
