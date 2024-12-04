package TestNg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.crm.Baseclass.DwsBaseClass;

public class TestCase4 extends DwsBaseClass {
	@Test(groups = "integration")
	public static void testScript4() throws InterruptedException
	{
		String expected_url = "https://demowebshop.tricentis.com/";
		String actual_url=driver.getCurrentUrl();
		
		
		if(expected_url.equals(actual_url))
		{
			System.out.println("I am in dws page");
			driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
			
			WebElement sortBy = driver.findElement(By.id("products-orderby"));
			
			Select sel = new Select(sortBy);
			List<WebElement> options = sel.getOptions();
			int i=0;
			for (WebElement web : options) {
				sortBy = driver.findElement(By.id("products-orderby"));				//driver.findElement(By.id("products-orderby"));
				sel=new Select(sortBy);
				sel.selectByIndex(i++);
			}
			Thread.sleep(2000);
			
			 WebElement display = driver.findElement(By.id("products-pagesize"));
			 
			 Select sel2 = new Select(display);
			 List<WebElement> options2 = sel2.getOptions();
			 int i2=0;
			 for (WebElement web : options2) {
				 display = driver.findElement(By.id("products-pagesize"));
				 sel=new Select(display);
				sel2.selectByIndex(i2++);
			}
			 Thread.sleep(2000);
			 
			 WebElement viewAs = driver.findElement(By.id("products-viewmode"));
			 
			 Select sel3 = new Select(viewAs);
			 List<WebElement> options3 = sel3.getOptions();
			 int i3=0;
			 for (WebElement web : options3) {
				viewAs=driver.findElement(By.id("products-viewmode"));
				 sel3=new Select(viewAs);
				 sel3.selectByIndex(i3++);
			}
		}
	}
}

