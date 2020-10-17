package mercurytours;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Register {

	public static void main(String[] args) throws InterruptedException 
	{
		// Register to mercury tours
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(2000);
		// click on register button
		driver.findElement(By.linkText("REGISTER")).click();
		// fill fields
		driver.findElement(By.name("firstName")).sendKeys("Biswajit");
		driver.findElement(By.name("lastName")).sendKeys("Pradhan");
		driver.findElement(By.name("phone")).sendKeys("6953685644");
		driver.findElement(By.name("userName")).sendKeys("baubau@killer.com");
		driver.findElement(By.name("address1")).sendKeys("deomali, bhadrak");
		driver.findElement(By.name("city")).sendKeys("Delhi");
		driver.findElement(By.name("state")).sendKeys("Assam");
		driver.findElement(By.name("postalCode")).sendKeys("569823");
		Select s=new Select(driver.findElement(By.name("country")));
		s.selectByVisibleText("INDIA");
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("KR Swamy");
		driver.findElement(By.name("password")).sendKeys("himhere");
		driver.findElement(By.name("confirmPassword")).sendKeys("himhere");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(5000);
		//take screenshot
		//File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType<X>.FILE)

	}

}
