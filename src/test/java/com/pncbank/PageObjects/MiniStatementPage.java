package com.pncbank.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MiniStatementPage {
	
WebDriver ldriver;
	
	public MiniStatementPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);

}
	@FindBy(xpath="//a[text()='Mini Statement']")
	WebElement txtMiniStatementLink;
	
	@FindBy(xpath="//input[@name='accountno']")
	WebElement Fieldaccno;
	
	@FindBy(xpath="//input[@name='AccSubmit']")
	WebElement btnSubmit;
	
	public void ClickonMiniStatementlink() {
		txtMiniStatementLink.click();
	}
		public void Enteraccno(String abc) {
			Fieldaccno.sendKeys(abc);
			
			
		}
		    public void ClickOnSubmitbtn() {
		    	btnSubmit.click();
		}
}
		
		
		
		
		
		
		
		
	
	
	
	
	

