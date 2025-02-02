package com.CRMTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.CRMPages.*;

public class BaseClass
{
	public WebDriver driver;
	public HomePage hp;
	public LoginPage lp;
	
	@BeforeTest
	public void setUpBrowser()
	{
		driver= new ChromeDriver();
		driver.get("https://automationplayground.com/crm/");
		
		hp=new HomePage(driver);
		lp=new LoginPage(driver);
	}
	
	@BeforeClass
	public void  pageSetUp()
	{
		hp.getSignIn();
	}
}
