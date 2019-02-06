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
import com.training.pom.LoginPOM;
import com.training.pom.ModifydetailsofuserPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Modifydetailsofuser {
	
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private ModifydetailsofuserPOM modifydetailsofuserPOM;
  
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
		modifydetailsofuserPOM = new ModifydetailsofuserPOM(driver);
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
	public void modifyuserdetails() throws InterruptedException {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		Thread.sleep(3000);
		modifydetailsofuserPOM.enteruserlist();
		screenShot.captureScreenShot("ELTC_051_SS1");
		modifydetailsofuserPOM.searchboxentry();
		screenShot.captureScreenShot("ELTC_051_SS2");
		Thread.sleep(2000);
		modifydetailsofuserPOM.edituser();
		screenShot.captureScreenShot("ELTC_051_SS3");
		Thread.sleep(2000);
		modifydetailsofuserPOM.editmailbox();
		screenShot.captureScreenShot("ELTC_051_SS4");
		Thread.sleep(2000);
		modifydetailsofuserPOM.inactaccount();
		screenShot.captureScreenShot("ELTC_051_SS5");
		Thread.sleep(2000);
		modifydetailsofuserPOM.savedetails();
		screenShot.captureScreenShot("ELTC_051_SS6");
		
		
		
		  if(driver.getPageSource().contains("User updated")){
	        	String Actual = "User updated";
	        	String Expected = "User updated";
	        	assertEquals(Actual, Expected);
	        	}	
		
	}	
	
}
