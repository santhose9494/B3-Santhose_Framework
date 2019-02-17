package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class Databasetest_TC085POM {

private WebDriver driver; 
	
	public Databasetest_TC085POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@title='Administration']")
	private WebElement administration ;
	
	
	public void administration() {
		this.administration.click();
	}
	
	@FindBy(xpath="//a[contains(text(),'Add a user')]")
	private WebElement adduser;
	
	public void adduserlink() {
		this.adduser.click();
	}
	
	@FindBy(xpath="//input[@id='firstname']")
	private WebElement firstname;
	
	public void firstname(String firstname) {
		this.firstname.clear();
		this.firstname.sendKeys(firstname);
	}
	
	@FindBy(xpath="//input[@id='lastname']")
	private WebElement lastname;
	
	public void lastname(String lastname) {
		this.lastname.clear();
		this.lastname.sendKeys(lastname);
	}
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement email;
	
	public void email(String email) {
		this.email.clear();
		this.email.sendKeys(email);
	}
	
	@FindBy(xpath="//input[@id='phone']")
	private WebElement phone;
	
	public void phonenumber(String phone) {
		this.phone.clear();
		this.phone.sendKeys(phone);
	}
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement login;
	
	public void login(String login) {
		this.login.clear();
		this.login.sendKeys(login);
	}
	
	@FindBy(xpath="//label[contains(text(),'Enter password')]")
	private WebElement pasradio;
	
	public void radiobtn() {
		this.pasradio.click();
	}
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	public void password(String password) {
		this.password.clear();
		this.password.sendKeys(password);
	}
	
	@FindBy(xpath="//button[@title='Learner']")
	private WebElement profile;
	
	public void profilebtn(String profile) {
		this.profile.click();
		this.profile.sendKeys(profile);
		this.profile.sendKeys(Keys.ENTER);
	}
	
	@FindBy(xpath="//button[@name='submit']")
	private WebElement add;
	
	public void addbtn() {
		this.add.click();
	}
	
	@FindBy(xpath="//a[contains(text(),'Add users to course')]")
	private WebElement addusertocourse;
	
	public void clickonaddusertocourse() {
		this.addusertocourse.click();
	}
	
	public void selectuser() {
		Select userlist = new Select(driver.findElement(By.name("UserList[]")));
		userlist.selectByVisibleText("xen xavier (xavier)");
	}
	
	public void selectcourse() {
		Select courselist = new Select(driver.findElement(By.name("CourseList[]")));
		courselist.selectByVisibleText("(1) CoreJava");
	}
	
	@FindBy(xpath="//button[@value='Add to the course(s) >>']")
	private WebElement addtothecourse;
	
	public void clickonaddtocourse() {
		this.addtothecourse.click();
	}
}