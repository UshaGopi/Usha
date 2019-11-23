package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.AdminPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class MediumTC47 {
	private WebDriver driver;
	private String baseUrl;
	private AdminPOM APOM;
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
		driver = DriverFactory.getDriver(DriverNames.FIREFOX); 
		APOM = new AdminPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	
	@Test
	public void AdminCreateCategoryCourse() throws InterruptedException {
		APOM.sendUserName("admin");
		APOM.sendPassword("admin@123");
		APOM.clickLoginBtn();
		APOM.clickcourseCategory();
		APOM.clickaddCategory();
		APOM.sendcatCode("ELW");
		APOM.sendcatName("Easy Learning Ways");
		APOM.clicksubmitCategory();
		APOM.clickadLink();
		APOM.clickcrteCourse();
		APOM.sendcTitle("Quick Capture");
		APOM.sendCode("QC");
		APOM.clickCatDrp();
		APOM.sendCatSearch("Easy Learning Ways");
		APOM.clickELW();
		APOM.sendTeacherDrp("manzoor_test");
		APOM.clickSelectedDrp();
		Thread.sleep(2000);
		APOM.clickSubmitCrteCrse();
		Thread.sleep(2000);
		screenShot.captureScreenShot("screenshots/AdminCat&Course");
	}
	

}
