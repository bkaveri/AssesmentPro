package org.unit;

	import java.util.List;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Address extends BaseClass{
		public Address() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//span[@class='nav-line-2 nav-long-width']")
	private List<WebElement > aclogin;
	
	@FindBy(xpath="(//h2[@class='a-spacing-none ya-card__heading--rich a-text-normal'])[4]")
	private List<WebElement>add;
	
	
	@FindBy(id="ya-myab-plus-address-icon")
	private WebElement click;
	
	@FindBy(id="ap_password")
	private WebElement password; 
	
	@FindBy(id="signInSubmit")
	private WebElement btn;

	public WebElement getAclogin() {
		return (WebElement) aclogin;
	}

	public List<WebElement> getAdd() {
		return add;
	}

	public WebElement getClick() {
		return click;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getBtn() {
		return btn;
	}

}
	