package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DwsRegister {
	
	 public DwsRegister(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

	@FindBy(linkText = "Register")
	 private WebElement register;
	
	@FindBy(id = "gender-female")
	private WebElement gender;
	
	@FindBy(name = "FirstName")
	private WebElement first_name;
	
	@FindBy(id = "LastName")
	private WebElement last_name;
	
	@FindBy(id = "Email")
	private WebElement email;
	
	@FindBy(xpath = "//input[@id='Password']")
	private WebElement password;
	
	@FindBy(xpath = "//input[@id='ConfirmPassword']")
	private WebElement confirmPassword;
	
	@FindBy(xpath = "//input[@id='register-button']")
	private WebElement register_btn;
	
	public void register()
	{
		register.click();
	}
	public void gender()
	{
		gender.click();
	}
	public void firstName(String data)
	{
		first_name.sendKeys(data);
	}
	public void lastName(String data)
	{
		last_name.sendKeys(data);
	}
	public void email(String data)
	{
		email.sendKeys(data);
	}
	public void password(String data)
	{
		password.sendKeys(data);
	}
	public void confirmPassword(String data)
	{
		confirmPassword.sendKeys(data);
	}
	public void registerButton()
	{
		register_btn.click();
	}
}
