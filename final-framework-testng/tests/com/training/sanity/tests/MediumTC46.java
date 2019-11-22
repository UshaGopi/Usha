//To verify whether application allows student to comment on the task assigned in the project
package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.AdminPOM;
import com.training.pom.CoursePOM;
import com.training.pom.ElearningPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class MediumTC46 {
	private WebDriver driver;
	private String baseUrl;
	//private LoginPOM loginPOM;
	private ElearningPOM EPOM;
	private AdminPOM APOM;
	private CoursePOM CPOM;
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
		APOM= new AdminPOM(driver);
		CPOM = new CoursePOM(driver);
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
	
	@Test(enabled= false)
	public void studentRegistration() throws InterruptedException {
		EPOM.clickSignUp();
		EPOM.sendFirstName("student");
		EPOM.sendLastName("test");
		EPOM.sendEmail("student.test@gmail.com");
		EPOM.sendUsername("student_test");
		EPOM.sendPassword("student");
		EPOM.sendconfirmPass("student");
		EPOM.sendPhoneNum("9876543210");
		EPOM.clickRegisterBtn(); 
		Thread.sleep(1000);
		screenShot.captureScreenShot("screenshots/StudRegister");
		
		}
	
	@Test(enabled=true)
	public void teacherPrjctCreation() throws InterruptedException {
		APOM.sendUserName("manzoor_test");
		APOM.sendPassword("manzoor");
		APOM.clickLoginBtn();
		Thread.sleep(3000);
		CPOM.clickCreateCourse();
		CPOM.sendCrseName("Out of Box");
		CPOM.clickAddCourse();
		Thread.sleep(1000);
		CPOM.clickaddPrjcts();
		CPOM.clickC_NewPrjcts();
		CPOM.sendGiveTitle("Unique");
		CPOM.sendSubTitle("Different Ideas");
		CPOM.clickSaveBlog();
		CPOM.clickMyCourse();
		CPOM.clickOutofBox();
		CPOM.clickUnique();
		CPOM.clickNewTask();
		CPOM.sendpostTitle("New Task Assigned");
		CPOM.clickpostSave();
		
		
	}
	
	@Test (dependsOnMethods= {"teacherPrjctCreation"})
	public void studComment() throws InterruptedException {
		APOM.sendUserName("student_test");
		APOM.sendPassword("student");
		APOM.clickLoginBtn();
		Thread.sleep(3000);
		CPOM.clickcatalog();
		CPOM.sendsearch("out");
		CPOM.clicksrchBtn();
		CPOM.clickSubscribe();
		CPOM.clickMyCourse();
		CPOM.clickObox();
		CPOM.clickUimg();
		CPOM.clickNtask();
		screenShot.captureScreenShot("screenshots/StudComment");
		Reporter.log("Comment Section is not Found");
		
		
	}


}
