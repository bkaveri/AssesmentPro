package org.unit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Iphone extends BaseClass{
		public Iphone() {
			PageFactory.initElements(driver, this);
			
			
		}
		
//		@FindBy(xpath="//div[@class='_tetris-creative-desktop_DealBadge_bestDealBadge__2vAnC _tetris-creative-desktop_DealBadge_badge__1xU7i']")
//		private List<WebElement > phn;

		
		@FindBy(id="add-to-cart-button")
		 WebElement cartbutton;

		public WebElement getCartbutton() {
			return cartbutton;
		}

		
		}

