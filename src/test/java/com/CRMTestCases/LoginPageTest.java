package com.CRMTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest  extends BaseClass{
  @Test
  public void validateLogin() 
  {
	  String nextpageurl=lp.doLogin("aditya@gmail", "Test1234");
	  Assert.assertTrue(nextpageurl.contains("customers"),"Test Fail: Login Fail" );
	  System.out.println("Test Pass: Login Done");
  }
  
}
