package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EntercourselistPOM {

private WebDriver driver; 
	
	public EntercourselistPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Course list')]")
	private WebElement courselist;
	
	public void clickcourselist() {
		this.courselist.click();
	}
	
	
	
}
