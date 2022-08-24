package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclasscommon.BaseCommon;

public class BookHotel extends BaseCommon{
	
	public BookHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	private WebElement txtFirstName;
	
	@FindBy(id="last_name")
	private WebElement txtlastName;
	
	@FindBy(id="address")
	private WebElement txtaddress;
	
	@FindBy(id="cc_num")
	private WebElement txtCCno;
	
	@FindBy(id="cc_type")
	private WebElement txtCCtype;
	
	@FindBy(id="cc_exp_month")
	private WebElement txtCCexp;
	
	@FindBy(id="cc_exp_year")
	private WebElement txtcCExpYp;
	
	@FindBy(id="cc_cvv")
	private WebElement txtcVV;
	
	@FindBy(id="book_now")
	private WebElement btnbookNow;
	
	@FindBy(xpath="//td[contains(text(),'Booking Confirmation ')]")
	private WebElement txtBookinConfirmation;
	
	@FindBy(xpath="//label[contains(text(),'Please Enter your First Name')]")
	private WebElement txtErrorFirstName;
	
	@FindBy(xpath="//label[contains(text(),'Please Enter you Last Name')]")
	private WebElement txtErrorLastName;
	
	@FindBy(xpath="//label[contains(text(),'Please Enter your Address')]")
	private WebElement txtErrorAddress;
	
	@FindBy(xpath="//label[contains(text(),'Please Enter your 16 Digit Credit Card Number')]")
	private WebElement txtErrorCCnum;
	
	@FindBy(xpath="//label[contains(text(),'Please Select your Credit Card Type')]")
	private WebElement txtErrorCCtype;
	
	@FindBy(xpath="//label[contains(text(),'Please Select your Credit Card Expiry Month')]")
	private WebElement txtErrorCCExpMonth;
	
	@FindBy(xpath="//label[contains(text(),'Please Enter your Credit Card CVV Number')]")
	private WebElement txtErrorCVVNum;
	

	
	
	
	
	
	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtBookinConfirmation() {
		
		
		return txtBookinConfirmation;
	}

	public WebElement getTxtErrorFirstName() {
		return txtErrorFirstName;
	}

	public WebElement getTxtErrorLastName() {
		return txtErrorLastName;
	}

	public WebElement getTxtErrorAddress() {
		return txtErrorAddress;
	}

	public WebElement getTxtErrorCCnum() {
		return txtErrorCCnum;
	}

	public WebElement getTxtErrorCCtype() {
		return txtErrorCCtype;
	}

	public WebElement getTxtErrorCCExpMonth() {
		return txtErrorCCExpMonth;
	}

	public WebElement getTxtErrorCVVNum() {
		return txtErrorCVVNum;
	}

	public WebElement getTxtlastName() {
		return txtlastName;
	}

	public WebElement getTxtaddress() {
		return txtaddress;
	}

	public WebElement getTxtCCno() {
		return txtCCno;
	}

	public WebElement getTxtCCtype() {
		return txtCCtype;
	}

	public WebElement getTxtCCexp() {
		return txtCCexp;
	}

	public WebElement getTxtcCExpYp() {
		return txtcCExpYp;
	}

	public WebElement getTxtcVV() {
		return txtcVV;
	}

	public WebElement getBtnbookNow() {
		return btnbookNow;
	}
	
	public void bookHotel(String firstName, String lastName, String address) {
		type(getTxtFirstName(), firstName);
		
		type(getTxtlastName(), lastName);
		
		type(getTxtaddress(), address);
		
	//	type(getTxtCCno(), CCno);
		
		//type(getTxtCCtype(), CCtype);
		
		//type(getTxtCCexp(), CCexp);
		
		//type(getTxtcCExpYp(), cCExpY);
		
		//type(getTxtcVV(), CVV);
		
		//click(getBtnbookNow());
		
		
		
		
	}
    
	public void bookHotelWithoutSelecting() {
		
		click(getBtnbookNow());
		
		
		
		
	}
	
	public String BookingConfirm() {
		return getText(getTxtBookinConfirmation());
		
		
	}
	
	

}
