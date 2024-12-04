package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;

public class Dws_Registration extends BaseClass {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		precondition();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.className("ico-register")).click();
		
		FileInputStream fis = new FileInputStream("D:\\\\Selenium\\\\DWSLogin.xlsx");
		 Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet3");
		String first_name = sheet.getRow(0).getCell(0).toString();
		String last_name = sheet.getRow(0).getCell(1).toString();
		String email = sheet.getRow(0).getCell(2).toString();
		String password = sheet.getRow(0).getCell(3).toString();
		
		String actual_url=driver.getCurrentUrl();
		String expected_url="https://demowebshop.tricentis.com/register";
		
		if(actual_url.equals(expected_url))
		{
			System.out.println("I am in register page");
			driver.findElement(By.id("gender-female")).click();
			driver.findElement(By.id("FirstName")).sendKeys(first_name);
			driver.findElement(By.id("LastName")).sendKeys(last_name);
			driver.findElement(By.id("Email")).sendKeys(email);
			driver.findElement(By.id("Password")).sendKeys(password);
			driver.findElement(By.id("ConfirmPassword")).sendKeys(password);
			driver.findElement(By.id("register-button")).click();
		}
		else
		{
			System.out.println("I am not in registration page");
		}
		driver.close();
	}

}
