package Testng2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Royalenfield {

	@Test(groups = "functional")
	public void royalenfield()
	{
		Reporter.log("I am royalenfield" , true);
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.bikewale.com/royalenfield-bikes/");
	driver.close();
	}
}
