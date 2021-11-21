package com.vtiger.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchaseOrderPageClass {
	
	public PurchaseOrderPageClass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath=" //img[@title='Create Purchase Order...']") private WebElement createBtn;
	public WebElement getCreateBtn() {
		return createBtn;
	}
	public void clickOncreatePOBtn()
	{
		createBtn.click();
	}

}
