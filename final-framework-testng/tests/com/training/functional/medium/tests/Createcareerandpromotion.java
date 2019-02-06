package com.training.functional.medium.tests;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.CreatecarproandsubsestopromotionPOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Createcareerandpromotion {
 
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private CreatecarproandsubsestopromotionPOM createcarproandsubsestopromotionPOM;
  
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		createcarproandsubsestopromotionPOM = new CreatecarproandsubsestopromotionPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}
	@Test
	public void createcareerandpromotion() throws InterruptedException, AWTException {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		Thread.sleep(2000);
		createcarproandsubsestopromotionPOM.carandpromo();
		Thread.sleep(2000);
		createcarproandsubsestopromotionPOM.createcareer();
		Thread.sleep(2000);
		createcarproandsubsestopromotionPOM.carandpromo();
		Thread.sleep(2000);
		createcarproandsubsestopromotionPOM.createpromo();
		Thread.sleep(2000);
		createcarproandsubsestopromotionPOM.selectsessions();
		Thread.sleep(2000);
	}	
	
	
}
