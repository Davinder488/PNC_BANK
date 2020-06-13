package com.pncbank.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangePasswordPage {
	
WebDriver ldriver;
	
	public ChangePasswordPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	@FindBy(xpath="//a[text()='Change Password']")
	WebElement txtchangepasswordlink;
	
	@FindBy(xpath="//input[@name='oldpassword']")
	WebElement txtoldpassword;
	
	@FindBy(xpath="//input[@name='newpassword']")
	WebElement txtnewpassword;
	
	@FindBy(xpath="//input[@name='confirmpassword']")
	WebElement txtconfirmedpassword;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement btnSubmit;
	
	public void Changepasswordlink() {
		txtchangepasswordlink.click();
	}
	public void Enteroldpassword(String abc) {
		txtoldpassword.sendKeys(abc);
	}
	public void Enternewpassword(String def) {
		txtnewpassword.sendKeys(def);
	}
	public void ClickonSubmitbtn() {
		btnSubmit.click();
	}
	

}












