package org.unit;


	import java.util.List;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class PersonalAddress extends BaseClass{
	public PersonalAddress() {
	PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//span[@class='a-button-text a-declarative']")
	 private List<WebElement > country;


	@FindBy(id="private List<WebElement > aclogin")
	private WebElement name;

	@FindBy(id="address-ui-widgets-enterAddressPhoneNumber")
	private WebElement number;

	@FindBy(id="address-ui-widgets-enterAddressPostalCode")
	private WebElement code;

	@FindBy(id="address-ui-widgets-enterAddressLine1")
	private WebElement line;

	@FindBy(id="address-ui-widgets-enterAddressLine2")
	private WebElement line2;

	@FindBy(id="address-ui-widgets-landmark")
	private WebElement landmark;

	@FindBy(id="address-ui-widgets-enterAddressCity")
	private WebElement town;

	@FindBy(xpath="(//span[@class='a-button-text a-declarative'])[2]")
	private List<WebElement> state;

	@FindBy(xpath="(//span[@class='a-dropdown-prompt'])[3]")
	private List<WebElement>type;


	@FindBy(id="address-ui-widgets-form-submit-button-announce")
	private WebElement button;


	public SearchContext getCountry() {
	return (SearchContext) country;
	}


	public WebElement getName() {
	return name;
	}


	public WebElement getNumber() {
	return number;
	}


	public WebElement getCode() {
	return code;
	}


	public WebElement getLine() {
	return line;
	}


	public WebElement getLine2() {
	return line2;
	}


	public WebElement getLandmark() {
	return landmark;
	}


	public WebElement getTown() {
	return town;
	}


	public List<WebElement> getState() {
	return state;
	}


	public List<WebElement> getType() {
	return type;
	}


	public WebElement getButton() {
	return button;
	}

	}

