package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoursePOM {
private WebDriver driver; 
	
	public CoursePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Create a course']")
	private WebElement CreateCourse;
	
	public void clickCreateCourse() {
		this.CreateCourse.click();
	}
	
	@FindBy(id="title")
	private WebElement CrseName;
	
	public void sendCrseName(String CrseName) {
		this.CrseName.sendKeys(CrseName);
	}
	
	@FindBy(id="add_course_submit")
	private WebElement AddCourse;
	
	public void clickAddCourse() {
		this.AddCourse.click();
	}
	
	@FindBy(xpath="//img[@title='Projects']")
	private WebElement addPrjcts;
	
	public void clickaddPrjcts() {
		this.addPrjcts.click();
	}
	
	@FindBy(xpath="//img[@title='Create a new project']")
	private WebElement C_NewPrjcts;
	
	public void clickC_NewPrjcts() {
		this.C_NewPrjcts.click();
	}
	
	@FindBy(id="add_blog_blog_name")
	private WebElement GiveTitle;
	
	public void sendGiveTitle(String GiveTitle) {
		this.GiveTitle.sendKeys(GiveTitle);
	}
	
	@FindBy(id="add_blog_blog_subtitle")
	private WebElement SubTitle;
	
	public void sendSubTitle(String SubTitle) {
		this.SubTitle.sendKeys(SubTitle);
	}
	
	@FindBy(id="add_blog_submit")
	private WebElement SaveBlog;
	
	public void clickSaveBlog() {
		this.SaveBlog.click();
	}
	
	@FindBy(xpath="//img[@title='Out of Box']")
	private WebElement OutofBox;
	
	public void clickOutofBox() {
		this.OutofBox.click();
	}
	
	@FindBy(xpath="//img[@title='Unique']")
	private WebElement Unique;
	
	public void clickUnique() {
		this.Unique.click();
	}
	
	@FindBy(xpath="//img[@title='New task']")
	private WebElement NewTask;
	
	public void clickNewTask() {
		this.NewTask.click();
	}
	
	@FindBy(id="add_post_title")
	private WebElement postTitle;
	
	public void sendpostTitle(String postTitle) {
		this.postTitle.sendKeys(postTitle);
	}
	
	@FindBy(id="add_post_save")
	private WebElement postSave;
	
	public void clickpostSave() {
		this.postSave.click();
	}
	
	@FindBy(xpath="//a[text()='Course catalog']")
	private WebElement catalog;
	
	public void clickcatalog() {
		this.catalog.click();
	}
	
	@FindBy(name="search_term")
	private WebElement search;
	
	public void sendsearch(String search) {
		this.search.sendKeys(search);
	}
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement srchBtn;
	
	public void clicksrchBtn() {
		this.srchBtn.click();
	}
	
	@FindBy(xpath="//a[@title='Subscribe']")
	private WebElement Subscribe;
	
	public void clickSubscribe() {
		this.Subscribe.click();
	}
	
	
	@FindBy(xpath="//a[@title='My courses']")
	private WebElement MyCrse;
	
	public void clickMyCourse() {
		this.MyCrse.click();
	}
	
	@FindBy(xpath="//img[@title='Out of Box']")
	private WebElement Obox;
	
	public void clickObox() {
		this.Obox.click();
	}
	
	@FindBy(xpath="//img[@title='Unique']")
	private WebElement Uimg;
	
	public void clickUimg() {
		this.Uimg.click();
	}
	
	@FindBy(xpath="//a[@title='New Task Assigned']")
	private WebElement Ntask;
	
	public void clickNtask() {
		this.Ntask.click();
	}
}
