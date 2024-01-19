package TestNGFramework01;

import org.testng.annotations.*;

public class GroupingTestcases {

	
	@Test(priority=1,groups= {"sanity"})
	public void startup() {
		System.out.println("Strated...");

	}

	@Test(priority=2,groups= {"regression"})
	public void enter() {
		System.out.println("Entered..");
	}

	@Test(priority=3,groups= {"Smoke"})
	public void Login() {
		System.out.println("Login..");
	}

	@Test(priority=4,groups= {"sanity"})
	public void username() {
		System.out.println("Username is enterd..");

	}

	@Test(priority=5,groups= {"regression"})
	public void password() {
		System.out.println("password is eneterd..");
	}

	@Test(priority=6,groups= {"sanity"})
	public void LogiButton() {
		System.out.println("login button click activity is completed");
	}

	@Test(priority=7,groups= {"regression"})
	public void EnterINtoLoginpage() {
		System.out.println("enter into login page..");
	}

	@Test(priority=8,groups= {"Smoke"})
	public void Functionality() {
		System.out.println("perform functinality..");
	}

	@Test(priority=9,groups= {"sanity"})
	public void Logout() {
		System.out.println("Logout is completed");
	}
}


