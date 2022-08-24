package com.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclasscommon.BaseCommon;

public class Login extends BaseCommon {

	public Login() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//b[contains(text(),'Invalid Login details or Your Password might have expired.')]")
	private WebElement containErrorMsg;
	
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement txtUserName;
	
    @FindBy(xpath="//input[@id='password']")
    private WebElement txtPassword;

	@FindBy(xpath="//input[@id='login']")
	private WebElement btnClick;
	
	@FindBy(id="username_show")
	private WebElement getTxtLoginWelcome;
	
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnClick() {
		return btnClick;
	}

	public WebElement getGetTxtLoginWelcome() {
		return getTxtLoginWelcome;
	}

	public WebElement getContainErrorMsg() {
		return containErrorMsg;
	}
	

	
	
	public void login(String UserName, String PassWord) {
		type(getTxtUserName(), UserName);
		type(getTxtPassword(), PassWord);
		click(getBtnClick());
	
	    
	}
	
		
	public void loginWithEnter(String UserName, String PassWord) throws AWTException  {
        type(getTxtUserName(), UserName);
		
		type(getTxtPassword(), PassWord);
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}


	


	

	
	
	


}
