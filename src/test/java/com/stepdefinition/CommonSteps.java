package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.baseclasscommon.BaseCommon;
import com.pageobjectmodel.PageObjectManager;

import io.cucumber.java.en.Then;

public class CommonSteps extends BaseCommon {
	PageObjectManager POM=new PageObjectManager();
	@Then("User should verify success message after login {string}")
	public void user_should_verify_success_message_after_login(String expHelloWelcomeMessage) throws InterruptedException {
	
		String actLoginWelcomeMsg = getAttributeValue(POM.getLogin().getGetTxtLoginWelcome());
	   String trim = actLoginWelcomeMsg.trim();
	   Thread.sleep(9000);
	   Assert.assertEquals("Verify after login welcome", expHelloWelcomeMessage, trim);
	    
	
	}
     

	
}
