package com.training.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.Enter;


public class Endtoend_ELTC_084POM {

private WebDriver driver; 
	
	public Endtoend_ELTC_084POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Create a course')]")
	private WebElement createcourselink;
		
	public void clickoncreatecourselink() {
		this.createcourselink.click();
	}
	
	@FindBy(xpath="//input[@name='title']")
	private WebElement coursename;
	
	public void entercoursename() {
		this.coursename.clear();
		this.coursename.sendKeys("Feb13course1");
	}
	
	@FindBy(xpath="//button[@id='advanced_params']")
	private WebElement advancedbtn;
	
	public void clickonadvancedsetting() {
		this.advancedbtn.click();
	}
	
	@FindBy(xpath="//button[@title='none']")
	private WebElement category;
	
	@FindBy(xpath="//div[@class='btn-group bootstrap-select show-tick form-control open']//input[@type='text']")
	private WebElement catsearchbox;
	
	public void clickoncategory() {
		this.category.click();
		this.catsearchbox.click();
		this.catsearchbox.sendKeys("projects");
		this.catsearchbox.sendKeys(Keys.ENTER);
	}
	
	
	
	
	
	
	
	
	
	
}