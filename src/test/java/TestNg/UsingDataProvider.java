package TestNg;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UsingDataProvider {

	@DataProvider(name = "login")
	public Object[][]provider() throws EncryptedDocumentException, IOException
	{
		
		
//********	here providing data by using excel file and providing path of that file**********************(
		FileInputStream fis = new FileInputStream("D:\\\\Selenium\\\\DWSLogin.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet4");
		int rows = sheet.getPhysicalNumberOfRows();
		int column = sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][] obj = new Object[rows][column];
		
		for(int i=0; i<rows;i++)
		{
			for(int j=0; j<column; j++)
			{
				obj[i][j] = sheet.getRow(i).getCell(j).toString();
			}
		}
		//Object[][] obj = new Object[2][2];
//		obj[0][0] = sheet.getRow(0).getCell(0).toString();
//		obj[0][1] = sheet.getRow(0).getCell(1).toString();
//		obj[1][0] = sheet.getRow(1).getCell(0).toString();
//		obj[1][1] = sheet.getRow(1).getCell(1).toString();
		
//*********given data script itself************************		
//		obj[0][0] = "admin01@gmail.com";
//		obj[0][1] = "admin01";
//		obj[1][0]  = "admin02@gmail.com";
//		obj[1][1] = "admin02";
		
		return obj;
	}
	
	@Test(dataProvider = "login")
	public void receiver(String username,String password) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys(username);
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		Thread.sleep(3000);
		driver.close();
	}
}
