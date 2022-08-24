package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.baseclasscommon.BaseCommon;
import com.pageobjectmodel.PageObjectManager;

import io.cucumber.java.en.*;

public class TC4_BookHotelStep extends BaseCommon {
	PageObjectManager POM=new PageObjectManager();
	@When("User should book a hotel with valid data {string}, {string} and {string}")
	public void user_should_book_a_hotel_with_valid_data_and(String string, String string2, String string3, io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		
	    POM.getBookHotel().bookHotel(string, string2, string3);
		
		List<Map<String,String>> asMaps = dataTable.asMaps();
		
		type(POM.getBookHotel().getTxtCCno(), asMaps.get(0).get("creditCardNo"));
		type(POM.getBookHotel().getTxtCCtype(), asMaps.get(0).get("creditCardtype"));
		type(POM.getBookHotel().getTxtCCexp(), asMaps.get(0).get("expiryDate"));
		type(POM.getBookHotel().getTxtcCExpYp(), asMaps.get(0).get("expiryYear"));
		type(POM.getBookHotel().getTxtcVV(), asMaps.get(0).get("cvvNo"));
		
		POM.getBookHotel().getBtnbookNow().click();
		Thread.sleep(10000);
		
		
	    
	}

	PageObjectManager POM1=new PageObjectManager();
	@When("User should book without selecting any fields in book a hotel page")
	public void user_should_book_without_selecting_any_fields_in_book_a_hotel_page() {
		
		POM.getBookHotel().getBtnbookNow().click();

	    
	}
	

	@Then("User should verify the successful message after booking a hotel {string}")
	public void user_should_verify_the_successful_message_after_booking_a_hotel(String expBookingConfirmatonMsg) throws InterruptedException {
		   
		    String actBookingConfirmatonMsg = getText(POM.getBookHotel().getTxtBookinConfirmation());
		    
			Assert.assertEquals("Verify success message BookingConfirmaton in BookingConfirmaton page", expBookingConfirmatonMsg, actBookingConfirmatonMsg);
			
		}
	
	@Then("User should verify the seven error message after booking in book a hotel page {string},{string}, {string}, {string}, {string}, {string} and {string}")
	public void user_should_verify_the_seven_error_message_after_booking_in_book_a_hotel_page_and(String expFirstNameErrorMsg, String expLastNameErrorMsg, String expAddressErrorMsg, String expCCNumErrorMsg, String expCCTypeErrorMsg, String expCCExpMonthErrorMsg, String expCVVNumErrorMsg) {
	   
		String actFirstNameErrorMsg = getText(POM.getBookHotel().getTxtErrorFirstName());
		Assert.assertEquals("Verify error message FirstName in Book hotel page", expFirstNameErrorMsg, actFirstNameErrorMsg);
		
		String actLastNameErrorMsg = getText(POM.getBookHotel().getTxtErrorLastName());
		Assert.assertEquals("Verify error message LastName in Book hotel page", expLastNameErrorMsg, actLastNameErrorMsg);
		
		String actAddressErrorMsg = getText(POM.getBookHotel().getTxtErrorAddress());
		Assert.assertEquals("Verify error message Address in Book hotel page", expAddressErrorMsg, actAddressErrorMsg);
		
		String actCCNumErrorMsg = getText(POM.getBookHotel().getTxtErrorCCnum());
		Assert.assertEquals("Verify error message CCNum in Book hotel page", expCCNumErrorMsg, actCCNumErrorMsg);
		
		String actCCTypeErrorMsg = getText(POM.getBookHotel().getTxtErrorCCtype());
		Assert.assertEquals("Verify error message CCType in Book hotel page", expCCTypeErrorMsg, actCCTypeErrorMsg);
		
		String actCCExpMonthErrorMsg = getText(POM.getBookHotel().getTxtErrorCCExpMonth());
		Assert.assertEquals("Verify error message CCExpMonth in Book hotel page", expCCExpMonthErrorMsg, actCCExpMonthErrorMsg);
		
		String actCVVNumErrorMsg = getText(POM.getBookHotel().getTxtErrorCVVNum());
		Assert.assertEquals("Verify error message CVVNumError in Book hotel page", expCVVNumErrorMsg, actCVVNumErrorMsg);
		
		
	}
	

}
