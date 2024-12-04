package ProjectObjectModel;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.pom.DwsLogin;

public class Login {

	@Test
	
	public void main()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		assertEquals("https://demowebshop.tricentis.com/", driver.getCurrentUrl());
		
	DwsLogin ref = new DwsLogin(driver);
	ref.loginLink();
	ref.email("admin01@gmail.com");
	ref.password("admin01");
	ref.rememberme();
	ref.loginButton();
	
	//code optimization
	//ref.login("admin01@gmail.com" , "admin01");
	}
}
