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
import com.training.pom.ElearningPOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ElearningRegisterTC16 {
	private WebDriver driver;
	private String baseUrl;
	//private LoginPOM loginPOM;
	private ElearningPOM EPOM;
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
		EPOM = new ElearningPOM(driver); 
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
	public void teacherRegistration() throws InterruptedException {
		EPOM.clickSignUp();
		EPOM.clickTeacherIcon();
		EPOM.sendFirstName("manzoor");
		EPOM.sendLastName("mehadi");
		EPOM.sendEmail("manzoor@gmail.com");
		EPOM.sendUsername("manzoor_test");
		EPOM.sendPassword("manzoor");
		EPOM.sendconfirmPass("manzoor");
		EPOM.sendPhoneNum("9876543210");
		EPOM.clickRegisterBtn(); 
		Thread.sleep(1000);
		screenShot.captureScreenShot("screenshots/ElearningRegistration");
		EPOM.clickNext();
		Thread.sleep(5000);
		EPOM.clickimageIcon();
		EPOM.clicklogout();
		screenShot.captureScreenShot("screenshots/ElearningTC16");
	}

}

