package com.pncbank.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCustomerPage {
	
WebDriver ldriver;
	
	public EditCustomerPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[3]/a")
	WebElement txtlinkEditCust;
	
	//"/html/body/div[3]/div/ul/li[3]/a"
	//
	
	
	@FindBy(name="cusid")
	WebElement txtCustomerID;
	
	@FindBy(name="AccSubmit")
	WebElement AccSubmit;
	
	
	
	public void clinkonlinkEditCust() {
		txtlinkEditCust.click();
	}
	

   public void EnterCustID(String CustID) {
	   txtCustomerID.sendKeys("12345");
   }
   
   public void clickonSubmitbtn() {
	   AccSubmit.click();
   }
   }
   