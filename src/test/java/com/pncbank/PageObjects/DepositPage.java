package com.pncbank.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DepositPage {
	
	
WebDriver ldriver;
	
	public DepositPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	@FindBy(xpath="//a[text()='Deposit']")
	WebElement txtlinkDeposit;
	
	
	
	@FindBy(xpath="//input[@name='accountno']")
	WebElement txtAccountNo;
	
	@FindBy(name="ammount")
	WebElement txtAmmount;
	
	@FindBy(name="desc")
	WebElement txtdescription;
	
	@FindBy(name="AccSubmit")
	WebElement btnSubmit;
	
	
   public void ClickonDepositLink() {
	   txtlinkDeposit.click();
   }
   public void EnterAccountNo(String accno) {
	   txtAccountNo.sendKeys(accno);
   }
   public void EnterAmount(String ammount) {
	   txtAmmount.sendKeys(ammount);
   }
   public void EnterDescription(String abc) {
	   txtdescription.sendKeys(abc);
   }
   public void clickOnAccSubmitbtn() {
   btnSubmit.click();
   }
}
