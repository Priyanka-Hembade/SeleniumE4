package ExtentReport;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.crm.Listeners.DwsExtentReport.class)
public class TestCase {
	@Test
	public void honda()
	{
	Reporter.log("I am honda");	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.honda2wheelersindia.com/");
	driver.close();
	}
	@Test()
	public void ktm()
	{
	System.out.println("I am ktm");	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.bikewale.com/ktm-bikes/");
	driver.close();
	assertEquals("priya", "preeya");
	}
	@Test(dependsOnMethods = "ktm")
	public void royalenfield()
	{
	System.out.println("I am royal enfield");	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.bikewale.com/royalenfield-bikes/");
	driver.close();
	}
}
