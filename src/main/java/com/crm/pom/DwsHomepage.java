package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DwsHomepage {

	DwsHomepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//img[@alt='Tricentis Demo Web Shop']")
	WebElement dws_icon;
	
	@FindBy(className = "ico-register")
	WebElement register_link;
	
	@FindBy(className = "ico-login")
	WebElement login_link;
	
	@FindBy(linkText = "Shopping cart")
	WebElement shopcart;
	
	@FindBy(linkText = "Wishlist")
	WebElement wishlist;
	
	@FindBy(id = "small-searchterms")
	WebElement search_store;
	
	@FindBy(xpath = "//input[@value='Search']")
	WebElement search_field;
	
	
	
}
