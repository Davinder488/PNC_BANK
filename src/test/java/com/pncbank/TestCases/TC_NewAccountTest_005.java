package com.pncbank.TestCases;

import org.testng.annotations.Test;

import com.pncbank.PageObjects.LoginPage;
import com.pncbank.PageObjects.NewAccountPage;

public class TC_NewAccountTest_005 extends BaseClass{
	
	@Test
	public void NewAccountTest() throws InterruptedException {
		
		driver.get(baseUrl);
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		NewAccountPage nap= new NewAccountPage(driver);
		nap.clickonNewAccountlink();
		nap.EnterCustomerID("1256897");
		nap.SelectAccount();
		nap.Enterdepositamount("200");
		nap.clickonSubmitbtn();
		
		
	}

}
