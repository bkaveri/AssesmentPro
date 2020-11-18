package org.unit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart extends BaseClass {
public Cart() {	
	
PageFactory.initElements(driver, this);}
@FindBy(id="nav-cart-count")
private WebElement cartbtn;

@FindBy(xpath="(//input[@class='a-color-link'])[1]")
private WebElement delete;

public WebElement getCartbtn() {
return cartbtn;
}

public WebElement getDelete() {
return delete;
}


}