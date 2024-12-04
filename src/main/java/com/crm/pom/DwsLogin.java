package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DwsLogin {

	 public DwsLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(className="ico-login")
	 private WebElement login_link;
	
	@FindBy(id="Email")
	 private WebElement email;
	
	@FindBy(name = "Password")
	 private WebElement password;
	
	@FindBy(css ="input[id='RememberMe']")
	private WebElement remember_me;
	
	@FindBy(xpath = "//input[@value='Log in']")
	 private WebElement login_button;
	
	public void loginLink()
	{
		login_link.click();
	}
	public void email(String data)
	{
		email.sendKeys(data);
	}
	public void password(String data)
	{
		password.sendKeys(data);
	}
	public void rememberme()
	{
		remember_me.click();
	}
	public void loginButton()
	{
		login_button.click();
	}

	//CODE OPTIMISATION
//	public void login(String email1 , String password1)
//	{
//		login_link.click();
//		email(email1);
//		password(password1);
//		remember_me.click();
//		login_button.click();
//	}
	
}
