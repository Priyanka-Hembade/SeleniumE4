package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesFile {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		 Properties pro = new Properties();
		 FileInputStream fis = new FileInputStream("C:\\qspiders\\com.crm.AdvanceSelenium\\src\\test\\resources\\login_properties");
		 pro.load(fis);
		 String username = pro.getProperty("username");
		 String password = pro.getProperty("password");
		 System.out.println(username);
		 System.out.println(password);
		 
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demowebshop.tricentis.com/");
		 Thread.sleep(2000);
		 
		 	driver.findElement(By.linkText("Log in")).click();
			driver.findElement(By.id("Email")).sendKeys(username);
			driver.findElement(By.id("Password")).sendKeys(password);
			driver.findElement(By.id("RememberMe")).click();
			
			Thread.sleep(3000);
			driver.findElement(By.className("login-button")).click();
		
	}

}
