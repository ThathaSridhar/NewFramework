package JunitPackage;

import org.junit.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitExamples {

	public static WebDriver driver;

	@Before
	public void openapplication() {
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
	}

	@Test
	public  void loginfunctionality() {

		driver.findElement(By.id("username")).sendKeys("sureshp958");
		driver.findElement(By.id("password")).sendKeys("Suresh@123");
		driver.findElement(By.id("login")).click();
	}

    @After
	public void closeapplivcation() {
		driver.quit();
	}
}








