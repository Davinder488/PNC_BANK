package com.pncbank.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteCustomerPage {
	
WebDriver ldriver;
	
	public DeleteCustomerPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[4]/a")
	WebElement DeleteCustomerLink;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[2]/td[2]/input")
	WebElement CustID;
	
	@FindBy(name="AccSubmit")
	WebElement btnSubmit;
	
	public void clickonDeleteCustlink() {
		DeleteCustomerLink.click();
	}
	public void EnterCustomerID(String custid) {
		CustID.sendKeys(custid);
	}
	public void clickonSubmitButton() {
		btnSubmit.click();
	}
	
	
	
	
	
	
	
	
	
	
}
