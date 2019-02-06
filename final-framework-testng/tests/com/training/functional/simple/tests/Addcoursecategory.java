package com.training.functional.simple.tests;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.AddcategoryPOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Addcoursecategory {
 
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private AddcategoryPOM addcategoryPOM;
	private static Properties properties;
	private ScreenShot screenShot;

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
		addcategoryPOM = new AddcategoryPOM(driver);
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
	public void addcategory() throws InterruptedException {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		Thread.sleep(2000);
		addcategoryPOM.enteradministration();
		Thread.sleep(2000);
		addcategoryPOM.coursecategorieslink();
		Thread.sleep(1000);
		addcategoryPOM.addcategory();
		addcategoryPOM.catcodeandname();
		screenShot.captureScreenShot("ELTC_024_SS1");
		addcategoryPOM.submitcat();
		Thread.sleep(1000);   
        
        WebElement msg = driver.findElement(By.xpath("//div[@class='alert alert-info']"));
        String ActualText = msg.getText();
        String ExpectedText = "Created";
        assertEquals(ActualText,ExpectedText);
        
        addcategoryPOM.backtocatlist();
        screenShot.captureScreenShot("ELTC_024_SS2");
        Thread.sleep(2000);
	}	
	
}
