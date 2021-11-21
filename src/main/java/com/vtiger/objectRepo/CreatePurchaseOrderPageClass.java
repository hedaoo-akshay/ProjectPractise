package com.vtiger.objectRepo;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class CreatePurchaseOrderPageClass {

	public CreatePurchaseOrderPageClass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='Creating New Purchase Order']") private WebElement pageName;
//	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']") private WebElement createPOBtn;
	@FindBy(xpath="//input[@name='subject']") private WebElement subtb;
	@FindBy(xpath="(//img[@src='themes/softed/images/select.gif'])[1]") private WebElement addVendor;
	@FindBy(id="1") private WebElement vendorName;
	@FindBy(id="requisition_no") private WebElement rntb;
	@FindBy(id="tracking_no") private WebElement trntb;
	@FindBy(xpath="(//img[@src='themes/softed/images/select.gif'])[2]") private WebElement contactName;
	@FindBy(id="1") private WebElement contactLink;
	@FindBy(xpath="//select[@name='carrier']") private WebElement carrier;
	@FindBy(id="salescommission") private WebElement salesComm;
	@FindBy(id="exciseduty") private WebElement exciseDuty;
	@FindBy(name="postatus") private WebElement status;
	@FindBy(xpath="//textarea[@name='bill_street']") private WebElement billAdd;
	@FindBy(xpath="//textarea[@name='ship_street']") private WebElement shipAdd;
	@FindBy(id="bill_pobox") private WebElement billPOB;
	@FindBy(id="ship_pobox") private WebElement shipPOB;
	@FindBy(id="bill_city") private WebElement billCity;
	@FindBy(id="ship_city") private WebElement shipCity;
	@FindBy(id="bill_state") private WebElement billState;
	@FindBy(id="ship_state") private WebElement shipState;
	@FindBy(id="bill_code") private WebElement billPOcode;
	@FindBy(id="ship_code") private WebElement shipPOcode;
	@FindBy(id="bill_country") private WebElement billCountry;
	@FindBy(id="ship_country") private WebElement shipCountry;
	@FindBy(name="description") private WebElement description;
	@FindBy(id="searchIcon1") private WebElement products;
	@FindBy(id="popup_product_14") private WebElement item;
	@FindBy(id="qty1") private WebElement qty;
	@FindBy(id="listPrice1") private WebElement listPrice;
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[2]") private WebElement save;

	public WebElement getPageName() {
		return pageName;
	}
	public WebElement getSubtb() {
		return subtb;
	}
	public WebElement getAddVendor() {
		return addVendor;
	}
	public WebElement getVendorName() {
		return vendorName;
	}
	public WebElement getRntb() {
		return rntb;
	}
	public WebElement getTrntb() {
		return trntb;
	}
	public WebElement getContactName() {
		return contactName;
	}
	public WebElement getContactLink() {
		return contactLink;
	}
	public WebElement getCarrier() {
		return carrier;
	}
	public WebElement getSalesComm() {
		return salesComm;
	}
	public WebElement getExciseDuty() {
		return exciseDuty;
	}
	public WebElement getStatus() {
		return status;
	}
	public WebElement getBillAdd() {
		return billAdd;
	}
	public WebElement getShipAdd() {
		return shipAdd;
	}
	public WebElement getBillPOB() {
		return billPOB;
	}
	public WebElement getShipPOB() {
		return shipPOB;
	}
	public WebElement getBillCity() {
		return billCity;
	}
	public WebElement getShipCity() {
		return shipCity;
	}
	public WebElement getBillState() {
		return billState;
	}
	public WebElement getShipState() {
		return shipState;
	}
	public WebElement getBillPOcode() {
		return billPOcode;
	}
	public WebElement getShipPOcode() {
		return shipPOcode;
	}
	public WebElement getBillCountry() {
		return billCountry;
	}
	public WebElement getShipCountry() {
		return shipCountry;
	}
	public WebElement getDescription() {
		return description;
	}
	public WebElement getProducts() {
		return products;
	}
	public WebElement getItem() {
		return item;
	}
	public WebElement getQty() {
		return qty;
	}
	public WebElement getListPrice() {
		return listPrice;
	}
	public WebElement getSave() {
		return save;
	}
	
	public boolean verifyCreatePOpage()
	{
		return getPageName().getText().contains("Creating New Purchase Order");
		
	}

}
