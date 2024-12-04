package com.crm.Baseclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Baseclass {

	public static WebDriver driver;
	
	@BeforeClass
	public void precondition()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
	}
	@BeforeMethod
	public void login() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("Email")).sendKeys("pnu@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("pnu123");
		Thread.sleep(1000);
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		Thread.sleep(3000);
	}
	@AfterMethod
	public void logout()
	{
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
	}
	@AfterClass
	public void postCondition()
	{
		driver.quit();
	}
}
