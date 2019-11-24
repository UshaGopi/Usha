//TO verify whether application allows admin to create an user & register user to the course

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

public class MediumTC48 {
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
	public void AdminAddUser() throws InterruptedException {
		APOM.sendUserName("admin");
		APOM.sendPassword("admin@123");
		APOM.clickLoginBtn();
		APOM.clickaddUser();
		APOM.senduserFName("Oliva");
		APOM.senduserLName("Henderson");
		APOM.senduserEmail("oliva@gmail.com");
		APOM.senduserPhn("9876543210");
		APOM.senduserLoginName("Oliva");
		APOM.clickpassRadio();
		APOM.sendPassword("oliva1234");
		APOM.clickprofile();
		APOM.clicktrainer();
		APOM.clicksubmit();
		APOM.clickadLink();
		APOM.clickuserToCourse();
		APOM.selectuserListdrp("H");
		APOM.selectuserListName("411");
		APOM.selectcourseList("OUTBOX");
		Thread.sleep(1000);
		APOM.clickaddToCourse();
		Thread.sleep(2000);
		screenShot.captureScreenShot("screenshots/AdminAddUserToCourse");
		
	}

}
