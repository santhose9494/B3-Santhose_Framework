package com.training.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CreatemultipleusersPOM_ELTC_081 {

private WebDriver driver; 
	
	public CreatemultipleusersPOM_ELTC_081(WebDriver driver) {
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
	
	@FindBy(xpath="//div[@class='alert alert-info']")
	private WebElement alert;
	
	public void alertmes() {
		System.out.println(this.alert.getText());
	}
	
	public void backtoadministration() {
		this.administration.click();
	}
	
	@FindBy(xpath="//a[contains(text(),'Add users to course')]")
	private WebElement addcourse;
	
	public void addusertocourse() {
		this.addcourse.click();
	}
		
}
	
