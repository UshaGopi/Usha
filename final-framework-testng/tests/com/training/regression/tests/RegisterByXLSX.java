package com.training.regression.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import com.training.dataproviders.LoginDataProviders;
import com.training.dataproviders.RegisterDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.ElearningPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RegisterByXLSX {
	private WebDriver driver;
	private String baseUrl;
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

	@Test(dataProvider = "xls-inputs", dataProviderClass = RegisterDataProviders.class)
	public void RegisterDBTest(String FieldsName, String Fname, String Lname, String email, String username, String password, String confirmPass,
            String phone) throws InterruptedException {
		EPOM.clickSignUp();
		EPOM.clickTeacherIcon();
		EPOM.sendFirstName(Fname);
		EPOM.sendLastName(Lname);
		EPOM.sendEmail(email);
		EPOM.sendUsername(username);
		EPOM.sendPassword(password);
		EPOM.sendconfirmPass(confirmPass);
		EPOM.sendPhoneNum(phone);
		EPOM.clickRegisterBtn(); 
		Thread.sleep(1000);
		screenShot.captureScreenShot("screenshots/MultiReg");

	}
	


}
