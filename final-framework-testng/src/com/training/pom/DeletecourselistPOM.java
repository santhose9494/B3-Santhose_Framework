package com.training.pom;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeletecourselistPOM {

private WebDriver driver; 
	
	public DeletecourselistPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//img[@title='Delete'])[1]")
	private WebElement deletecourse;
	
	
	public void deletecourse() {
		this.deletecourse.click();		
		String mes = driver.switchTo().alert().getText();
		System.out.println(mes);
		String expected = "Please confirm your choice";
		assertEquals(mes, expected);
	    driver.switchTo().alert().accept();	    
	}
	
	
	
}
