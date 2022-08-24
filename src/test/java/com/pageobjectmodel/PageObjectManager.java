package com.pageobjectmodel;

import com.pom.*;

public class PageObjectManager {
	private Login login;
	private SearchHotel searchHotel;
	private SelectHotel selectHotel;
	private BookHotel bookHotel;
	private BookingConfirmation bookingConfirmation;
	private CancelBooking cancelBooking;
	public Login getLogin() {
		return (login==null)?login=new Login():login;
	}
	public SearchHotel getSearchHotel() {
		return (searchHotel==null)?searchHotel=new SearchHotel():searchHotel;
	}
	public SelectHotel getSelectHotel() {
		return (selectHotel==null)?selectHotel=new SelectHotel():selectHotel;	
		}
	public BookHotel getBookHotel() {
		return (bookHotel==null)?bookHotel=new BookHotel():bookHotel;
	}
	public BookingConfirmation getBookingConfirmation() {
		return (bookingConfirmation==null)?bookingConfirmation=new BookingConfirmation():bookingConfirmation;
	}
	public CancelBooking getCancelBooking() {
		return (cancelBooking==null)?cancelBooking=new CancelBooking():cancelBooking;
	}
	

}
