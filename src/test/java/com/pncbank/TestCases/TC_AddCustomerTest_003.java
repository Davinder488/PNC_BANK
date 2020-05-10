package com.pncbank.TestCases;

import org.testng.annotations.Test;

import com.pncbank.PageObjects.AddCustomerPage;
import com.pncbank.PageObjects.LoginPage;

public class TC_AddCustomerTest_003 extends BaseClass{

	@Test
	public void addNewCustomer() throws InterruptedException
	
	{
		
		driver.get(baseUrl);
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		AddCustomerPage addcust=new AddCustomerPage(driver);
		addcust.clickAddNewCustomer();
		addcust.custname("Davinder");
		addcust.custgender("male");
		addcust.custdob("10", "15", "19");
		
		Thread.sleep(3000);
		addcust.custaddress("INDIA");
		addcust.custcity("Banga");
		addcust.custstate("Punjab");
		addcust.custpinno("22015000");
		addcust.custtelephoneno("7034596753");
		addcust.custemailid("ManinderBirha@gmail.com");
		addcust.custpassword("hjkashfkafa");
		addcust.custsubmit();
	}   
}
