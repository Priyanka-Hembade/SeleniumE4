package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		 FileInputStream fis = new FileInputStream("D:\\Selenium\\DWSLogin.xlsx");
			 Workbook wb = WorkbookFactory.create(fis);
			 Sheet sheet = wb.getSheet("Sheet1");
			 String email1 = sheet.getRow(0).getCell(0).toString();
			 String password1= sheet.getRow(0).getCell(1).toString();
			 
			 String email2 = sheet.getRow(1).getCell(0).toString();
			 String password2= sheet.getRow(1).getCell(1).toString();
			 System.out.println(email1);
			 System.out.println(password1);
			 System.out.println(email2);
			 System.out.println(password2);
	}

}

