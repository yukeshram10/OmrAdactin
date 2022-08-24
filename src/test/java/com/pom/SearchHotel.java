package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclasscommon.BaseCommon;

public class SearchHotel extends BaseCommon {
	
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username_show")
	private WebElement txtLoginWelcome;
	
	@FindBy(xpath="//select[@id='location']")
	private WebElement location;	
	
	@FindBy(id="hotels")
	private WebElement Hotels;
	
    @FindBy(xpath="//select[@id='room_type']")
    private WebElement roomType;

    @FindBy(id="room_nos")
	private WebElement numOfRooms;
	
    @FindBy(xpath="//input[@id='datepick_in']")
	private WebElement dateIn;
	
    @FindBy(xpath="//input[@id='datepick_out']")
	private WebElement dateOut;
    
    @FindBy(id="adult_room")
   	private WebElement adultPerRoom;
       
    @FindBy(xpath="//select[@id='child_room']")
   	private WebElement childPerRoom;
       
    @FindBy(id="Submit")
   	private WebElement btnSearch;
    
    @FindBy(xpath="//td[contains(text(),'Select Hotel ')]")
    private WebElement succesMsg;
    
    @FindBy(xpath="//span[contains(text(),'Check-In Date shall be before than Check-Out Date')]")
    private WebElement dateinError;
     
    @FindBy(xpath="//span[contains(text(),'Check-Out Date shall be after than Check-In Date')]")
    private WebElement dataOutError;
    
    @FindBy(xpath="//span[contains(text(),'Please Select a Location')]")
    private WebElement locationError;

	public WebElement getSuccesMsg1() {
		return succesMsg;
	}

	public WebElement getDateinError1() {
		return dateinError;
	}

	public WebElement getDataOutError1() {
		return dataOutError;
	}

	public WebElement getLocationError1() {
		return locationError;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return Hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNumOfRooms() {
		return numOfRooms;
	}

	public WebElement getDateIn() {
		return dateIn;
	}

	public WebElement getDateOut() {
		return dateOut;
	}

	public WebElement getAdultPerRoom() {
		return adultPerRoom;
	}

	public WebElement getChildPerRoom() {
		return childPerRoom;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}
	
	public WebElement getTxtLoginWelcome() {
		return txtLoginWelcome;
	}
    
	public void searchHotel(String Location, String hotels, String RoomType, String NumOfRooms, 
			String DateIn, String DateOut, String AdultsPerRoom, String ChildPerRoom) {
		
		selectOptionByText(getLocation(), Location);
		
		selectOptionByText(getHotels(),hotels );
		
		selectOptionByText(getRoomType(), RoomType);
		
		selectOptionByText(getNumOfRooms(), NumOfRooms);
		
		type(getDateIn(), DateIn);
		
	    type(getDateOut(), DateOut);
		
		selectOptionByText(getAdultPerRoom(), AdultsPerRoom);
		
		selectOptionByText(getChildPerRoom(), ChildPerRoom);
		
		click(getBtnSearch());

	}
	
	public void searchHotelMandatory(String Location, String NumOfRooms, 
			String DateIn, String DateOut, String AdultsPerRoom) {
		
		selectOptionByText(getLocation(), Location);
	
		selectOptionByText(getNumOfRooms(), NumOfRooms);
		
		type(getDateIn(), DateIn);
		
	    type(getDateOut(), DateOut);
		
		selectOptionByText(getAdultPerRoom(), AdultsPerRoom);
	
		click(getBtnSearch());

	}

	

}
