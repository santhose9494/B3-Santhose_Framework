package com.training.functional.complex.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;


import org.testng.annotations.Test;

import com.training.dataproviders.LoginDataProviders_TC083;
import com.training.dataproviders.UserdetailsDataProviders_TC083;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.Negative_ELTC_083POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Negative_ELTC_083 {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private Negative_ELTC_083POM negative_ELTC_083POM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver);
		negative_ELTC_083POM = new Negative_ELTC_083POM(driver);
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
	
	@Test(priority = 2, dataProvider = "excel-inputs", dataProviderClass = UserdetailsDataProviders_TC083.class)
	public void createuser(String firstname, String lastname, String email, String phone, String login, String password, String profile) throws InterruptedException {
		negative_ELTC_083POM.administration();
		negative_ELTC_083POM.adduserlink();
		negative_ELTC_083POM.firstname(firstname);
		negative_ELTC_083POM.lastname(lastname);
		negative_ELTC_083POM.email(email);
		negative_ELTC_083POM.phonenumber(phone);
		negative_ELTC_083POM.login(login);
		negative_ELTC_083POM.radiobtn();
		negative_ELTC_083POM.password(password);
		Thread.sleep(2000);
		negative_ELTC_083POM.profilebtn(profile);
		negative_ELTC_083POM.addbtn();
		if(driver.getPageSource().contains("The email address is not complete or contains some invalid characters")) {
			System.out.println("Error occured for " + firstname + lastname + " : The email address is not complete or contains some invalid characters");
		} else {
			System.out.println("Registration successful");
		}
	
	}	
	
}