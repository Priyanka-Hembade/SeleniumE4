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
import org.testng.annotations.Parameters;

public class DwsBaseClass {
	
	public static WebDriver driver=null;
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("From beforeSuite");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("from beforetest");
	}
	@Parameters({ "url", "browser"})
	@BeforeClass
	public void precondition(String url,String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver  = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		else {
			 ChromeDriver driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		
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
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("from aftertest");
	}
	@org.testng.annotations.AfterSuite
	public void AfterSuite()
	{
		System.out.println("From afterSuite");
	}
}
