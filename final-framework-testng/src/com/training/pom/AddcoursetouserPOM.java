package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddcoursetouserPOM {

private WebDriver driver; 
	
	public AddcoursetouserPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@title='Administration']")
	private WebElement adminstration;
	
	@FindBy(linkText="Add users to course")
	private WebElement addcourselink;
	
	@FindBy(xpath="//option[@value='164']")
	private WebElement user1;
	
	@FindBy(xpath="//option[@value='AEL3']")
	private WebElement course1;
	
	@FindBy(xpath="//button[@class='btn btn-primary']")
	private WebElement addtocoursebutton;
	
	
	public void enteradministration() {
		this.adminstration.click();			    
	}
	
	public void addcourlink() {
	    this.addcourselink.click();	
	   
	}
	
	public void selectusers() {
		this.user1.click();			
	}
	
	public void selectcourse() {
		this.course1.click();
	}
	
	public void addtocoursebuttonclick() {
		this.addtocoursebutton.click();
	}
	
}

