package Testng1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Nike {
	
	@Test(groups = "smoke")
	public void nike()
	{
		Reporter.log("I am in nike" , false);
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.nike.com/in/w/shoes-y7ok");
	driver.close();
	}
}
