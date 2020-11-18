package Business;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GmailMethods 
{
   public WebDriver driver;
   public String launch(String e,String d,String c)
   {
	   if(e.equals("firefox"))
	   {
		   driver=new FirefoxDriver();
	   }
	   else if(e.equals("chrome"))
	   {
		   System.setProperty("webdriver.chromr.driver","C:\\JAVA SELENIUM\\chromedriver.exe" );
		   driver=new ChromeDriver();
	   }
	   else if(e.equals("IE"))
	   {
		   System.setProperty("webdriver.ie.driver", "C:\\JAVA SELENIUM\\IEDriverServer.exe");
		   driver=new InternetExplorerDriver();
	   }
	   else if(e.equals("edge"))
	   {
		   System.setProperty("webdriver.edge.driver", "C:\\JAVA SELENIUM\\msedgedriver.exe");
		   driver=new EdgeDriver();
	   }
	   else
	   {
		   System.exit(0);
	   }
	return("Done");
	
	   
   }
   public String wait(String e,String d,String c) throws InterruptedException
   {
	Long t=Long.parseLong(d);
	Thread.sleep(t);
	return("done");
   }
   public String input(String e,String d,String c)
   {
	   By l=null;
	   String p[]=e.split("~");
	    
	   if(p[0].equals("name"))
	   {
		   l=By.name(p[1]);
	   }
	   else if(p[0].equals("id"))
	   {
		   l=By.id(p[1]);
	   }
	   else if(p[0].equals("classname"))
	   {
		   l=By.className(p[1]);
	   }
	   else if(p[0].equals("tagname"))
	   {
		   l=By.tagName(p[1]);
	   }
	   else if(p[0].equals("xpath"))
	   {
		   l=By.xpath(p[1]);
	   }
	   else if(p[0].equals("linktext"))
	   {
		   l=By.linkText(p[1]);
	   }
	   else if(p[0].equals("partiallinktext"))
	   {
		   l=By.partialLinkText(p[1]);
	   }
	   else
	   {
		   l=By.cssSelector(p[1]);
	   }
	   driver.findElement(l).sendKeys(d);
	   return ("done"); 
	   
   }
   public String click(String e,String d,String c)
   {
	   By l1=null;
	   String q[]=e.split("~");
	    
	   if(q[0].equals("name"))
	   {
		   l1=By.name(q[1]);
	   }
	   else if(q[0].equals("id"))
	   {
		   l1=By.id(q[1]);
	   }
	   else if(q[0].equals("classname"))
	   {
		   l1=By.className(q[1]);
	   }
	   else if(q[0].equals("tagname"))
	   {
		   l1=By.tagName(q[1]);
	   }
	   else if(q[0].equals("xpath"))
	   {
		   l1=By.xpath(q[1]);
	   }
	   else if(q[0].equals("linktext"))
	   {
		   l1=By.linkText(q[1]);
	   }
	   else if(q[0].equals("partiallinktext"))
	   {
		   l1=By.partialLinkText(q[1]);
	   }
	   else
	   {
		   l1=By.cssSelector(q[1]);
	   }
	   driver.findElement(l1).click();
	   return ("done");
   }
   public String validate_userid(String e,String d,String c)
   {
	  if(c.equals("valid")&&driver.findElement(By.name("passwd")).isDisplayed())
	  {
		  return ("Test passed");
	  }
	  if(c.equals("invalid")&&driver.findElement(By.id("errormsg_0_Email")).isDisplayed())
	  {
	      return ("Test passed");
	  }
	  else 
	  {
		  return("Test failed");
	  }
   }
   public String close(String e,String d,String c)
   { 
	   driver.close();
	   return ("Done");   
   }
   
}
