package com.training.functional.simple.tests;

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
import com.training.pom.CreatecoursePOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

import common.Assert;

public class Createcourse {
  
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private CreatecoursePOM createcoursePOM;
	String actualString, expectedString;
	

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
		createcoursePOM = new CreatecoursePOM(driver);
		
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
	public void newcoursecreation() throws InterruptedException {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		Thread.sleep(3000);
		createcoursePOM.createacoursemeth();
		createcoursePOM.titletextbox();
		createcoursePOM.codetextbox();		
		createcoursePOM.teacherslistbox();		
		createcoursePOM.categorylistbox();	
		screenShot.captureScreenShot("ELTC_022_SS1");	
		
		boolean done = driver.getPageSource().contains("Course testing added");
		
		if (done = true) {
			System.out.println("Course 'testing' added successfully to the course list");
		} else {
			System.out.println("Course not added to the course list");
		}
		
		
		createcoursePOM.verifycreatedcourse();
		screenShot.captureScreenShot("ELTC_022_SS2");
		
		
		boolean actual = driver.getPageSource().contains("testing");	
		boolean expected = true;
		assertEquals(actual, expected);

	}		
		
}
