package com.stepdefinition;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;

import com.baseclasscommon.BaseCommon;
import com.pageobjectmodel.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC1_LoginStep extends BaseCommon {
	PageObjectManager POM=new PageObjectManager();
	@Given("User is on the AdactinHotel page")
	public void user_is_on_the_adactin_hotel_page() throws FileNotFoundException, IOException {
		getDriver(getPropertyValue("browser"));
		loadUrl(getPropertyValue("url"));
		maximize();
	    
	}
	
	@When("User should login with valid data {string} and {string}")
	public void user_should_login_with_valid_data_and(String userName, String passWord) {
	    POM.getLogin().login(userName, passWord);
	    
	}
	
	@When("User should login with valid data {string} and {string} using Enter")
	public void user_should_login_with_valid_data_and_using_enter(String userName, String passWord) throws AWTException {
		POM.getLogin().login(userName, passWord);

		
	}
	
	@When("User should login with invalid Data {string} and {string}")
	public void user_should_login_with_invalid_data_and(String userName, String passWord) {
		POM.getLogin().login(userName, passWord);
	}
	
	@Then("User should verify the login error messages after clicking login {string}")
	public void user_should_verify_the_login_error_messages_after_clicking_login(String expInValidLoginError) {
	String attributeValue = getText(POM.getLogin().getContainErrorMsg());
	//String actTxtErrorMsg = attributeValue.trim();
	Assert.assertNotEquals("Verify after login InValid Error msg", expInValidLoginError, attributeValue);
	
	}
	
}
