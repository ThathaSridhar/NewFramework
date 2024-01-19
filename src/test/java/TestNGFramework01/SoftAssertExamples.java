package TestNGFramework01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExamples {

	public WebDriver driver;

	@BeforeTest
	public void openapplication() {

		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
	}

	@Test
	public void LoginFunctionalityy() {

		driver.findElement(By.id("username")).sendKeys("sureshp958");
		driver.findElement(By.id("password")).sendKeys("Suresh@123");
		driver.findElement(By.id("login")).click();

		String exp_result="Adactin.com - Search Hotel11";
		String act_result=driver.getTitle();

		//use Soft Assert

		SoftAssert sa=new SoftAssert();

		sa.assertEquals(act_result, exp_result);

		System.out.println("test case is success");

		driver.findElement(By.linkText("Logout")).click();
		System.out.println("link click activty is completed");

		sa.assertAll();

	}

	@AfterTest
	public void closeapplication(){

		
	}

}
