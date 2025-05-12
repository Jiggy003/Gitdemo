package Killit;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class firstTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector("[id='username']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("[id='password']")).sendKeys("learning");
		driver.findElement(By.xpath("//label[2]/span[2]")).click();
		
		
		WebElement options = driver.findElement(By.cssSelector("select.form-control"));
		Select dropdown = new Select(options);
		dropdown.selectByValue("stud");

		WebDriverWait w = new WebDriverWait(driver, Duration.ofMillis(5000));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("cancelBtn")));
//		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[id='cancelBtn']")).click();
		
		driver.findElement(By.cssSelector("input[id='terms']")).click();
		driver.findElement(By.id("signInBtn")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
		List<WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));

		for(int i =0;i<products.size();i++)

		{

		products.get(i).click();

		}

		driver.findElement(By.partialLinkText("Checkout")).click();
		}
		
		

		



}
