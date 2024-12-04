package TestNg;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestCase6 {

	@Test(groups = "integration")
	public void TestScript6() throws InterruptedException
	{
		String expect_rssurl= "https://demowebshop.tricentis.com/news/rss/1";
		String expect_fburl = "https://www.facebook.com/nopCommerce";
		String expect_twitterurl = "https://x.com/nopCommerce";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Actions act = new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).keyDown(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		
		List<WebElement>links = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a"));
		for(WebElement web:links)
		{
			web.click();
			String actual_rssurl = driver.getCurrentUrl();
			if(expect_rssurl.equals(actual_rssurl))
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
			if(expect_fburl.equals(actual_url))
			{
				driver.findElement(By.xpath("//span[text()='Create new account']")).click();
				
			}
			else if(expect_twitterurl.equals(actual_url))
			{
				driver.findElement(By.xpath("//span[text()='Create account']")).click();
			}
			Thread.sleep(3000);
		 }
	}
}
//******TestCase6******************
//open the browser
//maximise
//verify the page by using url
//enter into dws page
//login
//scroll down
//click facebook ,rss,yuotube, google,twitter which is present at the bottom of the page by using find elements
//click create new account button in twitter
//fill all yhe detalis of twitter
//logout
//close
