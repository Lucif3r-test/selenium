package com.guru99.banking.webelements;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Contact 
{
   WebDriver driver;
   By contact=By.linkText("Contact Us");
   By name=By.name("name");
   By email=By.name("emailid");
   By mobile=By.name("telephoneno");
   By msg=By.name("addr");
   By upload=By.name("fileToUpload");
   By submit=By.name("sub");
   public Contact(WebDriver x)
   {
	   this.driver=x;
   }
   public void clickcontact()
   {
	   driver.findElement(contact).click();;
   }
   public void filluid(String x)
   {
	   driver.findElement(name).sendKeys(x);
   }
   public void email(String x)
   {
	   driver.findElement(email).sendKeys(x);
   }
   public void fillmobile(String x)
   {
	   driver.findElement(mobile).sendKeys(x);
   }
   public void fillmsg(String x)
   {
	   driver.findElement(msg).sendKeys(x);
   }
   public void upload(String x) throws AWTException, InterruptedException
   {
	   driver.findElement(upload).click();
	   StringSelection s=new StringSelection(x);
	   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
	   Robot r=new Robot();
	   r.keyPress(KeyEvent.VK_CONTROL);
	   r.keyPress(KeyEvent.VK_V);
	   r.keyRelease(KeyEvent.VK_V);
	   r.keyRelease(KeyEvent.VK_CONTROL);
	   Thread.sleep(2000);
	   r.keyPress(KeyEvent.VK_ENTER);
	   r.keyRelease(KeyEvent.VK_ENTER);   
   }
   public void submit()
   {
	   driver.findElement(submit).click();
   }
   
}
