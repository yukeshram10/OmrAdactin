package com.stepdefinition;

import org.junit.Assert;

import com.baseclasscommon.BaseCommon;
import com.pageobjectmodel.PageObjectManager;
import com.pom.CancelBooking;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC5_CancelBookingStep extends BaseCommon {
	
	PageObjectManager POM=new PageObjectManager();
	
		
	@When("User should cancel the order id")
	public void user_should_cancel_the_order_id() {
	    String OrderID = getAttributeValue1(POM.getBookingConfirmation().getOrdernum(),"value");
	    POM.getBookingConfirmation().getBooked().click();
	    POM.getCancelBooking().cancelBooking(OrderID);
	    alert();
	    
	}

	@When("User should cancel the existing order id {string}")
	public void user_should_cancel_the_existing_order_id(String cancelExstingOrderId) {
		
		POM.getBookingConfirmation().getBooked().click();
		POM.getCancelBooking().cancelBooking(cancelExstingOrderId);
		alert();
	    
	}
	
	@Then("User should verify the cancel message after cancelling the order id in booking iteration page {string}")
	public void user_should_verify_the_cancel_message_after_cancelling_the_order_id_in_booking_iteration_page(String expTxtCancelMessage) throws InterruptedException {
		
		String actTxtCancelMessage = getText(POM.getCancelBooking().getTxtCancelMsg());
		

		Assert.assertEquals("Verify success message for cancel booking", expTxtCancelMessage, actTxtCancelMessage);
	    
	}
	
	

}
