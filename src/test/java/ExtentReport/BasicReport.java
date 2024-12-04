package ExtentReport;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BasicReport {

	@Test
	public void main()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		//create extentSpark report
		File path = new File("./src/main/resources/Sample.html");
		ExtentSparkReporter spark = new ExtentSparkReporter(path) ;
		
		//configure spark
		spark.config().setDocumentTitle("CRM Vtiger");
		spark.config().setReportName("Priyanka");
		spark.config().setTheme(Theme.DARK);
		
		//create extent Report
		ExtentReports report = new ExtentReports();
		
		//configure Extent report
		report.setSystemInfo("Os", "windows11");
		report.setSystemInfo("Browser", "Chrome101");
		
		//attach the spark to the Extent report
		report.attachReporter(spark);
		
		//create Extent test
		ExtentTest test = report.createTest("main");
		driver.close();
		report.flush();
	}
}
