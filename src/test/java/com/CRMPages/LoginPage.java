package com.CRMPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.CRMUtility.Utility;

public class LoginPage
{
	private WebDriver driver;
	
	public LoginPage(WebDriver driver)//base class
	{
		this.driver=driver;
	}
	
	private By email=By.id("email-id");
	private By pwd=By.id("password");
	private By btn=By.id("submit-id");
	
	
	public String doLogin(String em,String ps)
	{
		driver.findElement(email).sendKeys(em);
		driver.findElement(pwd).sendKeys(ps);
		Utility.capture(driver);
		driver.findElement(btn).click();
		Utility.capture(driver);
		return driver.getCurrentUrl();
	}
	
	
}
