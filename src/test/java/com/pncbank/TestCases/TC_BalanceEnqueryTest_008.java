package com.pncbank.TestCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.pncbank.PageObjects.BalanceQueryPage;
import com.pncbank.PageObjects.LoginPage;

public class TC_BalanceEnqueryTest_008 extends BaseClass{
	
	@Test
	public void BalanceEnqueryTestCase() throws InterruptedException {
		
		
		 driver.get(baseUrl);
		 
		 JavascriptExecutor js=(JavascriptExecutor) driver;
			
			LoginPage lp=new LoginPage(driver);
			lp.setUserName(username);
			lp.setPassword(password);
			lp.clickSubmit();
			driver.manage().window().maximize();
			
			
			Thread.sleep(5000);
			
			
			js.executeScript("scroll(0,1600)");
			BalanceQueryPage bqp= new BalanceQueryPage(driver);
			
			bqp.ClickonBalanceEnquiryLink();
			bqp.EnterAccountNo("5897896");
			bqp.SubmitBtn();
	}

}
