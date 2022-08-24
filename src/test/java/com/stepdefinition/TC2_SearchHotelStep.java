package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.baseclasscommon.BaseCommon;
import com.google.auto.common.GeneratedAnnotations;
import com.pageobjectmodel.PageObjectManager;

import io.cucumber.java.en.*;

public class TC2_SearchHotelStep extends BaseCommon {
	PageObjectManager POM=new PageObjectManager();
	@When("User should search the hotel with valid data {string},{string},{string},{string} {string},{string},{string} and {string}")
	public void user_should_search_the_hotel_with_valid_data_and(String location, String Hotel, String roomType, String numRooms, String dateIn, String dateOut, String adultsPerRoom, String childPerRoom) {
	    POM.getSearchHotel().searchHotel(location, Hotel, roomType, numRooms, dateIn, dateOut, adultsPerRoom, childPerRoom);
	}
	
	@When("User should search the hotel with valid data only in mandatory fields {string},{string} {string},{string} and {string}")
	public void user_should_search_the_hotel_with_valid_data_only_in_mandatory_fields_and(String location, String numRooms, String dateIn, String dateOut, String adultsPerRoom) {
	 POM.getSearchHotel().searchHotelMandatory(location, numRooms, dateIn, dateIn, adultsPerRoom);   
	}

	
	@When("User should search the hotel with invalid data {string},{string},{string},{string} {string},{string},{string} and {string}")
	public void user_should_search_the_hotel_with_invalid_data_and(String location, String Hotel, String roomType, String numRooms, String dateIn, String dateOut, String adultsPerRoom, String childPerRoom) {
	    POM.getSearchHotel().searchHotel(location, Hotel, roomType, numRooms, dateIn, dateOut, adultsPerRoom, childPerRoom);
	}
	
	
	@When("User should click search in search hotel page without selecting any fields")
	public void user_should_click_search_in_search_hotel_page_without_selecting_any_fields() {
	    POM.getSearchHotel().getBtnSearch().click();
	}
	
	@Then("After search hotel user should verify the successful message in select hotel page {string}")
	public void after_search_hotel_user_should_verify_the_successful_message_in_select_hotel_page(String successMsgSelectHotel) {
	    String actsuccessMsgSelectHotel = getText(POM.getSearchHotel().getSuccesMsg1());
	    String trim = actsuccessMsgSelectHotel.trim();
	    Assert.assertEquals("Verify success message after select hotel", successMsgSelectHotel, trim);
	}

	
	
	@Then("User should verify the date error msg in search hotel page date field {string},{string} after click the search in search hotel page")
	public void user_should_verify_the_date_error_msg_in_search_hotel_page_date_field_after_click_the_search_in_search_hotel_page(String expDateinError, String expDateOutError) {
	    String dateinError = getText(POM.getSearchHotel().getDateinError1());
	    Assert.assertEquals("Verify error message in date in", expDateinError, dateinError);
	    
	    String dataOutError = getText(POM.getSearchHotel().getDataOutError1());
	    Assert.assertEquals("Verify error message in date out", expDateOutError, dataOutError);
	}
	
	@Then("User should verify the location error msg in search hotel page location field {string} after clicking search")
	public void user_should_verify_the_location_error_msg_in_search_hotel_page_location_field_after_clicking_search(String expLocationError) {
	    String actLocationError = getText(POM.getSearchHotel().getLocationError1());
	    Assert.assertEquals("Verify location error after search hotel", expLocationError, actLocationError);
	}
	
}
