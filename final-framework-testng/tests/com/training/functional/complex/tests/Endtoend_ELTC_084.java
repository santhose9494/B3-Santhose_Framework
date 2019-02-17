package com.training.functional.complex.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;


import org.testng.annotations.Test;

import com.training.dataproviders.LoginDataProviders_Student_TC084;
import com.training.dataproviders.LoginDataProviders_Teacher_TC082;
import com.training.generics.ScreenShot;
import com.training.pom.Endtoend_ELTC_084POM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Endtoend_ELTC_084 {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private Endtoend_ELTC_084POM endtoend_ELTC_084POM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver);
		endtoend_ELTC_084POM = new Endtoend_ELTC_084POM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);
		// open the browser
		driver.get(baseUrl);
	}


	@AfterClass
	public void tearDown() throws Exception {
		driver.quit();
	}
	
	@Test(priority = 1, dataProvider = "excel-inputs", dataProviderClass = LoginDataProviders_Teacher_TC082.class)
	public void loginasteacher(String userName, String password) {
		loginPOM.sendUserName(userName);
		loginPOM.sendPassword(password);
		loginPOM.clickLoginBtn();
		screenShot.captureScreenShot(userName);
	}
	
	@Test(priority = 2)
	public void createcourse() throws InterruptedException {
		endtoend_ELTC_084POM.clickoncreatecourselink();
		endtoend_ELTC_084POM.entercoursename();
		endtoend_ELTC_084POM.clickonadvancedsetting();
		endtoend_ELTC_084POM.selectcategory();
		endtoend_ELTC_084POM.entercoursecode();
		endtoend_ELTC_084POM.selectlanguage();
		endtoend_ELTC_084POM.createthiscourse();
		endtoend_ELTC_084POM.addintroduction();
		endtoend_ELTC_084POM.saveintrotext();
	}
	
	@Test(priority = 3) 
	public void enterdescription() throws InterruptedException {
		endtoend_ELTC_084POM.clickoncoursedescriptionicon();
		endtoend_ELTC_084POM.destitle();
		endtoend_ELTC_084POM.entercontentindes();
		endtoend_ELTC_084POM.clickonsaveindes();
		Thread.sleep(2000);
	}
	
	@Test(priority = 4)
	public void enterobjective() throws InterruptedException {
		endtoend_ELTC_084POM.clickonobjectiveicon();
		endtoend_ELTC_084POM.objtitle();
		endtoend_ELTC_084POM.entercontentinobj();
		endtoend_ELTC_084POM.clickonsaveinobj();
		Thread.sleep(2000);
	}
	
	@Test(priority = 5)
	public void entertopic() throws InterruptedException {
		endtoend_ELTC_084POM.clickontopic();
		endtoend_ELTC_084POM.toptitle();
		endtoend_ELTC_084POM.entercontentintopic();
		endtoend_ELTC_084POM.clickonsaveintopic();
		Thread.sleep(2000);
	}
	
	@Test(priority = 6)
	public void createnewproject() throws InterruptedException {
		endtoend_ELTC_084POM.backtocourselink();
		endtoend_ELTC_084POM.clickonprojectsicon();
		endtoend_ELTC_084POM.clickonnewproject();
		endtoend_ELTC_084POM.enterprojecttitle();
		endtoend_ELTC_084POM.enterprojectsubtitle();
		endtoend_ELTC_084POM.saveblogbtn();
		Thread.sleep(2000);
	}
	
	@Test(priority = 7)
	public void createnewtask() throws InterruptedException {
		endtoend_ELTC_084POM.enterproject();
		endtoend_ELTC_084POM.clickonnewtaskicon();
		endtoend_ELTC_084POM.entertasktitle();
		endtoend_ELTC_084POM.saveprojbtn();
		Thread.sleep(2000);
	}
	
	@Test(priority = 8)
	public void createrolemanagement() throws InterruptedException {
		endtoend_ELTC_084POM.clickonrolesmanagement();
		endtoend_ELTC_084POM.clickonaddnewrole();
		endtoend_ELTC_084POM.enterprojecttasktitle();
		endtoend_ELTC_084POM.saveprojtask();
		Thread.sleep(2000);
		endtoend_ELTC_084POM.clickonassignrole();
		endtoend_ELTC_084POM.clickonvalidate();
		endtoend_ELTC_084POM.clickontaskmanagementicon();
		endtoend_ELTC_084POM.selectcheckbox();
		endtoend_ELTC_084POM.clickvalidate();
		endtoend_ELTC_084POM.logout();
	}
	
	@Test(priority = 9, dataProvider = "excel-inputs", dataProviderClass = LoginDataProviders_Student_TC084.class)
	public void loginasstudent(String userName, String password) {
		loginPOM.sendUserName(userName);
		loginPOM.sendPassword(password);
		loginPOM.clickLoginBtn();
		screenShot.captureScreenShot(userName);
	}
	
	@Test(priority = 10)
	public void studentcomment() throws InterruptedException {
		endtoend_ELTC_084POM.coursecatalog();
		endtoend_ELTC_084POM.searchcourse();
		endtoend_ELTC_084POM.subscribecourse();
		endtoend_ELTC_084POM.selectproject();
		endtoend_ELTC_084POM.mytask();
		endtoend_ELTC_084POM.entertaskcommenttitle();
		endtoend_ELTC_084POM.entercontentincomment();
		endtoend_ELTC_084POM.savebutton();
		endtoend_ELTC_084POM.logoutagain();
	}
	
	@Test(priority = 11, dataProvider = "excel-inputs", dataProviderClass = LoginDataProviders_Teacher_TC082.class)
	public void loginasteacheragain(String userName, String password) {
		loginPOM.sendUserName(userName);
		loginPOM.sendPassword(password);
		loginPOM.clickLoginBtn();
		screenShot.captureScreenShot(userName);
	}
	
	@Test(priority = 12)
	public void reporting() {
		endtoend_ELTC_084POM.clickonreporting();
		endtoend_ELTC_084POM.clickonfollowedstudents();
		endtoend_ELTC_084POM.clickonarrow();
	}
	
}