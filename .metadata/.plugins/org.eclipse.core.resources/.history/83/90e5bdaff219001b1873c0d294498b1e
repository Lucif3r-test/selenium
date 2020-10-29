package com.guru99.banking.test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.guru99.banking.webelements.Balance_enquiry;
import com.guru99.banking.webelements.Login;
import com.guru99.banking.webelements.Ministatement;

public class NewTest {
  @Test
  public void f() throws InterruptedException, IOException 
  {
	  WebDriver driver=new FirefoxDriver();
	  driver.get("http://demo.guru99.com/Security/SEC_V1/index.php");
	  driver.manage().window().maximize();
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
	  File ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  File F1=new File("C:\\Git\\Selenium(N)\\com.guru99.banking\\balance enquiry.png");
	  FileUtils.copyFile(ss, F1);
	  Thread.sleep(3000);
	  Ministatement mini=new Ministatement(driver);
	  mini.selectstatement();
	  mini.selectaccount();
	  mini.submit();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  File ss1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  File F2=new File("C:\\Git\\Selenium(N)\\com.guru99.banking\\balance enquiry.png");
	  FileUtils.copyFile(ss1, F2);
	  Thread.sleep(3000);
	  
  }
}
