//To verify whether application allows admin to get login into application
//To verify whether application allows admin to change the password in Edit Profile page
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

public class ElearnAdminLogin {
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
	public void Admin() throws InterruptedException {
		APOM.sendUserName("admin");
		APOM.sendPassword("admin@1234");
		APOM.clickLoginBtn();	
		screenShot.captureScreenShot("screenshots/AdminLogin");
		APOM.clickHomePage();
		Thread.sleep(2000);
		APOM.clickEditProfile();
		APOM.sendCurrentPass("admin@1234");
		APOM.sendNewPass("admin@123");
		APOM.sendCnfrmPass("admin@123");
		APOM.clickSaveChanges();
		Thread.sleep(2000);
		screenShot.captureScreenShot("screenshots/AdminUpdate");
	}
	
}
