package TestNGFramework01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExamples {
	
public WebDriver driver;
	

    @Parameters("browser")//Parameter name
	@BeforeTest
	public void openapplication(String br) {
		
    	if(br.equals("chrome")) {  //Parameter value
    	driver=new ChromeDriver();
    	
    	}
    	else if(br.equals("firefox")) {
    		driver=new FirefoxDriver();
    	}
		
    	else if(br.equals("edge")) {
    		driver=new EdgeDriver();
    	}
    	
    	driver.get("https://adactinhotelapp.com/index.php");
	}
	
	@Test
	public void LoginFunctionalityy() {
		
		driver.findElement(By.id("username")).sendKeys("sureshp958");
		driver.findElement(By.id("password")).sendKeys("Suresh@123");
		driver.findElement(By.id("login")).click();
		
		String exp_result="Adactin.com - Search Hotel";
		String act_result=driver.getTitle();
		
		//use Hard Assert
		Assert.assertEquals(act_result, exp_result);
		System.out.println("test case is success");
		
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("link click activty is completed");
	
	}
	
	@AfterTest
	public void closeapplication(){
		
		
	}

}
