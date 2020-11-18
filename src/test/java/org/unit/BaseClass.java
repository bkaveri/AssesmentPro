package org.unit;



import java.util.List;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
static WebDriver  driver;
public static void launch(String s) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\AssesmentPro\\Div\\chromedriver.exe");
	driver=new ChromeDriver();
driver.get(s);
}

public  static void type(SearchContext webElement,String s) {
	((WebElement) webElement).sendKeys(s);
}

public  void tap(WebElement webElement) {
	((WebElement) webElement).click();
}

}
