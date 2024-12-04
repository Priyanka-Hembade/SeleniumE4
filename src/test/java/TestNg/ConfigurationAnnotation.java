package TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnotation {
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("from BforeSuite");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("from BeforeTest");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("from BeforeClass");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("from BeforeMethod");
	}
	@Test
	public void TestScript1()
	{
		System.out.println("from TestScript1");
	}
	@Test
	public void TestScript2()
	{
		System.out.println("from TestScript2");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("from AfterMethod");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("from AfterClass");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("from AfterTest");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("from AfterSuite");
	}
	
}
