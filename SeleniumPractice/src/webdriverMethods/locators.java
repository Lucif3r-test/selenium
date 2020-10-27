package webdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locators {

	public static void main(String[] args) 
	{
		// use findelements method
		WebDriver driver=new FirefoxDriver();
		driver.get("www.google.com");
		//test on name locator
		driver.findElement(By.name("q")).sendKeys("success");
		//test on id locator
		driver.findElement(By.id(""));

	}

}
