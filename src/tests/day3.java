package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	@BeforeClass
	public void befClas() {
		System.out.println("I before all methods of the class");
	}

	@Parameters({"URL"})
	@Test
	public void WebloginCarloan(String urlname)
	{
		System.out.println("weblogincar");
		System.out.println(urlname);
	}
	
	@Test()
	public void MobileloginCarLoan()
	{
		System.out.println("mobilelogincar");
	}
	
	@BeforeMethod
	public void beforeevery() {
		System.out.println("I will execute before every test method in day 3 class");
	}
	
	@Test(groups= {"Smoke"})
	public void MobilesigninCarLoan()
	{
		System.out.println("mobile SIGN IN");
		System.out.println("mobile ooo");
	}
	
	@AfterMethod
	public void aftSuite()
	{
		System.out.println("I will execute after every test method in day 3 class");
	}
	
	@BeforeSuite
	public void bfSuite()
	{
		System.out.println("I am number 1");
	}
	
	@Test(dataProvider="getData")
	public void MobilesignoutCarLoan(String username, String password)
	{
		System.out.println("mobile SIGN OUT");
		System.out.println(username);
		System.out.println(password);
	}
	
	@AfterClass
	public void aftClas() {
		System.out.println("After execuing all methods of the class");
	}
	
	
	@Test(dependsOnMethods= {"WebloginCarloan", "MobilesignoutCarLoan"})
	public void APICarloan()
	{
		System.out.println("apilogincar"); 
	}

	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		data[0][0]= "firstusername";
		data[0][1]= "firstpassword";
		
		data[1][0]= "secondusername";
		data[1][1]= "secondpassword";
		
		data[2][0]= "thirdusername";
		data[2][1]= "thirdpassword";
		
		return data;
	}
	
	
}
