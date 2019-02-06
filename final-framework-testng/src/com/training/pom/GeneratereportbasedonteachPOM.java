package com.training.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeneratereportbasedonteachPOM {

private WebDriver driver; 
	
	public GeneratereportbasedonteachPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@title='Reporting']")
	private WebElement reporting;
	
	@FindBy(xpath="//a[contains(text(),'Followed teachers')]")
	private WebElement followedteach;
	
	@FindBy(xpath="//input[@id='search_user_keyword']")
	private WebElement keyword;
	
	@FindBy(xpath="//button[@id='search_user_submit']")
	private WebElement searchbtn;
	
	@FindBy(xpath="//img[@title='Details']")
	private WebElement forward1;
	
	@FindBy(xpath="(//img[@src='http://elearning.upskills.in/main/img/icons/22/2rightarrow.png'])[1]")
	private WebElement forward2;
	
	@FindBy(xpath="//img[@title='quiz.png']")
	private WebElement quiz;
	
	@FindBy(xpath="//input[@name='send_notification']")
	private WebElement checkbox;
	
	@FindBy(xpath="//button[@id='myform_submit']")
	private WebElement correcttest;
	
	@FindBy(linkText="Seleniumfortesting")
	private WebElement clicklink;
	
	public void enterreporting() {
		this.reporting.click();
		System.out.println("Current page title is : " +driver.getTitle());
	}
	
	public void followedteachers() {
		this.followedteach.click();
		System.out.println("Current page title is : " +driver.getTitle());
	}
	
	public void keywordsearch() {
		this.keyword.click();
		this.keyword.sendKeys("manzoor");
		System.out.println("Entered keyword is : " +this.keyword.getAttribute("value"));
		this.searchbtn.click();
	}
	
	public void forwarding1() {
		this.forward1.click();
	}
	
	public void forwarding2() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		this.forward2.click();
	}
	
	public void enterquiz() {
		this.quiz.click();
	}
	
	public void sendmail() throws AWTException, InterruptedException {
		this.checkbox.click();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
        this.correcttest.click();
        Thread.sleep(2000);
	}
	
	public void backtocoursepage() {
		this.clicklink.click();
	}
}
