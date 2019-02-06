package com.training.functional.simple.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.DeletecourselistPOM;
import com.training.pom.EntercourselistPOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Deletecourse {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private EntercourselistPOM entercourselistPOM;
	private DeletecourselistPOM deletecourselistPOM;

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
		entercourselistPOM = new EntercourselistPOM(driver);
		deletecourselistPOM = new DeletecourselistPOM(driver);
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
	public void deletecourselist() throws InterruptedException {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		Thread.sleep(3000);
		entercourselistPOM.clickcourselist();
		screenShot.captureScreenShot("ELTC_021_SS1");
		deletecourselistPOM.deletecourse();
		screenShot.captureScreenShot("ELTC_021_SS2");    	
		
		  if(driver.getPageSource().contains("11test")){
	        	System.out.println("Course is not removed properly");
	        	}else{
	        	System.out.println("Course removed successfully from the course list");
	        	}
		
	}	
}
