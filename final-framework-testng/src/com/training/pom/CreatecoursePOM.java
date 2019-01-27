package com.training.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatecoursePOM {

private WebDriver driver; 
	
	public CreatecoursePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Create a course')]")
	private WebElement createacourse;
	
	@FindBy(id="update_course_title")
	private WebElement title;
	
	@FindBy(id="visual_code")
	private WebElement code;
	
	@FindBy(xpath="(//span[@class='filter-option pull-left'])[1]")
	private WebElement teachers;
	
	@FindBy(xpath="(//input[@class='form-control'])[3]")
    private WebElement searchtextbox;
	
	 @FindBy(xpath="//li[@class='active']//a[@tabindex='0']")
	    private WebElement removesite;
	    
	    @FindBy(xpath="//li[@class='active']//a[@tabindex='0']")
	    private WebElement addmanzoor;
	
	
	@FindBy(xpath="(//span[@class='filter-option pull-left'])[2]")
	private WebElement category;
	
	@FindBy(xpath="(//input[@class='form-control'])[4]")
	private WebElement catsearchbox;
	
	@FindBy(xpath="//button[@id='update_course_submit']")
	private WebElement sumbittocreate;
	
	@FindBy(xpath="//input[@id='course-search-keyword']")
	private WebElement coursesearch;
	
	@FindBy(xpath="//button[@id='search_simple_submit']")
	private WebElement clickonsearch;
	
	
	public void createacoursemeth() {
		this.createacourse.click();
	}
	
	public void titletextbox() {
		this.title.clear();
		this.title.sendKeys("testing");
	}
	
	public void codetextbox() {
		this.code.clear();
		this.code.sendKeys("tes");
	}
	
	public void teacherslistbox() throws InterruptedException {
		this.teachers.click();
		this.searchtextbox.click();
		this.searchtextbox.sendKeys("site");
		Thread.sleep(1000);
		this.searchtextbox.click();
		Thread.sleep(1000);
		this.searchtextbox.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		this.searchtextbox.clear();
		Thread.sleep(1000);
		this.searchtextbox.click();
		this.searchtextbox.sendKeys("manzoor");
		Thread.sleep(1000);
		this.searchtextbox.click();
		Thread.sleep(1000);
		this.searchtextbox.sendKeys(Keys.ENTER);
		
	}
	
	public void categorylistbox() throws InterruptedException {
		this.category.click();
		Thread.sleep(1000);
		this.catsearchbox.click();
		this.catsearchbox.sendKeys("projects");
		Thread.sleep(1000);
		this.catsearchbox.click();
		this.catsearchbox.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		this.sumbittocreate.click();
	}	
	
	public void verifycreatedcourse() {
		this.coursesearch.click();
		this.coursesearch.sendKeys("testing");
		this.clickonsearch.click();		
	}
	
}
