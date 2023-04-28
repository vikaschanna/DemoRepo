package com.zoho.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(id="userName")
	private WebElement untbx;
	
	@FindBy(id="passWord")
	private WebElement pwtbx;
	
	
}
