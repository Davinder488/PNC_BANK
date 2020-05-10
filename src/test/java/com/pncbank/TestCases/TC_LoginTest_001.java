package com.pncbank.TestCases;

import org.testng.annotations.Test;

import com.pncbank.PageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void loginTest()
	{
		driver.get(baseUrl);
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		driver.manage().window().maximize();
	}

}
