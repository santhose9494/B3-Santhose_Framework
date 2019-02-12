package com.training.pom;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ELTC_082POM {

private WebDriver driver; 
	
	public ELTC_082POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='Username']")
	private WebElement username ;
		
	public void username() {
		this.username.clear();
		this.username.sendKeys("santeach");
	}
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;

	public void password() {
		this.password.clear();
		this.password.sendKeys("santhose");
	}
	
	@FindBy(xpath="//button[@name='submitAuth']")
	private WebElement login;
	
	public void loginasteacher() {
		this.login.click();
	}
		
	@FindBy(xpath="//a[contains(text(),'Selenium Scripting')]")
	private WebElement coursename;
	
	public void coursename() {
		this.coursename.click();
	}
	
	@FindBy(xpath="//img[@title='Tests']")
	private WebElement testicon;
	
	public void testicon() {
		this.testicon.click();
	}
	
	@FindBy(xpath="//a[@class='btn btn-primary']")
	private WebElement createnewtest;
	
	public void createnewtest() {
		this.createnewtest.click();
	}
	
	@FindBy(xpath="//input[@name='exerciseTitle']")
	private WebElement testname;
	
	public void entertestname() {
		this.testname.clear();
		this.testname.sendKeys("febtest1");
	}
	
	@FindBy(xpath="//button[@id='advanced_params']")
	private WebElement advanced;
	
	public void clickadvanced() {
		this.advanced.click();
	}
	
	@FindBy(xpath="//iframe[@class='cke_wysiwyg_frame cke_reset']")
	private WebElement frame1;
	
	@FindBy(xpath="//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']//p")
	private WebElement textbox;
	
	public void testtextbox() {
		driver.switchTo().frame(frame1);
		this.textbox.clear();
		this.textbox.sendKeys("testing");
		driver.switchTo().defaultContent();
	}
	
	@FindBy(xpath="//input[@id='exerciseType_0']")
	private WebElement feedback;
	
	public void feedback() {
		this.feedback.click();
	}
	
	@FindBy(xpath="//label[contains(text(),'Enable start time')]")
	private WebElement enablestarttime;
	
	public void enablestarttime() {
		this.enablestarttime.click();
	}
	
	@FindBy(xpath="//input[@id='pass_percentage']")
	private WebElement passpercentage;
	
	public void enterpasspercentage() {
		this.passpercentage.clear();
		this.passpercentage.sendKeys("60");
	}
	
	@FindBy(xpath="//button[@name='submitExercise']")
	private WebElement proceed;
	
	public void proceedtoquestions() throws InterruptedException {
		this.proceed.click();
		Thread.sleep(1000);
		boolean check1 = driver.getPageSource().contains("Exercise added");
		System.out.println(check1);
	}
	
	@FindBy(xpath="//img[@title='Multiple choice']")
	private WebElement multiplechoice;
	
	public void multiplechoicequestionicon() throws InterruptedException {
		this.multiplechoice.click();
		Thread.sleep(1000);
		boolean check2 = driver.getPageSource().contains("Add this question to the test: Multiple choice");
		System.out.println(check2);
	}
	
	@FindBy(xpath="//input[@name='questionName']")
	private WebElement question;
	
	public void addfirstquestion() {
		this.question.clear();
		this.question.sendKeys("What is the course name?");
	}
	
	@FindBy(xpath="//iframe[@title='Rich Text Editor, answer[1]']")
	private WebElement frame2;
	
	@FindBy(xpath="/body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']//p")
	private WebElement option1;
	
	public void firstquestionfirstoption() {
		driver.switchTo().frame(frame2);
		this.option1.clear();
		this.option1.sendKeys("selenium1");
		driver.switchTo().defaultContent();
	}
	
	@FindBy(xpath="//iframe[@title='Rich Text Editor, answer[2]']")
	private WebElement frame3;
	
	@FindBy(xpath="//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	private WebElement option2;
	
	public void firstquestionsecondoption() {
		driver.switchTo().frame(frame3);
		this.option2.clear();
		this.option2.sendKeys("abs");
		driver.switchTo().defaultContent();
	}
	
	@FindBy(xpath="//iframe[@title='Rich Text Editor, answer[3]']")
	private WebElement frame4;
	
	@FindBy(xpath="//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	private WebElement option3;
	
	public void firstquestionthirdoption() {
		driver.switchTo().frame(frame4);
		this.option3.clear();
		this.option3.sendKeys("3rdoption");
		driver.switchTo().defaultContent();
	}
	
	@FindBy(xpath="//iframe[@title='Rich Text Editor, answer[4]']")
	private WebElement frame5;
	
	@FindBy(xpath="//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	private WebElement option4;
	
	public void firstquestionfourthoption() {
		driver.switchTo().frame(frame5);
		this.option4.clear();
		this.option4.sendKeys("4th");
		driver.switchTo().defaultContent();
	}
	
	@FindBy(xpath="//input[@id='qf_de5866']")
	private WebElement firstoptionradio;
	
	public void selectfirstoptionradio() {
		this.firstoptionradio.click();
	}
	
	@FindBy(xpath="//div[@class='col-sm-8']//button[3]")
	private WebElement addquestion;
	
	public void addfirstquestiontotest() throws InterruptedException {
		this.addquestion.click();
		Thread.sleep(1000);
		boolean check3 = driver.getPageSource().contains("1 questions, for a total score (all questions) of 0.");
		System.out.println(check3);
	}
	
	public void addsecondquestion() {
		this.multiplechoice.click();
		this.question.clear();
		this.question.sendKeys("What is your name?");		
	}
	
	public void secondquestionfirstoption() {
		driver.switchTo().frame(frame2);
		this.option1.clear();
		this.option1.sendKeys("name1");
		driver.switchTo().defaultContent();
	}
	
	public void secondquestionsecondoption() {
		driver.switchTo().frame(frame3);
		this.option1.clear();
		this.option1.sendKeys("name2");
		driver.switchTo().defaultContent();
	}
	
	public void secondquestionthirdoption() {
		driver.switchTo().frame(frame4);
		this.option1.clear();
		this.option1.sendKeys("name3");
		driver.switchTo().defaultContent();
	}
	
	public void secondquestionfourthoption() {
		driver.switchTo().frame(frame5);
		this.option1.clear();
		this.option1.sendKeys("name4");
		driver.switchTo().defaultContent();
	}
	
	@FindBy(xpath="//input[@id='qf_def768']")
	private WebElement secondoptionradio;
	
	public void selectsecondoptionradio() {
		this.secondoptionradio.click();
	}

	public void addsecondquestiontotest() throws InterruptedException {
		this.addquestion.click();
		Thread.sleep(1000);
		boolean check4 = driver.getPageSource().contains("2 questions, for a total score (all questions) of 0.");
		System.out.println(check4);
	}
	
	@FindBy(xpath="//img[@title='Preview']")
	private WebElement previewicon;
	
	public void clickonpreviewicon() throws InterruptedException {
		this.previewicon.click(); 
		Thread.sleep(1000);
		boolean check4 = driver.getPageSource().contains("Start test");
		if(check4 == true) {
			System.out.println("Start test button presents");
		}else {
			System.out.println("No start test button exists");
		}
	}
	
	@FindBy(xpath="//a[@class='dropdown-toggle']//img[@class='img-circle']")
	private WebElement dropdown;
	
	@FindBy(xpath="//a[@title='Logout']")
	private WebElement logout;
	
	public void logout() {
		this.dropdown.click();
		this.logout.click();
	}
	
	public void loginasstudent() {
		this.username.clear();
		this.username.sendKeys("santhosestud");
		this.password.clear();
		this.password.sendKeys("santhose");
		this.login.click();
	}
	
	@FindBy(xpath="//a[@class='btn btn-primary btn-large']")
	private WebElement coursecatalog;
	
	public void clickoncoursecatalog() {
		this.coursecatalog.click();
	}
	
	@FindBy(xpath="//input[@name='search_term']")
	private WebElement searchtextbox;
	
	public void entersearchtext() {
		this.searchtextbox.clear();
		this.searchtextbox.sendKeys("Selenium Scripting");
	}
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement searchbtn;
	
	public void searchicon() {
		this.searchbtn.click();
	}
	
	@FindBy(xpath="//a[@title='Subscribe']")
	private WebElement subscribebtn;
	
	public void subscribecourse() throws InterruptedException {
		this.subscribebtn.click();
		Thread.sleep(1000);
		boolean check5 = driver.getPageSource().contains("You have been registered to course:");
		if(check5 == true) {
			System.out.println("Subscribed to the course");
		} else {
			System.out.println("No subscribtion happens");
		}
	}
	
	@FindBy(xpath="//a[contains(text(),'Selenium Scripting')]")
	private WebElement courselink;
	
	public void entercourse() {
		this.courselink.click();
	}
	
	public void entertests() {
		this.testicon.click();
	}
	
	@FindBy(xpath="//a[contains(text(),'test1')]")
	private WebElement taketest;
	
	public void clickoncourselink() {
		this.taketest.click();
	}
	
	@FindBy(xpath="//a[@class='btn btn-success btn-large']")
	private WebElement starttest;
	
	public void starttest() {
		this.starttest.click();
	}
	
	@FindBy(xpath="//p[contains(text(),'ans1')]")
	private WebElement answerquestion;
	
	public void answerquestion() {
		this.answerquestion.click();
	}
	
	@FindBy(xpath="//button[@name='save_now']")
	private WebElement end;
	
	public void endtest() {
		this.end.click();
	}
	
	public void loginagainasteacher() throws InterruptedException {
		this.dropdown.click();
		this.logout.click();
		Thread.sleep(2000);
		this.username.clear();
		this.username.sendKeys("santeach");
		this.password.clear();
		this.password.sendKeys("santhose");
		this.login.click();
	
	}
	
	@FindBy(xpath="//a[@title='Reporting']")
	private WebElement reportingicon;
	
	public void clickonreporting() {
		this.reportingicon.click();
	}
	
	@FindBy(xpath="//a[contains(text(),'Followed students')]")
	private WebElement followedstudentsicon;
	
	public void followedstudents() {
		this.followedstudentsicon.click();
	}
	
	@FindBy(xpath="//img[@title='2rightarrow.png']")
	private WebElement doublearrow;
	
	public void clickonarrow() {
		this.doublearrow.click();
	}
	
	@FindBy(xpath="//img[@title='Details']")
	private WebElement details;
	
	public void details() {
		this.details.click();
	}
	
	@FindBy(xpath="//img[@title='quiz.png']")
	private WebElement quizicon;
	
	public void clickonquiz() {
		this.quizicon.click();
	}
	
	@FindBy(xpath="//label[contains(text(),'Send email')]")
	private WebElement sendmail;
	
	public void sendmailcheckbox() {
		this.sendmail.click();
	}
	
	@FindBy(xpath="//button[@id='myform_submit']")
	private WebElement correcttest;
	
	public void clickoncorrecttest() {
		this.correcttest.click();
	}
	
	public void backtocoursepage() {
		this.courselink.click();
	}
	
	
	
	
}
	