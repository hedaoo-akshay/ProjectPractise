package com.vtiger.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.genericLib.WebdriverUtilityFile;

public class HomePageClass extends WebdriverUtilityFile {
	WebDriver driver;
	public HomePageClass(WebDriver driver)
	{this.driver=driver;
	PageFactory.initElements(driver, this);
	}

	@FindBy(xpath= "//a[text()='More']") private WebElement moreDD;
	@FindBy(name="Purchase Order") private WebElement purchaseOrderLink;
	@FindBy(xpath="//a[@name='Services']") private WebElement serviceLink;
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']") private WebElement adminImg;
	@FindBy(xpath="//a[text()='Sign Out']") private WebElement signoutLink;

	public WebElement getMoreDD() {
		return moreDD;
	}
	public WebElement getPurchaseOrderLink() {
		return purchaseOrderLink;
	}
	public WebElement getAdminImg() {
		return adminImg;
	}
	public WebElement getSignoutLink() {
		return signoutLink;
	}


	public WebElement getServiceLink() {
		return serviceLink;
	}

	public void clickOnMore()
	{
		getMoreDD().click();
	}
	public void clickOnPurchaseOrderLink()
	{
		getPurchaseOrderLink().click(); 
	}
	public void clickOnServiceLink()
	{
		getServiceLink().click();
	}
	public void signOutFromApp(WebDriver driver)
	{ WebdriverUtilityFile wUtil=new WebdriverUtilityFile();
	mouseHover(driver, getAdminImg());
	wUtil.waitForPageLoad(driver);
	getSignoutLink().click();

	}



}
