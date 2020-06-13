package com.pncbank.TestCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.pncbank.PageObjects.DepositPage;
import com.pncbank.PageObjects.LoginPage;

public class TC_DepositMoneyTest_006 extends BaseClass{
	
	@Test
	public void depositMoney() throws InterruptedException
	
	{
		
		driver.get(baseUrl);
		
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		js.executeScript("scroll(0,1600)");
		
		DepositPage Deposits = new DepositPage(driver);
		Deposits.ClickonDepositLink();
		Deposits.EnterAccountNo("1234567");
		Deposits.EnterAmount("5000");
		Deposits.EnterDescription("My cking acc");
		Deposits.clickOnAccSubmitbtn();
	

}
}
