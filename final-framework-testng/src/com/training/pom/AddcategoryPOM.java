package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddcategoryPOM {

public AddcategoryPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@title='Administration']")
	private WebElement adminstration;
	
	@FindBy(linkText="Courses categories")
	private WebElement coursecategorieslink;
	
	@FindBy(xpath="//img[@title='Add category']")
	private WebElement addcat;
	
	@FindBy(xpath="//input[@id='course_category_code']")
	private WebElement catcode;
	
	@FindBy(xpath="//input[@id='course_category_name']")
	private WebElement catname;
	
	@FindBy(xpath="//button[@id='course_category_submit']")
	private WebElement submit;
	
	@FindBy(xpath="//img[@title='Back']")
	private WebElement back;
	
	
	public void enteradministration() {
		this.adminstration.click();			    
	}
	
	public void coursecategorieslink() {
	    this.coursecategorieslink.click();	
	}
	
    public void addcategory() {
    	this.addcat.click();
    }
    
    public void catcodeandname() {
    	this.catcode.clear();
    	this.catcode.sendKeys("BL");
    	this.catname.clear();
    	this.catname.sendKeys("Blended Learning");
    }
	
    public void submitcat() {
    	this.submit.click();
    }
    
    public void backtocatlist() {
    	this.back.click();
    }
}

