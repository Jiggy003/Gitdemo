package tests;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	@Test(groups= {"Smoke"})
	public void hark() {
		System.out.println("uurrrrgggghh");
	}
	
	@BeforeTest
	public void prerequisite()
	{
		System.out.println("I will execute this first");
	}
	
	}
