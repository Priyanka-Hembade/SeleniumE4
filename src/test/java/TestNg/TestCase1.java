package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.crm.Baseclass.Baseclass;
import com.crm.Baseclass.DwsBaseClass;

public class TestCase1 extends Baseclass{
	
	String ex_url="https://demowebshop.tricentis.com/cart";
	@Test(groups = {"smoke" , "functional"})
	public void TestCase1()
	{
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Actions act=new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).perform();
		
		driver.findElement(By.xpath("//div[@class='product-item']/div/a/img[1]")).click();;
		driver.findElement(By.id("giftcard_2_RecipientName")).sendKeys("komal");
		driver.findElement(By.id("giftcard_2_RecipientEmail")).sendKeys("komal@gmail.com");
		driver.findElement(By.id("giftcard_2_SenderName")).sendKeys("priyu");
		driver.findElement(By.id("giftcard_2_SenderEmail")).sendKeys("priyu@gmail.com");
		driver.findElement(By.id("giftcard_2_Message")).sendKeys("Thank You!!!");
		driver.findElement(By.id("addtocart_2_EnteredQuantity")).clear();
		driver.findElement(By.id("addtocart_2_EnteredQuantity")).sendKeys("2");
		driver.findElement(By.id("add-to-cart-button-2")).click();
		driver.findElement(By.xpath("//a[text()='Shopping cart']")).click();
		
		String act_url=driver.getCurrentUrl();
		if(ex_url.equals(act_url))
		{
			System.out.println("25$ Gift Cart is Added Successfully in shoping cart");
		}

	}
}

//***********test case1
//open the browser
//maximise
//anter ito dws page
//verify the page by using url
//login
//scroll down
//click 25$ gift cart 
//fill all the gift cart detailschange the quantity to 2
//click add to cart
//verify the 25$ gift cart which is added successfully in shopping cart
//logout
//close
