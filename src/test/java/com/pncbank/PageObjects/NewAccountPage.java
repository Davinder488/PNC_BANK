package com.pncbank.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewAccountPage {
WebDriver ldriver;
	
	public NewAccountPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	@FindBy(xpath="/html/body/div[3]/div/ul/li[5]/a")
	WebElement txtNewAccountLink;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[2]/td[2]/input")
	WebElement txtCustomerID;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[3]/td[2]/select")
	WebElement txtAccountType;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")
	WebElement txtDeposit;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]")
	WebElement btnSubmit;
	
	
	public void clickonNewAccountlink() {
		txtNewAccountLink.click();
	}
	public void EnterCustomerID(String custID) {
		txtCustomerID.sendKeys(custID);
		}
	
	public void SelectAccount()
	{
		Select abc=new Select(txtAccountType);
		abc.selectByIndex(1);
		//txtAccountType.click();
		
		
	}
	
	public void Enterdepositamount(String amount) {
		txtDeposit.sendKeys(amount);
	}
	public void clickonSubmitbtn() {
		btnSubmit.click();
	}
	
	
	
	
	
}
