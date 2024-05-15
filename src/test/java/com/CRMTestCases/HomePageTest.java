package com.CRMTestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.CRMPages.HomePage;

public class HomePageTest extends BaseClass {
  @Test(priority=1)
  public void validateURL() 
  {
	 // HomePage hp=new HomePage(driver);
	 String actUrl= hp.getAppUrl();
	 Assert.assertTrue(actUrl.contains("crm"),"Test Fail: URL not matched!");
	 System.out.println("Test Pass: URL Matched ");
  }
  
  
  @Test(priority=2)
  public void validateTitle() 
  {
	  String actTitle=hp.getAppTitle();
	  Assert.assertTrue(actTitle.contains("Customer Service"),"Test Fail: Title Not Found");
	  System.out.println(" Test Pass:  Title Matched");
  }
  
  
  
  @Test(priority=3)
  public void validateSingin()
  {
	  String actURL=hp.getSignIn();
	  Assert.assertTrue( actURL.contains("login"),"Test Fail: User is not navigated on Login page");
	  System.out.println("Test Pass:  User navigate!");
  }
}
