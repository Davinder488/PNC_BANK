package com.pncbank.TestCases;

import org.testng.annotations.Test;

import com.pncbank.PageObjects.DeleteCustomerPage;
import com.pncbank.PageObjects.LoginPage;

public class TC_DeleteCustomerPage_004 extends BaseClass{
	
	
	@Test
	public void DeleteTestCase() throws InterruptedException {
		
        driver.get(baseUrl);
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		driver.manage().window().maximize();
		
		
		Thread.sleep(5000);
		
		DeleteCustomerPage deletepage= new DeleteCustomerPage(driver); 
			
		deletepage.clickonDeleteCustlink();
		deletepage.EnterCustomerID("2255655");
		deletepage.clickonSubmitButton();
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();

}
}