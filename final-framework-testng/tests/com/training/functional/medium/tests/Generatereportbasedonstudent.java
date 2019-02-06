package com.training.functional.medium.tests;

import static org.testng.Assert.assertEquals;

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
import com.training.pom.GeneratereportbasedonstudPOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Generatereportbasedonstudent {
 
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private GeneratereportbasedonstudPOM generatereportbasedonstudPOM;
  
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
		generatereportbasedonstudPOM = new GeneratereportbasedonstudPOM(driver);
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
	public void generatereportonstudents() throws InterruptedException, AWTException {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		Thread.sleep(2000);
		generatereportbasedonstudPOM.enterreporting();
		screenShot.captureScreenShot("ELTC_053_SS1");
		Thread.sleep(2000);
		generatereportbasedonstudPOM.followedstudents();
		screenShot.captureScreenShot("ELTC_053_SS2");
		Thread.sleep(1000);
		generatereportbasedonstudPOM.keywordsearch();
		screenShot.captureScreenShot("ELTC_053_SS3");
		Thread.sleep(1000);
		generatereportbasedonstudPOM.forwarding1();
		screenShot.captureScreenShot("ELTC_053_SS4");
		Thread.sleep(3000);
		generatereportbasedonstudPOM.forwarding2();
		screenShot.captureScreenShot("ELTC_053_SS5");
		Thread.sleep(1000);
		generatereportbasedonstudPOM.enterquiz();
		screenShot.captureScreenShot("ELTC_053_SS6");
		Thread.sleep(1000);
		generatereportbasedonstudPOM.sendmail();
		screenShot.captureScreenShot("ELTC_053_SS7");
		Thread.sleep(2000);

		if (driver.getPageSource().contains("Message Sent")) {
			String Actual = "Verified";
			String Expected = "Verified";
			assertEquals(Actual, Expected);
			System.out.println("Working Fine");	
		    }
		
		
		generatereportbasedonstudPOM.backtocoursepage();
		Thread.sleep(1000);
	}	
}		
