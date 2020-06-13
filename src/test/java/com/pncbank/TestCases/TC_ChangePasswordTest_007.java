package com.pncbank.TestCases;

import org.testng.annotations.Test;

import com.pncbank.PageObjects.ChangePasswordPage;
import com.pncbank.PageObjects.LoginPage;

public class TC_ChangePasswordTest_007 extends BaseClass{

	@Test
	public void ChangepasswordTestCase() throws InterruptedException {
		
		 driver.get(baseUrl);
			
			LoginPage lp=new LoginPage(driver);
			lp.setUserName(username);
			lp.setPassword(password);
			lp.clickSubmit();
			driver.manage().window().maximize();
			
			
			Thread.sleep(5000);
			
			ChangePasswordPage cpp =new ChangePasswordPage(driver);
			cpp.Changepasswordlink();
		    cpp.Enteroldpassword("556689");
		    cpp.Enternewpassword("125895");
		    cpp.ClickonSubmitbtn();
			
		
		
	}
	
	
}
