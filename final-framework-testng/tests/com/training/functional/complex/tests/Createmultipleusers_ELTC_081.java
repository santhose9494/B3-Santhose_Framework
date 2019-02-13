package com.training.functional.complex.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;


import org.testng.annotations.Test;

import com.training.dataproviders.LoginDataProviders;
import com.training.dataproviders.UserdetailsDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.CreatemultipleusersPOM_ELTC_081;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Createmultipleusers_ELTC_081 {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private CreatemultipleusersPOM_ELTC_081 createmultipleusersPOM_ELTC_081;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver);
		createmultipleusersPOM_ELTC_081 = new CreatemultipleusersPOM_ELTC_081(driver);
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
	public void loginDBTest(String userName, String password) {
		loginPOM.sendUserName(userName);
		loginPOM.sendPassword(password);
		loginPOM.clickLoginBtn();
		screenShot.captureScreenShot(userName);
	}
	
	@Test(priority = 2, dataProvider = "excel-inputs", dataProviderClass = UserdetailsDataProviders.class)
	public void createuser(String firstname, String lastname, String email, String phone, String login, String password, String profile) throws InterruptedException {
		createmultipleusersPOM_ELTC_081.administration();
		createmultipleusersPOM_ELTC_081.adduserlink();
		createmultipleusersPOM_ELTC_081.firstname(firstname);
		createmultipleusersPOM_ELTC_081.lastname(lastname);
		createmultipleusersPOM_ELTC_081.email(email);
		createmultipleusersPOM_ELTC_081.phonenumber(phone);
		createmultipleusersPOM_ELTC_081.login(login);
		createmultipleusersPOM_ELTC_081.radiobtn();
		createmultipleusersPOM_ELTC_081.password(password);
		Thread.sleep(2000);
		createmultipleusersPOM_ELTC_081.profilebtn(profile);
		createmultipleusersPOM_ELTC_081.addbtn();
		createmultipleusersPOM_ELTC_081.alertmes();
		createmultipleusersPOM_ELTC_081.backtoadministration();
	
	}
	
	@Test(priority = 3, dataProvider = "excel-inputs", dataProviderClass = LoginDataProviders.class)
	public void subscribecoursetouser(String userName, String password) {
		createmultipleusersPOM_ELTC_081.addusertocourse();
	}
	
	
	
	
}