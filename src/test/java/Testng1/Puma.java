package Testng1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Puma {
	
	@Test(groups = "functional")
	public void puma()
	{
		Reporter.log("I am puma" , false);
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://in.puma.com/in/en/mens/mens-new-arrivals");
	driver.close();
	}
}
