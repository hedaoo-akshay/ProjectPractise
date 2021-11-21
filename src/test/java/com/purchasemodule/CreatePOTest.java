package com.purchasemodule;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.vtiger.genericLib.BaseClass;
import com.vtiger.genericLib.JavaUtilityFile;
import com.vtiger.objectRepo.CreatePurchaseOrderPageClass;
import com.vtiger.objectRepo.HomePageClass;
import com.vtiger.objectRepo.PurchaseOrderPageClass;

public class CreatePOTest extends BaseClass{
	@Test
	public void createPOTest()
	{
		HomePageClass hp=new HomePageClass(driver);
		PurchaseOrderPageClass poc=new PurchaseOrderPageClass(driver);
		CreatePurchaseOrderPageClass cpoc=new CreatePurchaseOrderPageClass(driver);
		JavaUtilityFile jUtil=new JavaUtilityFile();
		hp.clickOnMore();
		wUtil.waitForPageLoad(driver);
		hp.clickOnPurchaseOrderLink();
		wUtil.waitForPageLoad(driver);
		Assert.assertEquals(driver.getTitle().contains("Purchase Order"), true );
		poc.clickOncreatePOBtn();
		Assert.assertTrue(cpoc.verifyCreatePOpage());
		cpoc.getSubtb().sendKeys(jUtil.FakeProductName());
		cpoc.getAddVendor().click();
		wUtil.switchToWindow(driver, "Vendors");
		cpoc.getVendorName().click();
		wUtil.switchToWindow(driver, "Purchase");
		cpoc.getStatus().click();
		wUtil.selectByValue(cpoc.getStatus(), "Created");
		cpoc.getBillAdd().sendKeys(jUtil.FakeAddress());
		cpoc.getShipAdd().sendKeys(jUtil.FakeAddress());
		cpoc.getProducts().click();
		wUtil.switchToWindow(driver, "Products");
		cpoc.getItem().click();
		wUtil.switchToWindow(driver, "Purchase");
		cpoc.getQty().sendKeys(jUtil.FakeQty());
		cpoc.getSave().click();
		
		
	}

}
