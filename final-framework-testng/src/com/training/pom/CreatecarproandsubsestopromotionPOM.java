package com.training.pom;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatecarproandsubsestopromotionPOM {

private WebDriver driver; 
	
	public CreatecarproandsubsestopromotionPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Careers and promotions")
	private WebElement candp;
	
	@FindBy(xpath="//img[@title='Careers']")
	private WebElement careersicon;
	
	@FindBy(xpath="//img[@title='Add']")
	private WebElement addicon;
	
	@FindBy(xpath="//input[@name='name']")
	private WebElement carname;
	
	@FindBy(xpath="//button[@id='career_submit']")
	private WebElement caraddbtn;
	
	@FindBy(xpath="//img[@title='Promotions']")
	private WebElement promo;
	
	@FindBy(xpath="//input[@id='name']")
	private WebElement promoname;
	
	@FindBy(xpath="//button[@id='promotion_submit']")
	private WebElement promoaddbtn;
	
	@FindBy(xpath="//td[@title='feb5promo1']//following-sibling::td[@aria-describedby='promotions_actions']//child::img[@title='Subscribe sessions to promotions']")
	private WebElement subsestopromoicon;
	
	@FindBy(xpath="//option[@value='17']")
	private WebElement leftside;
	
	@FindBy(xpath="(//button[@class='btn btn-default'])[1]")
	private WebElement move;
	
	@FindBy(xpath="//select[@id='session_in_promotion']")
	private WebElement selecteditems;
	
	@FindBy(xpath="//button[contains(text(),'Subscribe sessions to promotion')]")
	private WebElement subscribebtn;
	
	
	public void carandpromo() {
		System.out.println("Page Title is : " +driver.getTitle());
		this.candp.click();
		System.out.println("Page Title is : " +driver.getTitle());
	}
	
	public void createcareer() throws InterruptedException {
		this.careersicon.click();
		this.addicon.click();
		this.carname.sendKeys("QA");
		Thread.sleep(1000);
		System.out.println("Entered Career Name is : " +this.carname.getText());
		this.caraddbtn.click();
		this.candp.click();
	}
	
	public void createpromo() throws InterruptedException {
		this.promo.click();
		this.addicon.click();
		this.promoname.sendKeys("QA for Tester");
		Thread.sleep(1000);
		System.out.println("Entered Promotion Name is : " +this.promoname.getText());
		this.promoaddbtn.click();		
        Thread.sleep(2000);
        this.subsestopromoicon.click();
        System.out.println("Page Title is : " +driver.getTitle());
	}
	
	public void selectsessions() throws InterruptedException {
		this.leftside.click();
		this.move.click();
		Thread.sleep(1000);
		System.out.println("Selected items are : " +this.selecteditems.getText()); 
		String Actual = this.selecteditems.getText();
		this.subscribebtn.click();
		this.subsestopromoicon.click();
		Thread.sleep(2000);
		String Expected = this.selecteditems.getText();
		assertEquals(Actual, Expected);
	}
	
}
