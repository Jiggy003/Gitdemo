package tests;



import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {
	@Test
	public void first() {
		System.out.println("hey");
		Assert.assertTrue(true);
	}
	
	@Test
	public void second() {
		System.out.println("Byeee");
	}
	
	@AfterTest
	public void nonPreq()
	{
		System.out.println("I will execute this Last");
	}

}
