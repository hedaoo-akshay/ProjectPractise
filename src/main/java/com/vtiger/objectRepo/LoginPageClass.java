package com.vtiger.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.genericLib.PropertyUtilityFile;

/**
 * 
 * @author Akshay
 * Object Repository of Login Page WebElement
 *
 */
public class LoginPageClass {

	public LoginPageClass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(name= "user_name") private WebElement untb;
	@FindBy(name="user_password") private WebElement pwdtb;
	@FindBy(id="submitButton") private WebElement loginbtn;

	public WebElement getUntb() {
		return untb;
	}
	public WebElement getPwdtb() {
		return pwdtb;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public void LoginToApp() throws Throwable
	{
		PropertyUtilityFile pUtil=new PropertyUtilityFile();
		getUntb().sendKeys(pUtil.readDataFromPropertyFile("username"));
		getPwdtb().sendKeys(pUtil.readDataFromPropertyFile("password"));
		getLoginbtn().click();
	}


}
