package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclasscommon.BaseCommon;

public class CancelBooking extends BaseCommon {
	
	public CancelBooking() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="order_id_text")
	private WebElement orderId;
	
	@FindBy(id="search_hotel_id")
	private WebElement orderIdSearch;
	
	@FindBy(xpath="//input[contains(@name,'btn')]")
	private WebElement cancel;
	
	@FindBy(xpath="//label[contains(text(),'					The booking has been cancelled.')]")
	private WebElement txtCancelMsg;
	
	

	public WebElement getTxtCancelMsg() {
		return txtCancelMsg;
	}

	public WebElement getOrderId() {
		return orderId;
	}

	public WebElement getOrderIdSearch() {
		return orderIdSearch;
	}

	public WebElement getCancel() {
		return cancel;
	}

	
	public void cancelBooking(String OrderId) {
		
		type(getOrderId(), OrderId);
		
		click(getOrderIdSearch());
		
		click(getCancel());
		
		
		
	}

	//public String TxtCancelMsg1() {
		//String value11 = getAttributeValue1(txtCancelMsg, "value");
		//return value11;
		
		
	//}

	

}
