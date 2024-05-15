package com.CRMPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.CRMUtility.Utility;

public class HomePage
{
	//Encapsulation= identification(Locators) + Actions
	
	private WebDriver driver;//instance
	
	public HomePage(WebDriver driver) //base class driver local
	{
		this.driver=driver;
	}
	
	//locators
	private By link=By.linkText("Sign In");
	
	//Method
	public String getAppTitle() 
	{
		return driver.getTitle();
	}
	
	public String getAppUrl() 
	{
		return driver.getCurrentUrl();
	}
	
	public String getSignIn()
	{
		Utility.capture(driver);
		driver.findElement(link).click();
		  Utility.capture(driver);
		return driver.getCurrentUrl();//logIn
	}
	
	
	
}
