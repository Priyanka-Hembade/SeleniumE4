package TestNg;
//priority helper method

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Priority {
	@Test(priority = 0)
	public void Rcb()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
		driver.get("https://www.royalchallengers.com/");
		System.out.println("RCB");
		driver.close();
	}
	
	@Test(priority = -1)
	public void csk()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
		driver.get("https://www.chennaisuperkings.com/");
		System.out.println("CSK");
		driver.close();
	}
	
	@Test(priority = 1)
	public void dc()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
		driver.get("https://www.delhicapitals.in/");
		System.out.println("DC");
		driver.close();
	}
}
