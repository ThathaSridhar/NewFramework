package TestNGFramework01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGExamples {

	public WebDriver driver;

	@BeforeClass
	public void openappliaction() {

		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");

	}
	@Test
	public void loginfunctionality() {
		driver.findElement(By.id("username")).sendKeys("sureshp958");
		driver.findElement(By.id("password")).sendKeys("Suresh@123");
		driver.findElement(By.id("login")).click();
	}


	@AfterClass
	public void Registrationfunctionality() {
		driver.quit();


	}	
}
