package com.purchasemodule;

import org.testng.annotations.Test;

import com.vtiger.genericLib.BaseClass;
import com.vtiger.genericLib.ExcelUtilityFile;
import com.vtiger.genericLib.JavaUtilityFile;
import com.vtiger.objectRepo.CreatePurchaseOrderPageClass;
import com.vtiger.objectRepo.HomePageClass;
import com.vtiger.objectRepo.PurchaseOrderPageClass;

public class PurchaseOrderTest extends BaseClass{
	@Test
	public void purchaseOrderTest() throws Throwable
	{
		HomePageClass hp=new HomePageClass(driver);
		PurchaseOrderPageClass poc=new PurchaseOrderPageClass(driver);
		CreatePurchaseOrderPageClass cpoc=new CreatePurchaseOrderPageClass(driver);
		ExcelUtilityFile eUtil = new ExcelUtilityFile();
		JavaUtilityFile jUtil=new JavaUtilityFile();
		hp.clickOnMore();
		hp.clickOnPurchaseOrderLink();
		wUtil.waitForPageLoad(driver);
		poc.clickOncreatePOBtn();
		cpoc.getSubtb().sendKeys(eUtil.readDataFromExcelFile("PO", 2, 1));
		cpoc.getAddVendor().click();
		wUtil.switchToWindow(driver, "Vendors");
		cpoc.getVendorName().click();
		wUtil.switchToWindow(driver, "Purchase");
		cpoc.getRntb().sendKeys(eUtil.readDataFromExcelFile("PO", 4, 1)+ jUtil.generateRandomNumber());
		cpoc.getTrntb().sendKeys(eUtil.readDataFromExcelFile("PO", 5, 1)+ jUtil.generateRandomNumber());
		cpoc.getContactName().click();
		wUtil.switchToWindow(driver, "Contacts");
		wUtil.waitForPageLoad(driver);
		cpoc.getContactLink().click();
		wUtil.acceptPopUp(driver);
		wUtil.switchToWindow(driver, "Purchase");
		cpoc.getSalesComm().sendKeys(eUtil.readNumericCellValueFromExcelFile("PO", 7, 1));
		cpoc.getExciseDuty().sendKeys(eUtil.readNumericCellValueFromExcelFile("PO", 8, 1));
		cpoc.getStatus().click();
		wUtil.selectByVisibleText(cpoc.getStatus(), "Created");
		cpoc.getBillAdd().sendKeys(jUtil.FakeAddress());
		cpoc.getShipAdd().sendKeys(jUtil.FakeAddress());
		cpoc.getBillPOB().sendKeys(eUtil.readNumericCellValueFromExcelFile("PO", 11, 1));
		cpoc.getShipPOB().sendKeys(eUtil.readNumericCellValueFromExcelFile("PO", 12, 1));
		cpoc.getBillCity().sendKeys(eUtil.readDataFromExcelFile("PO", 13, 1));
		cpoc.getShipCity().sendKeys(eUtil.readDataFromExcelFile("PO", 14, 1));
		cpoc.getBillState().sendKeys(eUtil.readDataFromExcelFile("PO", 15, 1));
		cpoc.getShipState().sendKeys(eUtil.readDataFromExcelFile("PO", 16, 1));
		cpoc.getBillPOcode().sendKeys(eUtil.readNumericCellValueFromExcelFile("PO", 17, 1));
		cpoc.getShipPOcode().sendKeys(eUtil.readNumericCellValueFromExcelFile("PO", 18, 1));
		cpoc.getBillCountry().sendKeys(eUtil.readDataFromExcelFile("PO", 19, 1));
		cpoc.getShipCountry().sendKeys(eUtil.readDataFromExcelFile("PO", 20, 1));
		cpoc.getDescription().sendKeys(jUtil.FakeProductName()+jUtil.FakeBusinessName());
		cpoc.getProducts().click();
		wUtil.switchToWindow(driver, "Products");
		cpoc.getItem().click();
		wUtil.switchToWindow(driver, "Purchase");
		cpoc.getQty().sendKeys(jUtil.FakeQty());
		cpoc.getListPrice().sendKeys(eUtil.readNumericCellValueFromExcelFile("PO", 24, 1));
		cpoc.getSave().click();
	}

}
