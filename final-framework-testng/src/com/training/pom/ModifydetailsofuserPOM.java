package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModifydetailsofuserPOM {

private WebDriver driver; 
	
	public ModifydetailsofuserPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="User list")
	private WebElement userlistlink;
	
	@FindBy(xpath="//input[@id='search_simple_keyword']")
	private WebElement searchbox;
	
	@FindBy(xpath="//button[@id='search_simple_submit']")
	private WebElement submitbtn;
	
	@FindBy(xpath="//img[@title='Edit']")
	private WebElement edit;
	
	@FindBy(xpath="//input[@id='user_edit_email']")
	private WebElement editmail;
	
	@FindBy(xpath="//fieldset//div[20]//div[1]//div[1]//label[1]")
	private WebElement account;
	
	@FindBy(xpath="//button[@id='user_edit_submit']")
	private WebElement save;
	
	
	public void enteruserlist() {
		this.userlistlink.click();			    
	}
	
	public void searchboxentry() {
		this.searchbox.clear();
		this.searchbox.sendKeys("sunil");
		this.submitbtn.click();
	}
	
	public void edituser() {
		this.edit.click();			    
	}
	
	public void editmailbox() {
		this.editmail.clear();
		this.editmail.sendKeys("sunil@gmail.com");
	}
	
	public void inactaccount() {
		this.account.click();
	}
	
	public void savedetails() {
		this.save.click();
	}
	
	
}
