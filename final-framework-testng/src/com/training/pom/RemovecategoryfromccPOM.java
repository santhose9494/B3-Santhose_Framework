package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RemovecategoryfromccPOM {

	
	public RemovecategoryfromccPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@title='Administration']")
	private WebElement adminstration;
	
	@FindBy(linkText="Courses categories")
	private WebElement coursecategorieslink;
	
	@FindBy(xpath="(//img[@title='Delete this category'])[11]")
	private WebElement deletecategory;
	
	
	public void enteradministration() {
		this.adminstration.click();			    
	}
	
	public void coursecategorieslink() {
	    this.coursecategorieslink.click();	
	}
	
	public void deletecategory() {
		this.deletecategory.click();
	
	}
}
