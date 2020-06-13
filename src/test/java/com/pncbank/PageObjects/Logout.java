package com.pncbank.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout{
	
WebDriver ldriver;
	
	public Logout(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);

}
	
	@FindBy(xpath="//a[text()='Log out']")
	WebElement Logoutbtn;

  public void ClickonLogout() {
	  
	  Logoutbtn.click();
	  
  }
  }