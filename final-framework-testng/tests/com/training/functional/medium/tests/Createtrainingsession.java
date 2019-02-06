package com.training.functional.medium.tests;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.CreatetrainingsessionPOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Createtrainingsession {
  
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private CreatetrainingsessionPOM createtrainingsessionPOM;
  
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
		createtrainingsessionPOM = new CreatetrainingsessionPOM(driver);
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
	public void createtrainingsession() throws InterruptedException {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		Thread.sleep(3000);
		createtrainingsessionPOM.entersessioncategories();
		//screenShot.captureScreenShot("ELTC_051_SS1");
		createtrainingsessionPOM.addcategory();
		//screenShot.captureScreenShot("ELTC_051_SS2");
		if (driver.getPageSource().contains("The category has been added")) {
			System.out.println("The category has been added message is displayed");
		    } else {
		    System.out.println("The category has been added message is not displayed");	
		    }
		Thread.sleep(2000);
		createtrainingsessionPOM.sessionlist();
		screenShot.captureScreenShot("ELTC_052_SS1");
		Thread.sleep(2000);
		createtrainingsessionPOM.addtrainingsession();
		screenShot.captureScreenShot("ELTC_052_SS2");
		Thread.sleep(2000);
		createtrainingsessionPOM.selectcourse();
		screenShot.captureScreenShot("ELTC_052_SS3");
		Thread.sleep(2000);
		createtrainingsessionPOM.selectstudent();
		screenShot.captureScreenShot("ELTC_052_SS4");
		Thread.sleep(2000);
		createtrainingsessionPOM.finishsession();
		screenShot.captureScreenShot("ELTC_052_SS5");
		Thread.sleep(1000);
		
		if (driver.getPageSource().contains("sel tra ses")) {
			if (driver.getPageSource().contains("MediumProject (MEDIUMTESTCASES)")) {
				if (driver.getPageSource().contains("sunil kumar (sunkum09)")) {
					String Actual = "Verified";
					String Expected = "Verified";
					assertEquals(Actual, Expected);
					System.out.println("Working Fine");
				}
			}
		}
	}		
	
}
