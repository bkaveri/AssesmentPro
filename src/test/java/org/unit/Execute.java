package org.unit;

import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Execute extends BaseClass{
		
		@Test(dataProviderClass=Date.class,dataProvider="kaveri")
	public void test(String s1,String s2,String s3,String s4,String s5,String s6,String s7,String s8,String s9,String s10,String s11,String s12) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\AssesmentPro\\Div\\chromedriver.exe");
			launch("https://www.amazon.in/");
			driver.manage().window().maximize();
		
			SearchPage s=new SearchPage();
			type(s.getSrch(),"s1");
			tap(s.getButton());
		
		
		List<WebElement>li=driver.findElements(By.xpath("//a[@class='a-link-normal _tetris-creative-desktop_BackgroundLink_link__2jQgx']"));
		WebElement firstph=li.get(0);
		((org.openqa.selenium.WebElement) firstph).click();
		
		Iphone i=new Iphone();
		tap( i.getCartbutton());
		
		Address a=new Address();
		tap( a.getAclogin());
		tap((WebElement) a.getAdd());
		tap(a.getClick());
		type(a.getPassword(),"s2");
		tap(a.getBtn());
		
		PaymentPage t=new PaymentPage();
		tap( t.getPayment());
		type( t.getPassword1(),"s2");
		tap( t.getSubmit());
		
		PersonalAddress p = new PersonalAddress();
		type( p.getCountry(),"s3");
		type(p.getName(),"s4");
		type(p.getNumber(),"s5");
		type(p.getCode(),"s6");
		type(p.getLine(),"s7");
		type(p.getLine2(),"s8");
		type(p.getLandmark(),"s9");
		type(p.getTown(),"s10");
		type((WebElement) p.getState(),"s11");
		type(p.getTown(),"s12");
		tap(p.getButton());
		
		Cart c=new Cart();
		tap(c.getCartbtn());
		tap(c.getDelete());
		
	}

		
			
		}

		
			
		

			
		

		
		

		
			
		




