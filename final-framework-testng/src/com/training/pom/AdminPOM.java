package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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
	
	@FindBy(xpath="//a[@href='course_category.php']")
	private WebElement courseCategory;
	
	public void clickcourseCategory() {
		this.courseCategory.click();
	}
	
	@FindBy(xpath="//img[@title='Add category']")
	private WebElement addCategory;
	
	public void clickaddCategory() {
		this.addCategory.click();
	}
	
	@FindBy(id="course_category_code")
	private WebElement catCode; 
	
	public void sendcatCode(String catCode) {
		this.catCode.sendKeys(catCode);
	}
	
	
	@FindBy(id="course_category_name")
	private WebElement catName; 
	
	public void sendcatName(String catName) {
		this.catName.sendKeys(catName);
	}
	
	@FindBy(id="course_category_submit")
	private WebElement submitCategory;
	
	public void clicksubmitCategory() {
		this.submitCategory.click();
	}
	
	@FindBy(xpath="//a[@title='Administration']")
	private WebElement adLink;
	
	public void clickadLink() {
		this.adLink.click();
	}
	
	@FindBy(xpath="//a[@href='course_add.php']")
	private WebElement crteCourse;
	
	public void clickcrteCourse() {
		this.crteCourse.click();
	}
	
	@FindBy(id="update_course_title")
	private WebElement cTitle; 
	
	public void sendcTitle(String cTitle) {
		this.cTitle.sendKeys(cTitle);
	}
	
	@FindBy(id="visual_code")
	private WebElement Code; 
	
	public void sendCode(String Code) {
		this.Code.sendKeys(Code);
	}
	
	@FindBy(className="filter-option-inner-inner")
	private WebElement CatDrp;
	
	public void clickCatDrp() {
		this.CatDrp.click();
	}
	
	@FindBy(xpath="//input[@aria-label='Search']")
	private WebElement CatSearch; 
	
	public void sendCatSearch(String CatSearch) {
		this.CatSearch.sendKeys(CatSearch);
	}
	
	@FindBy(xpath="//span[text()='Easy Learning Ways (ELW)']")
	private WebElement ELW;
	
	public void clickELW() {
		this.ELW.click();
	}
	
	@FindBy(className="select2-search__field")
	private WebElement TeacherDrp; 
	
	public void sendTeacherDrp(String TeacherDrp) {
		this.TeacherDrp.sendKeys(TeacherDrp);
	}
	
	@FindBy(xpath="//li[text()='manzoor mehadi (manzoor_test)']")
	private WebElement SelDrp; 
	
	public void clickSelectedDrp() {
		this.SelDrp.click();
	}
	
	@FindBy(id="update_course_submit")
	private WebElement CrteCrse; 
	
	public void clickSubmitCrteCrse() {
		this.CrteCrse.click();
	}
	
	@FindBy(xpath="//a[@href='user_add.php']")
	private WebElement addUser; 
	
	public void clickaddUser() {
		this.addUser.click();
	}
	
	@FindBy(id="firstname")
	private WebElement userFName; 
	
	public void senduserFName(String userFName) {
		this.userFName.sendKeys(userFName);
	}
	
	@FindBy(id="lastname")
	private WebElement userLName; 
	
	public void senduserLName(String userLName) {
		this.userLName.sendKeys(userLName);
	}
	
	@FindBy(id="email")
	private WebElement userEmail; 
	
	public void senduserEmail(String userEmail) {
		this.userEmail.sendKeys(userEmail);
	}
	
	@FindBy(id="phone")
	private WebElement userPhn; 
	
	public void senduserPhn(String userPhn) {
		this.userPhn.sendKeys(userPhn);
	}
	
	@FindBy(id="username")
	private WebElement userLoginName; 
	
	public void senduserLoginName(String userLoginName) {
		this.userLoginName.sendKeys(userLoginName);
	}
	
	@FindBy(xpath="//input[@value='0']")
	private WebElement passRadio; 
	
	public void clickpassRadio() {
		this.passRadio.click();
	}
	
	@FindBy(className="filter-option-inner-inner")
	private WebElement profile; 
	
	public void clickprofile() {
		this.profile.click();
	}
	
	@FindBy(xpath="//span[text()='Trainer']")
	private WebElement trainer; 
	
	public void clicktrainer() {
		this.trainer.click();
	}
	
	@FindBy(name="submit")
	private WebElement submit; 
	
	public void clicksubmit() {
		this.submit.click();
	}
	
	@FindBy(xpath="//a[@href='subscribe_user2course.php']")
	private WebElement userToCourse; 
	
	public void clickuserToCourse() {
		this.userToCourse.click();
	}
	
	@FindBy(xpath="//select[@name='firstLetterUser']")
	private WebElement userListdrp; 
	
	public void selectuserListdrp(String H) {
		Select userListdrop = new Select(userListdrp);
		userListdrop.selectByValue(H);
	}
	
	@FindBy(xpath="//select[@name='UserList[]']")
	private WebElement userList; 
	
	public void selectuserListName(String value) {
		Select sel = new Select(userList);
		sel.selectByValue(value);
	}
	
	@FindBy(xpath="//select[@name='CourseList[]']")
	private WebElement courseList; 
	
	public void selectcourseList(String value) {
		Select sele = new Select(courseList);
		sele.selectByValue(value);
	}
	
	@FindBy(xpath="//button[@value='Add to the course(s) >>']")
	private WebElement addToCourse; 
	
	public void clickaddToCourse() {
		this.addToCourse.click();
	}
	
}
