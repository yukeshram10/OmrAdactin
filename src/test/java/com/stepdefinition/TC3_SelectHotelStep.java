package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.baseclasscommon.BaseCommon;
import com.pageobjectmodel.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC3_SelectHotelStep extends BaseCommon {

	PageObjectManager POM=new PageObjectManager();
	@When("User should select hotel in select hotel page")
	public void user_should_select_hotel_in_select_hotel_page() {
	    POM.getSelectHotel().getBtnSelect().click();
	   // btnSelect.click();
	    POM.getSelectHotel().getBtnContinue().click();
		
	}
	
	PageObjectManager POM1=new PageObjectManager();
	
	@When("User should click continue without selecting a hotel in select hotel page")
	public void user_should_click_continue_without_selecting_a_hotel_in_select_hotel_page() {
	    POM1.getSelectHotel().getBtnContinue().click();
		
	}
	
	@Then("User should verify the successful message after select hotel {string}")
	public void user_should_verify_the_successful_message_after_select_hotel(String expBookHotelSuccessMsg) {
	    String actBookHotelSuccessMsg = getText(POM.getSelectHotel().getBookHotelSuccess());
	    Assert.assertEquals("Verify success message after select hotel", expBookHotelSuccessMsg, actBookHotelSuccessMsg);
	}

	
	
	@Then("User should verify the select error message after clicking continue {string}")
	public void user_should_verify_the_select_error_message_after_clicking_continue(String expSelectHotelErrorMsg) {
	    String actSelectHotelErrorMsg = getText(POM.getSelectHotel().getSelectHotelError());
	    Assert.assertEquals("Verify error message without seleceting hotel", expSelectHotelErrorMsg, actSelectHotelErrorMsg);
		
	}
	
}
