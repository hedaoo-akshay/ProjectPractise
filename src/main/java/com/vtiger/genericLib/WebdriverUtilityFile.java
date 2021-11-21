package com.vtiger.genericLib;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebdriverUtilityFile {
	
	public void mouseHover(WebDriver driver, WebElement element)
	{
		Actions ac=new Actions(driver);
		ac.moveToElement(element).perform();
	}
	public void waitForPageLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	} 
	public void switchToWindow(WebDriver driver, CharSequence partialWinTitle)
	{
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		while(it.hasNext())
		{
			String winID=it.next();
			String title = driver.switchTo().window(winID).getTitle();
			if(title.contains(partialWinTitle))
			{
				break;
			}
		}
	}
	public void selectByIndex(WebElement element, int index)
	{
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	public void selectByVisibleText(WebElement element, String visibleText)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(visibleText);
	}
	public void selectByValue(WebElement element, String value)
	{
		Select sel=new Select(element);
		sel.selectByValue(value);
		
	}
	public void acceptPopUp(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	public void dismissPopUp(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	

}
