package com.training.functional.complex.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;


import org.testng.annotations.Test;

import com.training.dataproviders.LoginDataProviders;
import com.training.dataproviders.LoginDataProviders2;
import com.training.generics.ScreenShot;
import com.training.pom.Endtoend_ELTC_082POM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Endtoendforteacherandstud_ELTC_082 {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private Endtoend_ELTC_082POM endtoend_ELTC_082POM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver);
		endtoend_ELTC_082POM = new Endtoend_ELTC_082POM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);
		// open the browser
		driver.get(baseUrl);
	}


	@AfterClass
	public void tearDown() throws Exception {
		driver.quit();
	}
	
	@Test(priority = 1, dataProvider = "excel-inputs", dataProviderClass = LoginDataProviders.class)
	public void loginasteacher(String userName, String password) {
		loginPOM.sendUserName(userName);
		loginPOM.sendPassword(password);
		loginPOM.clickLoginBtn();
		screenShot.captureScreenShot(userName);
	}
	
	@Test(priority = 2)
	public void createtest() throws InterruptedException {
		endtoend_ELTC_082POM.coursename();
		endtoend_ELTC_082POM.testicon();
		endtoend_ELTC_082POM.createnewtest();
		endtoend_ELTC_082POM.entertestname();
		endtoend_ELTC_082POM.clickadvanced();
		Thread.sleep(2000);
		endtoend_ELTC_082POM.testtextbox();
		endtoend_ELTC_082POM.feedback();
		endtoend_ELTC_082POM.enterpasspercentage();
		endtoend_ELTC_082POM.proceedtoquestions();
		endtoend_ELTC_082POM.multiplechoicequestionicon();
		endtoend_ELTC_082POM.addfirstquestion();
		endtoend_ELTC_082POM.firstquestionfirstoption();
		endtoend_ELTC_082POM.firstquestionsecondoption();
		endtoend_ELTC_082POM.firstquestionthirdoption();
		endtoend_ELTC_082POM.firstquestionfourthoption();
		endtoend_ELTC_082POM.addfirstquestiontotest();
		endtoend_ELTC_082POM.addsecondquestion();
		endtoend_ELTC_082POM.secondquestionfirstoption();
		endtoend_ELTC_082POM.secondquestionsecondoption();
		endtoend_ELTC_082POM.secondquestionthirdoption();
		endtoend_ELTC_082POM.secondquestionfourthoption();
		endtoend_ELTC_082POM.selectsecondoptionradio();
		endtoend_ELTC_082POM.addsecondquestiontotest();
		Thread.sleep(1000);
		endtoend_ELTC_082POM.clickonpreviewicon();
		Thread.sleep(1000);
		endtoend_ELTC_082POM.logout();	
	}
	
	@Test(priority = 3, dataProvider = "excel-inputs", dataProviderClass = LoginDataProviders2.class)
	public void loginasstudent(String userName, String password) {
		loginPOM.sendUserName(userName);
		loginPOM.sendPassword(password);
		loginPOM.clickLoginBtn();
		screenShot.captureScreenShot(userName);
	}
	
	@Test(priority = 4)
	public void taketestasstudent() throws InterruptedException {
		endtoend_ELTC_082POM.clickoncoursecatalog();
		endtoend_ELTC_082POM.entersearchtext();
		endtoend_ELTC_082POM.searchicon();
		endtoend_ELTC_082POM.subscribecourse();
		endtoend_ELTC_082POM.entercourse();
		endtoend_ELTC_082POM.entertests();
		endtoend_ELTC_082POM.clickoncourselink();
		endtoend_ELTC_082POM.starttest();
		endtoend_ELTC_082POM.answerquestion();
		endtoend_ELTC_082POM.endtest();
		endtoend_ELTC_082POM.logout();	
	}
	
	@Test(priority = 5, dataProvider = "excel-inputs", dataProviderClass = LoginDataProviders.class)
	public void loginagainasteacher(String userName, String password) {
		loginPOM.sendUserName(userName);
		loginPOM.sendPassword(password);
		loginPOM.clickLoginBtn();
		screenShot.captureScreenShot(userName);
	}
	
	@Test(priority = 6)
	public void generatereportasteacher() {
		endtoend_ELTC_082POM.clickonreporting();
		endtoend_ELTC_082POM.followedstudents();
		endtoend_ELTC_082POM.clickonarrow();
		endtoend_ELTC_082POM.details();
		endtoend_ELTC_082POM.clickonquiz();
		endtoend_ELTC_082POM.sendmailcheckbox();
		endtoend_ELTC_082POM.clickoncorrecttest();
		endtoend_ELTC_082POM.backtocoursepage();	
	}
}