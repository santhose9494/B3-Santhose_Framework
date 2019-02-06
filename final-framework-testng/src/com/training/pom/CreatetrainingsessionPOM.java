package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatetrainingsessionPOM {

private WebDriver driver; 
	
	public CreatetrainingsessionPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Sessions categories list")
	private WebElement sessioncategories;
	
	@FindBy(xpath="//img[@title='Add category']")
	private WebElement addcategoryicon;
	
	@FindBy(xpath="//input[@placeholder='Category']")
	private WebElement categoryname;
	
	@FindBy(xpath="//button[@value='Add category']")
	private WebElement addcatbtn;
	
	@FindBy(xpath="//img[@title='Training sessions list']")
	private WebElement seslist;
	
	@FindBy(xpath="//img[@title='Add a training session']")
	private WebElement addtrainsesicon;
	
	@FindBy(xpath="//input[@id='add_session_name']")
	private WebElement sesname;
	
	@FindBy(xpath="//button[@id='advanced_params']")
	private WebElement advanced;
	
	@FindBy(xpath="(//span[@class='filter-option pull-left'])[2]")
	private WebElement sescategories;
	
	@FindBy(xpath="//span[contains(text(),'Testing')]")
	private WebElement select;
	
	@FindBy(xpath="//button[@id='add_session_submit']")
	private WebElement nextstepbtn;
	
	@FindBy(xpath="//option[@title='MediumProject (MEDIUMTESTCASES)']")
	private WebElement selcourse;
	
	@FindBy(xpath="//button[@name='add_course']")
	private WebElement move;
	
	@FindBy(xpath="//select[@id='destination']")
	private WebElement selectedcourses;
	
	@FindBy(xpath="//button[@name='next']")
	private WebElement nxtstep;
	
	@FindBy(xpath="//input[@id='user_to_add']")
	private WebElement studname;
	
	@FindBy(xpath="//a[contains(text(),'kumar sunil (sunkum09) SUNKUM09')]")
	private WebElement selstud;
	
	@FindBy(xpath="//select[@id='destination_users']")
	private WebElement regusers;
	
	@FindBy(xpath="//button[contains(text(),'Finish session creation')]")
	private WebElement finsession;

	
	public void entersessioncategories() {
		this.sessioncategories.click();			
	}
	
	public void addcategory() {
		this.addcategoryicon.click();		
		this.categoryname.sendKeys("Testing");
		System.out.println("Entered category name is : " +categoryname.getAttribute("value"));
		this.addcatbtn.click();
	}
	
	public void sessionlist() {
		this.seslist.click();			
	}
	
	public void addtrainingsession() {
		this.addtrainsesicon.click();
		this.sesname.sendKeys("selenium training session");
		System.out.println("Entered session name is : " +sesname.getAttribute("value"));
		this.advanced.click();
		this.sescategories.click();
		this.select.click();
		System.out.println("Selected session categories is : " + sescategories.getText());
		this.nextstepbtn.click();
		System.out.println("Page title is : " +driver.getTitle());
	}
	
	public void selectcourse() {
		this.selcourse.click();
		this.move.click();
		System.out.println("Selected courses in this session is : " +this.selectedcourses.getText());
		this.nxtstep.click();
		System.out.println("Now page title is : " +driver.getTitle());
	}
	
	public void selectstudent() throws InterruptedException { 
		this.studname.click();
		this.studname.sendKeys("sunil");
		Thread.sleep(2000);
		this.selstud.click();
		System.out.println("Registered users for this session is : " +this.regusers.getText());
	}
	
	public void finishsession() {
		this.finsession.click();
	}
	
	
}
