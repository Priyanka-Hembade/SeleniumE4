package TestNg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.crm.Baseclass.DwsBaseClass;

public class TestCase3 extends DwsBaseClass {

	@Test(groups = "smoke")
	public void testScript3() throws InterruptedException
	{
		String expected_url = "https://demowebshop.tricentis.com/";
		String actual_url = driver.getCurrentUrl();
		
		if(expected_url.equals(actual_url))
		{
			
			Actions act = new Actions(driver);
			WebElement digital_download = driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]"));
			for(int i=1;i<=12;i++)
			{
				act.keyDown(Keys.TAB).perform();
			}	
			act.click(digital_download).perform();
			//act.keyDown(Keys.CONTROL).click(digital_download).perform();
			//act.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).click(digital_download).perform();
			Thread.sleep(3000);
			System.out.println("I am in dd");
			
			List<WebElement> add_to_cart = driver.findElements(By.cssSelector("input[value='Add to cart']"));
			
			for(WebElement web : add_to_cart)
			{
				web.click();
				Thread.sleep(2000);
			}
			
		}
	}
}

