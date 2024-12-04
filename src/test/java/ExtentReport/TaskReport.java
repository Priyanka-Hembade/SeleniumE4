package ExtentReport;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.Baseclass.Baseclass;
@Listeners(com.crm.Listeners.DwsTaskReports.class)
public class TaskReport extends Baseclass {

	
	@Test
	public void TestCase1()
	{
		System.out.println("I am testcase1");
		String ex_url="https://demowebshop.tricentis.com/cart";
		Actions act=new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).perform();
		
		driver.findElement(By.xpath("//div[@class='product-item']/div/a/img[1]")).click();;
		driver.findElement(By.id("giftcard_2_RecipientName")).sendKeys("komal");
		driver.findElement(By.id("giftcard_2_RecipientEmail")).sendKeys("komal@gmail.com");
		driver.findElement(By.id("giftcard_2_SenderName")).sendKeys("priyu");
		driver.findElement(By.id("giftcard_2_SenderEmail")).sendKeys("priyu@gmail.com");
		driver.findElement(By.id("giftcard_2_Message")).sendKeys("Thank You!!!");
		driver.findElement(By.id("addtocart_2_EnteredQuantity")).clear();
		driver.findElement(By.id("addtocart_2_EnteredQuantity")).sendKeys("2");
		driver.findElement(By.id("add-to-cart-button-2")).click();
		driver.findElement(By.xpath("//a[text()='Shopping cart']")).click();
		
		String act_url=driver.getCurrentUrl();
		if(ex_url.equals(act_url))
		{
			System.out.println("25$ Gift Cart is Added Successfully in shoping cart");
		}

	}
	@Test
	public void TestCase2() throws InterruptedException
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
		assertEquals("priya", "preeya");
	}
}
