package com.pncbank.TestCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.pncbank.PageObjects.LoginPage;
import com.pncbank.PageObjects.Logout;

public class TC_LogoutTest_010 extends BaseClass{
	
	@Test
	public void Logoutend() throws InterruptedException {
		
		
	    driver.get(baseUrl);
		 
			 JavascriptExecutor js=(JavascriptExecutor) driver;
				
				LoginPage lp=new LoginPage(driver);
				lp.setUserName(username);
				lp.setPassword(password);
				lp.clickSubmit();
				driver.manage().window().maximize();
				
				
				Thread.sleep(5000);
				
				
				js.executeScript("scroll(0,1600)");
				
				Logout logout =new Logout(driver);
				logout.ClickonLogout();
				driver.switchTo().alert().accept();
		
	}
	
	
	
	
	
	
	
}