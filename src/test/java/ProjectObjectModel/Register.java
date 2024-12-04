package ProjectObjectModel;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.crm.pom.DwsRegister;

public class Register {

	@Test
	public void main()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		assertEquals("https://demowebshop.tricentis.com/", driver.getCurrentUrl());
		
		DwsRegister ref = new DwsRegister(driver);
		ref.register();
		ref.gender();
		ref.firstName("priya");
		ref.lastName("hembade");
		ref.email("pri@gmail.com");
		ref.password("pnu123");
		ref.confirmPassword("pnu123");
		ref.registerButton();
		
		driver.close();
	}
}
