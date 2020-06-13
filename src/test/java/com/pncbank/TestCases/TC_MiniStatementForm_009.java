package com.pncbank.TestCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;


import com.pncbank.PageObjects.LoginPage;
import com.pncbank.PageObjects.MiniStatementPage;

public class TC_MiniStatementForm_009 extends BaseClass{
	
	
	@Test
	public void MiniStatement() throws InterruptedException {
		
		
           driver.get(baseUrl);
		 
		 JavascriptExecutor js=(JavascriptExecutor) driver;
			
			LoginPage lp=new LoginPage(driver);
			lp.setUserName(username);
			lp.setPassword(password);
			lp.clickSubmit();
			driver.manage().window().maximize();
			
			
			Thread.sleep(5000);
			
			
			js.executeScript("scroll(0,1600)");
			
			MiniStatementPage msp= new MiniStatementPage(driver);
			msp.ClickonMiniStatementlink();
			msp.Enteraccno("1564789");
			msp.ClickOnSubmitbtn();
		
	}
	
	

}






















