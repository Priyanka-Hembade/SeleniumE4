package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DwsLogin_Logout_sendValues extends BaseClass {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		precondition();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
			driver.findElement(By.className("ico-login")).click();
			FileInputStream fis = new FileInputStream("D:\\Selenium\\DWSLogin.xlsx");
			 Workbook wb = WorkbookFactory.create(fis);
			 Sheet sheet = wb.getSheet("Sheet2");
			 
			 String email = sheet.getRow(0).getCell(0).toString();
			 String password= sheet.getRow(0).getCell(1).toString();
			 String search = sheet.getRow(0).getCell(2).toString();
			 
			
			String actual_url = driver.getCurrentUrl();
			String expected_url = "https://demowebshop.tricentis.com/login";
			
			if(actual_url.equals(expected_url))
			{
				System.out.println("I am in dws page");
				
				driver.findElement(By.id("Email")).sendKeys(email);
				driver.findElement(By.id("Password")).sendKeys(password);
				driver.findElement(By.className("login-button")).click();
				driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys(search);
				
				driver.findElement(By.xpath("//a[text()='Log out']")).click();
			}
			else
			{
				System.out.println("I am not in dws webpage");
			}
			driver.close();
	}

}

//write a script for dws site
//open the browser
//maximize the browser
//enter into dws site verify the page by using url
//after that do login after login 
//send some value inside search field click search button
//do logout
//close the driver