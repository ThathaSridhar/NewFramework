package TestNGFramework01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExtentReportsExampleTestcase {

	public WebDriver driver;

	@BeforeTest
	public void openapplication() {

		driver=new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");

	}

	@Test
	public void Login() {
		
		driver.findElement(By.id("username")).sendKeys("sureshp958");
		driver.findElement(By.id("password")).sendKeys("Suresh@123");
		driver.findElement(By.id("login")).click();
		
		String Exp_title="Adactin.com - Search Hotel";
		String Act_title=driver.getTitle();
		
		Assert.assertEquals(Act_title, Exp_title);
		

	}

	@AfterTest
	public void closeapplication() {
		driver.close();
	}
}
