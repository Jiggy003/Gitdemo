package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	@Parameters({"URL", "APIKey/usrname"})
	@Test
	public void WebloginHomeloan(String urlname, String key) {
		System.out.println("webloginHome");
		System.out.println(urlname);
		System.out.println(key);
	}

	@Test(groups= {"Smoke"})
	public void MobileloginHomeLoan() {
		System.out.println("mobileloginHome");
	}

	@Test
	public void LoginAPIHomeloan() {
		System.out.println("APIloginHome");
	}
	
	@AfterSuite
	public void afSuite()
	{
		System.out.println("I am the last to run");
	}
}