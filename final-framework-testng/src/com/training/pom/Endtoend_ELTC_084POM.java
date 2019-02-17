package com.training.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


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
		this.coursename.sendKeys("selenium");
	}
	
	@FindBy(xpath="//button[@id='advanced_params']")
	private WebElement advancedbtn;
	
	public void clickonadvancedsetting() {
		this.advancedbtn.click();
	}
	
	@FindBy(xpath="//button[@title='none']")
	private WebElement category;
	
	@FindBy(xpath="(//div[@class='bs-searchbox']//input[@aria-label='Search'])[1]")
	private WebElement catsearchbox;
	
	public void selectcategory() throws InterruptedException {
		this.category.click();
		Thread.sleep(1000);
		this.catsearchbox.click();
		this.catsearchbox.sendKeys("projects");
		Thread.sleep(1000);
		this.catsearchbox.click();
		this.catsearchbox.sendKeys(Keys.ENTER);
	}
	
	@FindBy(xpath="//input[@title='Only letters (a-z) and numbers (0-9)']")
	private WebElement coursecode;
	
	public void entercoursecode() {
		this.coursecode.clear();
		this.coursecode.sendKeys("sel");
	}
	
	@FindBy(xpath="//button[@title='English']")
	private WebElement language;
	
	@FindBy(xpath="(//div[@class='bs-searchbox']//input[@aria-label='Search'])[2]")
	private WebElement langsearchbox;
	
	public void selectlanguage() {
		this.language.click();
		this.langsearchbox.click();
		this.langsearchbox.sendKeys("english");
		this.langsearchbox.sendKeys(Keys.ENTER);
	}
	
	@FindBy(xpath="//button[@id='add_course_submit']")
	private WebElement createthiscourse;
	
	public void createthiscourse() {
		this.createthiscourse.click();
		driver.getTitle();
	}
	
	@FindBy(xpath="//div[@class='help-course']//a[@title='Add an introduction text']")
	private WebElement addintro;
	
	@FindBy(xpath="//iframe[@title='Rich Text Editor, intro_content']")
	private WebElement addintroframe;
	
	@FindBy(xpath="//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	private WebElement frametextbox1;
	
	public void addintroduction() {
		this.addintro.click();
		driver.switchTo().frame(addintroframe);
		this.frametextbox1.clear();
		this.frametextbox1.sendKeys("this is an selenium course");
		driver.switchTo().defaultContent();
	}
	
	@FindBy(xpath="//button[@name='intro_cmdUpdate']")
	private WebElement saveintro;
	
	public void saveintrotext() {
		this.saveintro.click();
	}
	
	@FindBy(xpath="//img[@title='Course description']")
	private WebElement desriptionicon;
	
	public void clickoncoursedescriptionicon() {
		this.desriptionicon.click();
	}
	
	@FindBy(xpath="//img[@title='Description']")
	private WebElement desicon;
	
	public void desicon() {
		this.desicon.click();
	}
	
	@FindBy(xpath="//input[@name='title']")
	private WebElement title;
	
	public void destitle() {
		this.title.clear();
		this.title.sendKeys("selenium course for beginners");
	}
	
	@FindBy(xpath="//iframe[@title='Rich Text Editor, contentDescription']")
	private WebElement frame2;
	
	@FindBy(xpath="//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']//p")
	private WebElement frametextbox2;
	
	public void entercontentindes() {
		driver.switchTo().frame(frame2);
		this.frametextbox2.clear();
		this.frametextbox2.sendKeys("selenium course for beginners");
		driver.switchTo().defaultContent();
	}
	
	@FindBy(xpath="//button[@name='submit']")
	private WebElement savebtn;
	
	public void clickonsaveindes() {
		this.savebtn.click();
	}
	
	@FindBy(xpath="//img[@title='Objectives']")
	private WebElement objicon;
	
	public void clickonobjectiveicon() {
		this.objicon.click();
	}
	
	public void objtitle() {
		this.title.clear();
		this.title.sendKeys("selenium course for beginners");
	}
	
	public void entercontentinobj() {
		driver.switchTo().frame(frame2);
		this.frametextbox2.clear();
		this.frametextbox2.sendKeys("selenium course for beginners");
		driver.switchTo().defaultContent();
	}
	
	@FindBy(xpath="//button[@id='course_description_submit']")
	private WebElement save;
	
	public void clickonsaveinobj() {
		this.save.click();
	}
	
	@FindBy(xpath="//img[@title='Topics']")
	private WebElement topicicon;
	
	public void clickontopic() {
		this.topicicon.click();
	}
	
	public void toptitle() {
		this.title.clear();
		this.title.sendKeys("selenium course for beginners");
	}
	
	public void entercontentintopic() {
		driver.switchTo().frame(frame2);
		this.frametextbox2.clear();
		this.frametextbox2.sendKeys("selenium course for beginners");
		driver.switchTo().defaultContent();
	}
	
	public void clickonsaveintopic() {
		this.save.click();
	}
	
	@FindBy(xpath="//a[contains(text(),'selenium')]")
	private WebElement courselink;
	
	public void backtocourselink() {
		this.courselink.click();
	}
	
	@FindBy(xpath="//img[@title='Projects']")
	private WebElement projectsicon;
	
	public void clickonprojectsicon() {
		this.projectsicon.click();
	}
	
	@FindBy(xpath="//img[@title='Create a new project']")
	private WebElement createnewproject;
	
	public void clickonnewproject() {
		this.createnewproject.click();
	}
	
	@FindBy(xpath="//input[@name='blog_name']")
	private WebElement projtitle;
	
	public void enterprojecttitle() {
		this.projtitle.clear();
		this.projtitle.sendKeys("e learning");
	}
	
	@FindBy(xpath="//textarea[@id='add_blog_blog_subtitle']")
	private WebElement projsubtitle;
	
	public void enterprojectsubtitle() {
		this.projsubtitle.clear();
		this.projsubtitle.sendKeys("e learning project");
	}
	
	@FindBy(xpath="//button[@id='add_blog_submit']")
	private WebElement saveblog;
	
	public void saveblogbtn() {
		this.saveblog.click();
	}
	
	@FindBy(xpath="//a[contains(text(),'e learning project')]")
	private WebElement enterproject;
	
	public void enterproject() {
		this.enterproject.click();
	}
	
	@FindBy(xpath="//img[@title='New task']")
	private WebElement newtaskicon;
	
	public void clickonnewtaskicon() {
		this.newtaskicon.click();
	}
	
	public void entertasktitle() {
		this.title.clear();
		this.title.sendKeys("design");
	}
	
	@FindBy(xpath="//button[@id='add_post_save']")
	private WebElement saveproj;
	
	public void saveprojbtn() {
		this.saveproj.click();
	}
	
	@FindBy(xpath="//img[@title='Roles management']")
	private WebElement rolemanageicon;
	
	public void clickonrolesmanagement() {
		this.rolemanageicon.click();
	}
	
	@FindBy(xpath="//a[contains(text(),'Add a new role')]")
	private WebElement addnewrole;
	
	public void clickonaddnewrole() {
		this.addnewrole.click();
	}
	
	@FindBy(xpath="//input[@name='task_name']")
	private WebElement taskname;
	
	public void enterprojecttasktitle() {
		this.taskname.clear();
		this.taskname.sendKeys("developer");
	}
	
	public void saveprojtask() {
		this.savebtn.click();
	}
	
	@FindBy(xpath="//a[contains(text(),'Assign roles')]")
	private WebElement assignroleicon;
	
	public void clickonassignrole() {
		this.assignroleicon.click();
	}
	
	@FindBy(xpath="//button[@id='assign_task_submit']")
	private WebElement validatebtn;
	
	public void clickonvalidate() {
		this.validatebtn.click();
	}
	
	@FindBy(xpath="//img[@title='Users management']")
	private WebElement taskmanagementicon;
	
	public void clickontaskmanagementicon() {
		this.taskmanagementicon.click();
	}
	
	@FindBy(xpath="(//tbody//tr[@class='row_even']//td[1]//child::input[@name='user[]'])[1]")
	private WebElement checkbox;
	
	public void selectcheckbox() {
		this.checkbox.click();
	}
	
	@FindBy(xpath="//a[contains(@class,'btn btn-primary')]")
	private WebElement register;
	
	public void clickvalidate() {
		this.register.click();
	}
	
	@FindBy(xpath="//a[@class='dropdown-toggle']//img[@class='img-circle']")
	private WebElement dropdown;
	
	@FindBy(xpath="//a[@title='Logout']")
	private WebElement logout;
	
	public void logout() {
		this.dropdown.click();
		this.logout.click();
	}
	
	@FindBy(xpath="//a[contains(text(),'Course catalog')]")
	private WebElement coursecat;
	
	public void coursecatalog() {
		this.coursecat.click();
	}
	
	@FindBy(xpath="//input[@name='search_term']")
	private WebElement searchcourse;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement searchicon;
	
	public void searchcourse() {
		this.searchcourse.clear();
		this.searchcourse.sendKeys("selenium");
		this.searchicon.click();
	}
	
	@FindBy(xpath="//a[@title='Subscribe']")
	private WebElement subscribe;
	
	public void subscribecourse() {
		this.subscribe.click();
	}
	
	@FindBy(xpath="//img[@title='e learning']")
	private WebElement project;
	
	public void selectproject() {
		this.project.click();
		System.out.println(driver.getTitle());
	}
	
	@FindBy(xpath="//a[@title='developer']")
	private WebElement mytask;
	
	public void mytask() {
		this.mytask.click();
	}
	
	public void entertaskcommenttitle() {
		this.title.clear();
		this.title.sendKeys("commenting");
	}
	
	@FindBy(xpath="//iframe[@title='Rich Text Editor, comment']")
	private WebElement frame3;
	
	public void entercontentincomment() {
		driver.switchTo().frame(frame3);
		this.frametextbox2.clear();
		this.frametextbox2.sendKeys("done");
		driver.switchTo().defaultContent();
	}
	
	@FindBy(xpath="//button[@id='add_post_save']")
	private WebElement savecomment;
	
	public void savebutton() throws InterruptedException {
		this.savecomment.click();
		Thread.sleep(2000);
		System.out.println(driver.getPageSource().contains("done"));
	}
	
	public void logoutagain() {
		this.dropdown.click();
		this.logout.click();
	}
	
	@FindBy(xpath="//a[@title='Reporting']")
	private WebElement reporting;
	
	public void clickonreporting() {
		this.reporting.click();
	}
	
	@FindBy(xpath="//a[contains(text(),'Followed students')]")
	private WebElement followedstudents;
	
	public void clickonfollowedstudents() {
		this.followedstudents.click();
	}
	
	@FindBy(xpath="//tbody//tr//td[contains(text(),'student')]//following-sibling::td[contains(text(),'8')]//following-sibling::td[3]//child::img[@title='2rightarrow.png']")
	private WebElement doublearrow;
	
	public void clickonarrow() {
		this.doublearrow.click();
	}
	
	
}