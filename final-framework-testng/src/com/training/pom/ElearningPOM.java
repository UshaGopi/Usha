package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElearningPOM {
private WebDriver driver; 
	
	public ElearningPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()=' Sign up! ']")
	private WebElement sign_up; 
	
	@FindBy(xpath="//input[@value='1']")
	private WebElement teacher; 
	
	@FindBy(id="registration_firstname")
	private WebElement Fname;
	
	@FindBy(id="registration_lastname")
	private WebElement Lname; 
	
	@FindBy(id="registration_email")
	private WebElement email; 
	
	@FindBy(id="username")
	private WebElement username; 
	
	@FindBy(id="pass1")
	private WebElement password; 
	
	@FindBy(id="pass2")
	private WebElement confirmPass; 
	
	@FindBy(id="registration_phone")
	private WebElement phone; 
	
	@FindBy(id="registration_submit")
	private WebElement submit; 
	
	@FindBy(className="btn")
	private WebElement nextBtn;
	
	@FindBy(className="img-circle")
	private WebElement imageIcon;
	
	@FindBy(id="logout_button")
	private WebElement logout;
	
	public void clickSignUp() {
		this.sign_up.click();
	}
	
	public void clickTeacherIcon() {
		this.teacher.click();
	}
	
	public void sendFirstName(String Fname) {
		this.Fname.clear();
		this.Fname.sendKeys(Fname);
	}
	
	public void sendLastName(String Lname) {
		this.Lname.clear(); 
		this.Lname.sendKeys(Lname); 
	}
	
	public void sendEmail(String email) {
		this.email.clear(); 
		this.email.sendKeys(email); 
	}
	
	public void sendUsername(String username) {
		this.username.clear(); 
		this.username.sendKeys(username); 
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password);  
	}
	
	public void sendconfirmPass(String confirmPass) {
		this.confirmPass.clear(); 
		this.confirmPass.sendKeys(confirmPass); 
	}
	
	public void sendPhoneNum(String phone) {
		this.phone.clear(); 
		this.phone.sendKeys(phone); 
	}
	
	public void clickRegisterBtn() {
		this.submit.click(); 
		
	}
	public void clickNext() {
		this.nextBtn.click(); 
	}

	public void clickimageIcon() {
		this.imageIcon.click(); 
	}
	public void clicklogout() {
		this.logout.click(); 
	}
}
