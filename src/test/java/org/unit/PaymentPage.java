package org.unit;


	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class PaymentPage extends BaseClass{
		public PaymentPage() {
			PageFactory.initElements(driver, this);
			
		}
		@FindBy(xpath="//img[@alt='Payment options']")
		WebElement payment;
		
		@FindBy(id="ap_password")
		private WebElement password1;
		
		@FindBy(id="signInSubmit")
		private WebElement submit;

		public WebElement getPayment() {
			return payment;
		}

		public WebElement getPassword1() {
			return password1;
		}

		public WebElement getSubmit() {
			return submit;
		}

		

		
		}

