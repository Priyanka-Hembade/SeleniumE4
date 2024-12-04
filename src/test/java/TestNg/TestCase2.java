package TestNg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.crm.Baseclass.Baseclass;
import com.crm.Baseclass.DwsBaseClass;

public class TestCase2 extends Baseclass{
	
	@Test(groups = "functional")
	public void TestScript2() throws InterruptedException
	{
		String expected_rssurl="https://demowebshop.tricentis.com/news/rss/1";
		String expected_fac="https://www.facebook.com/nopCommerce";
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a"));
		
		for(WebElement Web : links)
		{
			Web.click();
			Thread.sleep(1000);
			
			String actual_url=driver.getCurrentUrl();
			
			if(expected_fac.equals(actual_url))
			{
				driver.findElement(By.xpath("//span[text()='Create new account']")).click();	
				driver.findElement(By.name("firstname")).sendKeys("Priya");
				driver.findElement(By.name("lastname")).sendKeys("Hembade");
				
				//Birth Date
				WebElement year = driver.findElement(By.name("birthday_year"));
				Select sel3=new Select(year);
				sel3.selectByValue("2002");
				Thread.sleep(2000);
				
				
				//Birth day
				WebElement day = driver.findElement(By.name("birthday_day"));
				Select sel=new Select(day);
				sel.selectByValue("4");
				Thread.sleep(2000);
				
				//Birth month
				WebElement month = driver.findElement(By.name("birthday_month"));
				Select sel2=new Select(month);
				sel2.selectByIndex(5);
				Thread.sleep(2000);
				
				
				driver.findElement(By.xpath("(//label[@class='_58mt'])[2]")).click();
				driver.findElement(By.name("websubmit")).click();
			}

			if(expected_rssurl.equals(actual_url))
			{
				driver.navigate().back();
			}
		}
		System.out.println("TestScript2");
	}
}
//**********TestCase2
//open the browser
//maximise
//verify the page by using url
//enter into dws page
//login
//scroll down
//click facebook ,rss, youtube, google,twitter 
//		which is present at the bottom of the page by using findelements
//click create new account button in facebook
//fill all the detsils of facebook
//logout
//close