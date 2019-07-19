package com.wallethub.assignments.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wallethub.assignments.base.Base;

public class LoginPage  extends Base{
	
	
	@FindBy(id="email")
	WebElement username;
	
	
	@FindBy(id="pass")
	WebElement password;
	
	
	@FindBy(xpath="//input[@value='Log In']")
	WebElement LoginBtn;
	
	public LoginPage() {
		
		PageFactory.initElements(driver,this);
	}
	
	
	public void Login() {
		//username.sendKeys("jishaanie@gmail.com");
		
		username.sendKeys(prop.getProperty("facebook.username"));
		password.sendKeys(prop.getProperty("facebook.pasword"));
		LoginBtn.click();
		System.out.println("clicked on login button");
	}

}
