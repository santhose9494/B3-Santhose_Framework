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
import com.training.pom.AddcoursetouserPOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Addcoursetouser {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private AddcoursetouserPOM addcoursetouserPOM;
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
		addcoursetouserPOM = new AddcoursetouserPOM(driver);
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
	public void addcoursefortheuser() throws InterruptedException {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		Thread.sleep(2000);
		addcoursetouserPOM.enteradministration();
		Thread.sleep(2000);
		addcoursetouserPOM.addcourlink();
		addcoursetouserPOM.selectusers();
		Thread.sleep(1000);
		addcoursetouserPOM.selectcourse();
		screenShot.captureScreenShot("ELTC_023_SS1");
		Thread.sleep(1000);
		addcoursetouserPOM.addtocoursebuttonclick();
		Thread.sleep(1000);
        screenShot.captureScreenShot("ELTC_023_SS2");   
        
        WebElement msg = driver.findElement(By.xpath("//div[@class='alert alert-success']"));
        
        String ActualText = msg.getText();
        String ExpectedText = "The selected users are subscribed to the selected course";
        assertEquals(ActualText,ExpectedText);
        
        if(driver.getPageSource().contains("The selected users are subscribed to the selected course")){
        	System.out.println("Verified Message : The selected users are subscribed to the selected course");
        	}else{
        	System.out.println("Message not exist");
        	}
	}	
}
