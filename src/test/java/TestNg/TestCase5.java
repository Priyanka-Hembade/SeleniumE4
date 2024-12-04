package TestNg;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.crm.Baseclass.DwsBaseClass;

public class TestCase5 extends DwsBaseClass {

	@Test(groups = "smoke")
	public void  testScript5() throws InterruptedException
	{
		String expected_rssurl="https://demowebshop.tricentis.com/news/rss/1";
		String expected_fburl="https://www.facebook.com/nopCommerce";
		String expected_twitterurl = "https://x.com/nopCommerce";
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a"));
		
		for(WebElement web:links)
		{
			web.click();
			String actual_rssurl = driver.getCurrentUrl();
			if(expected_rssurl.equals(actual_rssurl))
			{
				driver.navigate().back();
			}
			Thread.sleep(2000);
		}
		Set<String> childs = driver.getWindowHandles();
		 
		 for (String str : childs) 
		 {
			 driver.switchTo().window(str);
			String actual_url= driver.getCurrentUrl();
			Thread.sleep(1000);
			if(expected_twitterurl.equals(actual_url))
			{
				driver.findElement(By.xpath("//span[text()='Create account']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@name='name']")).sendKeys("priyanka");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@name='email']")).sendKeys("priya@gmail.com");
				Thread.sleep(2000);
				
				//Birth month
				WebElement month = driver.findElement(By.id("SELECTOR_1"));
				Select sel2=new Select(month);
				sel2.selectByIndex(5);
				Thread.sleep(2000);
				
				WebElement day = driver.findElement(By.id("SELECTOR_2"));
				Select sel=new Select(day);
				sel.selectByValue("4");
				Thread.sleep(2000);
				
				//Birth Date
				WebElement year = driver.findElement(By.id("SELECTOR_3"));
				Select sel3=new Select(year);
				sel3.selectByValue("2002");
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//span[text()='Next']")).click();
			}
			
			Thread.sleep(1000);
		 }
			
	}
}
