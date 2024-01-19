package TestNGFramework01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InnvoacationalCountExamples {

	public WebDriver driver;

	@BeforeTest
	public void openapplication() {

		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
	}

	@Test(invocationCount=3)
	public void LoginFunctionalityy() {

		driver.findElement(By.id("username")).sendKeys("sureshp958");
		driver.findElement(By.id("password")).sendKeys("Suresh@123");
		driver.findElement(By.id("login")).click();

		driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.linkText("Click here to login again")).click();
	}

}
