package TestNGFramework01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DependsOnMethodsExamples {

	public WebDriver driver;
	
	@BeforeClass
	public void openapplication() {
		
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();;
	}
	
	@Test(priority=2,dependsOnMethods= {"RegistrationFuncttinality"})
	public void LoginFunctionality() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.linkText("Go back to Login page")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("username")).sendKeys("sureshp958");
		driver.findElement(By.id("password")).sendKeys("Suresh@123");
		driver.findElement(By.id("login")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.findElement(By.xpath("//a[text()='Click here to login again']")).click();
	}
	//dependsOnMethods= {"LoginFunctionality"})
	@Test(priority=1)
	public void RegistrationFuncttinality() {
		driver.findElement(By.xpath("//a[text()='New User Register Here']")).click();
		driver.findElement(By.id("username")).sendKeys("Sridhar");
	}
	@AfterClass
	public void closeapplication() {
		
		driver.close();
	}
}
