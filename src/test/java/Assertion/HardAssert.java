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

public class HardAssert {
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
		assertEquals(expected_url, actual_url , "I am not in dws page");
		//Reporter.log("I am on dws page");
		WebElement register = driver.findElement(By.className("ico-register"));
		assertTrue(register.isEnabled(), "register link is not enables...");
		register.click();
		assertNull(d);
		driver.close();
	}
}
