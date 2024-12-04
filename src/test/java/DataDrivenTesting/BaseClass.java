package DataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

public static  ChromeDriver driver;
	
	public static void precondition() throws InterruptedException
	{
		 driver = new ChromeDriver();
		driver.manage().window();
		Thread.sleep(3000);
		
		driver.get("https://demowebshop.tricentis.com/");
		
		}
	public static void login() throws InterruptedException
	{
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//label[text()='Email:']")).sendKeys("pnu@gmail.com");
		driver.findElement(By.xpath("//label[text()='Password:']")).sendKeys("pnu123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("input[id='RememberMe']")).click();
		driver.findElement(By.xpath("input[class='button-1 login-button']")).click();
	}
	

}
