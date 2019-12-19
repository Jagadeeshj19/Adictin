package org.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testdef.Hooks;

public class Login {
	public Login() {
		PageFactory.initElements(Hooks.driver,this);
		
	}

	@FindBy(name="username")
	private WebElement user;
	@FindBy(name="password")
	private WebElement pass;
	@FindBy(name="login")
	private WebElement button;
	public WebElement getUser() {
		return user;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getButton() {
		return button;
	}
	
	}



