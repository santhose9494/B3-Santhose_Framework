package com.training.functional.complex.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;


import org.testng.annotations.Test;

import com.training.dataproviders.DatabasetestDataProviders_TC085;
import com.training.dataproviders.LoginDataProviders_TC083;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.Databasetest_TC085POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Databasetest_ELTC_085 {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private Databasetest_TC085POM databasetest_TC085POM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver);
		databasetest_TC085POM = new Databasetest_TC085POM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);
		// open the browser
		driver.get(baseUrl);
	}


	@AfterClass
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test(priority = 1, dataProvider = "excel-inputs", dataProviderClass = LoginDataProviders_TC083.class)
	public void loginDBTest(String userName, String password) {
		loginPOM.sendUserName(userName);
		loginPOM.sendPassword(password);
		loginPOM.clickLoginBtn();
		screenShot.captureScreenShot(userName);
	}
	
	@Test(priority = 2,dataProvider = "db-inputs", dataProviderClass = DatabasetestDataProviders_TC085.class)
	public void createuser(String firstname, String lastname, String email, String phone, String login, String password, String profile) throws InterruptedException {
		databasetest_TC085POM.administration();
		databasetest_TC085POM.adduserlink();
		databasetest_TC085POM.firstname(firstname);
		databasetest_TC085POM.lastname(lastname);
		databasetest_TC085POM.email(email);
		databasetest_TC085POM.phonenumber(phone);
		databasetest_TC085POM.login(login);
		databasetest_TC085POM.radiobtn();
		databasetest_TC085POM.password(password);
		Thread.sleep(2000);
		databasetest_TC085POM.profilebtn(profile);
		databasetest_TC085POM.addbtn();
	}	
	
	@Test(priority = 3)
	public void addusertocourse() {
		databasetest_TC085POM.administration();
		databasetest_TC085POM.clickonaddusertocourse();
		databasetest_TC085POM.selectuser();
		databasetest_TC085POM.selectcourse();
		databasetest_TC085POM.clickonaddtocourse();
	}
	
	
}