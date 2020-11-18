package org.unit;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.agent.builder.AgentBuilder.LambdaInstrumentationStrategy;

public class SearchPage extends BaseClass{
	public SearchPage() {
		PageFactory.initElements(driver, this);	}
	@FindBy(id="twotabsearchtextbox")
	private WebElement srch;
	
	@FindBy(xpath="(//input[@class='nav-input'])[2]")
	List<WebElement> button;

	public WebElement getSrch() {
		return srch;
	}

	public WebElement getButton() {
		return (WebElement) button;
	}

}