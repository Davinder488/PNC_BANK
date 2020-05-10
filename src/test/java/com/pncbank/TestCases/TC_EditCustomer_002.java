package com.pncbank.TestCases;

import org.testng.annotations.Test;

import com.pncbank.PageObjects.EditCustomerPage;
import com.pncbank.PageObjects.LoginPage;

public class TC_EditCustomer_002 extends BaseClass{
	
	@Test
	public void editTestCase() throws InterruptedException {
		
        driver.get(baseUrl);
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		driver.manage().window().maximize();
		
		
		Thread.sleep(5000);
		
		EditCustomerPage editcust=new EditCustomerPage(driver);
		editcust.clinkonlinkEditCust();
		
		Thread.sleep(3000);
		editcust.EnterCustID("2568925");
		editcust.clickonSubmitbtn();
		
		
		
	}
	
	
    
	

}
