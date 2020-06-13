package com.pncbank.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BalanceQueryPage {
	
WebDriver ldriver;
	
	public BalanceQueryPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath="//a[text()='Balance Enquiry']")
	WebElement txtBalanceEnqiryLink;
	
	@FindBy(xpath="//input[@name='accountno']")
	WebElement AccountNumberField;
	
	@FindBy(xpath="//input[@name='AccSubmit']")
	WebElement AccSubmitbtn;
	
	
	public void ClickonBalanceEnquiryLink() {
		txtBalanceEnqiryLink.click();
		
	}
	public void EnterAccountNo(String abc) {
		AccountNumberField.sendKeys(abc);
	}
	public void SubmitBtn() {
		AccSubmitbtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
