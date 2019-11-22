package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPOM {
private WebDriver driver; 
	
	public AdminPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="login")
	private WebElement Username; 
	
	public void sendUserName(String Username) {
		this.Username.clear();
		this.Username.sendKeys(Username);
	}
	
	@FindBy(id="password")
	private WebElement password; 
	
	public void sendPassword(String password) {
		this.password.clear();
		this.password.sendKeys(password);
	}
	
	@FindBy(id="form-login_submitAuth")
	private WebElement LoginBtn; 
	
	public void clickLoginBtn() {
		this.LoginBtn.click();
	}
	
	@FindBy(xpath="//a[@title='Homepage']")
	private WebElement HomePage; 
	
	public void clickHomePage() {
		this.HomePage.click();
	}
	
	@FindBy(xpath="//a[text()='Edit profile']")
	private WebElement EditProfile; 
	
	public void clickEditProfile() {
		this.EditProfile.click();
	}
	
	@FindBy(id="profile_password0")
	private WebElement CurrentPass; 
	
	public void sendCurrentPass(String CurrentPass) {
		this.CurrentPass.sendKeys(CurrentPass);
	}
	
	@FindBy(id="password1")
	private WebElement NewPass; 
	
	public void sendNewPass(String NewPass) {
		this.NewPass.sendKeys(NewPass);
	}
	
	@FindBy(id="profile_password2")
	private WebElement CnfrmPass; 
	
	public void sendCnfrmPass(String CnfrmPass) {
		this.CnfrmPass.sendKeys(CnfrmPass);
	}
	
	@FindBy(id="profile_apply_change")
	private WebElement SaveChanges; 
	
	public void clickSaveChanges() {
		this.SaveChanges.click();
	}
	
	@FindBy(xpath="//img[@title='Easy Learning']")
	private WebElement create2;
	
	public void clickcreate2() {
		this.create2.click();
	}
	
}
