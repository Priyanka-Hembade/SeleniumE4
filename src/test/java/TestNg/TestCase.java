package TestNg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.crm.Baseclass.DwsBaseClass;

public class TestCase extends DwsBaseClass {
	@Test(groups = "smoke")
	public void testScript1() throws InterruptedException
	{
		String expected_rssurl = "https://demowebshop.tricentis.com/news/rss/1";
		List<WebElement> follow_us = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li"));
			for(WebElement web:follow_us)
			{
				web.click();
				String actual_rssurl = driver.getCurrentUrl();
				if(expected_rssurl.equals(actual_rssurl))
				{
					driver.navigate().back();
				}
				Thread.sleep(1000);
			}
			System.out.println("From TestScript1");
	}
	@Test(groups = "smoke")
	public void testScript2()
	{
		driver.findElement(By.id("small-searchterms")).sendKeys("jwellery");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		System.out.println("From TestScript2");
	}
	
}
//**********Testsrcipt1
//open the browser
//maximise
//enter into webpage
//login
//click on followus links
//logout
//close the browser
//************Testscript2
//open the browser
//



