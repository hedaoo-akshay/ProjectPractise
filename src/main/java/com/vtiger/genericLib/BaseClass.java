package com.vtiger.genericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.vtiger.objectRepo.HomePageClass;
import com.vtiger.objectRepo.LoginPageClass;

public class BaseClass implements IPathConstants {
	public WebDriver driver;
	public PropertyUtilityFile pUtil=new PropertyUtilityFile();
	public WebdriverUtilityFile wUtil=new WebdriverUtilityFile();
	public HomePageClass hp;
	public LoginPageClass lp;
	public static WebDriver sdriver;


	@BeforeClass
	public void OpenBrowser() throws Throwable
	{ String browservalue = pUtil.readDataFromPropertyFile("browser");
	if(browservalue.equalsIgnoreCase("chrome"))
	{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	else if(browservalue.equalsIgnoreCase("firefox"))
	{
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
	}
	sdriver=driver;
	}

	@AfterClass
	public void CloseBrowser()
	{
		driver.close();
	}

	@BeforeMethod
	public void Login() throws Throwable
	{	lp=new LoginPageClass(driver);
		driver.get(pUtil.readDataFromPropertyFile("url"));
		lp.LoginToApp();


	}
	@AfterMethod
	public void SignOut()
	{ hp=new HomePageClass(driver);	
		hp.signOutFromApp(driver);
	}

}
