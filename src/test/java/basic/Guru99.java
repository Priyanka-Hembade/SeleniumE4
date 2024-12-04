package basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Guru99 {

	@Test
	public void rightClick() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act=new Actions(driver);
		act.contextClick(rightClick).perform();
		
		List<WebElement> buttons = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li/span"));
		
		for(WebElement web:buttons)
		{
			web.click();
			Thread.sleep(3000);
			Alert alt=driver.switchTo().alert();
			alt.accept();
			act.contextClick(rightClick).perform();
		}
		driver.close();
	}
	@Test
	public void doubleClick() throws InterruptedException
	{

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		 WebElement dc = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions act = new Actions(driver);
		act.doubleClick(dc).click().perform();
		Thread.sleep(3000);
		Alert alt=driver.switchTo().alert();
		alt.accept();
		driver.close();
	}
}

