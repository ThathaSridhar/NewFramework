package TestNGFramework01;

import org.testng.annotations.*;


public class AnnotationsExamples {

	@BeforeSuite
	public void startup() {
		System.out.println("Strated...");

	}

	@AfterSuite
	public void enter() {
		System.out.println("Entered..");
	}

	@BeforeTest
	public void Login() {
		System.out.println("Login..");
	}

	@AfterTest
	public void username() {
		System.out.println("Username is enterd..");

	}

	@BeforeClass
	public void password() {
		System.out.println("password is eneterd..");
	}

	@AfterClass
	public void LogiButton() {
		System.out.println("login button click activity is completed");
	}

	@Test
	public void EnterINtoLoginpage() {
		System.out.println("enter into login page..");
	}

	@BeforeMethod
	public void Functionality() {
		System.out.println("perform functinality..");
	}

	@AfterMethod
	public void Logout() {
		System.out.println("Logout is completed");
	}
}
