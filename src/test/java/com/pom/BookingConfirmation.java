package com.pom;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclasscommon.BaseCommon;

public class BookingConfirmation extends BaseCommon {
	
	public BookingConfirmation() {
		PageFactory.initElements(driver, this);
	}
	
		@FindBy(id="order_no")
		private WebElement ordernum;    
    
		@FindBy(xpath="//a[text()='Booked Itinerary']")
		private WebElement Booked;

		public WebElement getOrdernum() {
			return ordernum;
		}

		public WebElement getBooked() {
			return Booked;
		}    
        
		


}
