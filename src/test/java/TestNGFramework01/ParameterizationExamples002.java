package TestNGFramework01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExamples002 {
	public WebDriver driver;

	@Parameters({"browser","url"})
	
	@BeforeTest
	public void openapplication(String br,String apurl) {

		if(br.equals("chrome")) {
			driver=new ChromeDriver();
		}

		else if(br.equals("edge")) {
			driver=new EdgeDriver();
		}

		else if(br.equals("firefox")) {
			driver=new FirefoxDriver();

		}

		driver.get(apurl);
	}

	@Test
	public void Login() {
		driver.findElement(By.id("username")).sendKeys("sureshp958");
		driver.findElement(By.id("password")).sendKeys("Suresh@123");
		driver.findElement(By.id("login")).click();

	}
 
	@AfterTest
	public void closeappliaction() {
		driver.close();
	}
}
