package com.stepdef;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	WebDriver driver;
	@Given("User is on the AdactinHotel page")
	public void user_is_on_the_adactin_hotel_page() {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}
	
	@When("User should login with valid data {string} and {string}")
	public void user_should_login_with_valid_data_and(String UserName, String Password) {
		WebElement txtUserName = driver.findElement(By.xpath("//input[@id='username']"));
		txtUserName.sendKeys(UserName);
		
		WebElement txtpassword = driver.findElement(By.xpath("//input[@id='password']"));
		txtpassword.sendKeys(Password);
		
		WebElement btnLogin = driver.findElement(By.xpath("//input[@id='login']"));
		btnLogin.click();
	 
	}

	
	@When("User should login {string} and {string} using Enter")
	public void user_should_login_and_using_enter(String User, String Pass) throws AWTException {
		WebElement txtUserName = driver.findElement(By.xpath("//input[@id='username']"));
		txtUserName.sendKeys(User);
		
		WebElement txtpassword = driver.findElement(By.xpath("//input[@id='password']"));
		txtpassword.sendKeys(Pass);
		
		//WebElement btnLogin = driver.findElement(By.xpath("//input[@id='login']"));
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	@When("User should login with Invalid Data {string} and {string}")
	public void user_should_login_with_invalid_data_and(String UserN, String PassW) {
		WebElement txtUserName = driver.findElement(By.xpath("//input[@id='username']"));
		txtUserName.sendKeys(UserN);
		
		WebElement txtpassword = driver.findElement(By.xpath("//input[@id='password']"));
		txtpassword.sendKeys(PassW);
		
		WebElement btnLogin = driver.findElement(By.xpath("//input[@id='login']"));
		btnLogin.click();

	}

	@Then("User should verify success message after login {string}")
	public void user_should_verify_success_message_after_login(String Verify) {
		WebElement contain = driver.findElement(By.xpath("//b[text()='Invalid Login details or Your Password might have expired. ']"));
	    boolean equals = contain.equals(Verify);
	    System.out.println(equals);
	}
	
	

}
