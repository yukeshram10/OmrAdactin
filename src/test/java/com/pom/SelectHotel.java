package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclasscommon.BaseCommon;

public class SelectHotel extends BaseCommon {
	
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement btnSelect;
	
	@FindBy(id="continue")
	private WebElement btnContinue;
	
	@FindBy(xpath="//label[contains(text(),'Please Select a Hotel')]")
	private WebElement selectHotelError;
	
	@FindBy(xpath="//td[contains(text(),'Book A Hotel ')]")
	private WebElement bookHotelSuccess;

	public WebElement getSelectHotelError() {
		return selectHotelError;
	}

	public WebElement getBookHotelSuccess() {
		return bookHotelSuccess;
	}

	public WebElement getBtnSelect() {
		return btnSelect;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}
	
	//public void SelectHotel() {
	//	click(getBtnSelect());
	//	click(getBtnContinue());
		
	//}
	
	//public void WithoutSeleacting() {
		
		//click(getBtnContinue());
		
	//}


}
