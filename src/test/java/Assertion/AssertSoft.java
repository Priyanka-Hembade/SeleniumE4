package Assertion;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertSoft {
	
	@Test
	public void main()
	{
		EdgeDriver d=null;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		String expected_url = "https://demowebshop.tricentis.com/";
		String actual_url = driver.getCurrentUrl();
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(expected_url,actual_url);
		Reporter.log("I am in dws page");
		
		WebElement register = driver.findElement(By.className("ico-register"));
		sa.assertTrue(register.isEnabled());
		register.click();
		assertNull(d);
		driver.close();
		sa.assertAll();
	}
}
