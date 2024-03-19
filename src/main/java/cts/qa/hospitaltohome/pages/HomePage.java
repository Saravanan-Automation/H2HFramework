package cts.qa.hospitaltohome.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cts.qa.hospitaltohome.constants.Constants;

import cts.qa.hospitaltohome.utils.ElementUtil;
import io.qameta.allure.Step;

public class HomePage {
	
	private WebDriver driver;
	private ElementUtil eleUtil;
	
	//By locators: OR
	private By professionalbtn = By.xpath("//span[@data-gds-release-version='6']");
	private By logo = By.xpath("(//img[@alt='Boehringer Ingelheim Logo'])[2]");
	private By stioltocard = By.xpath("(//a[contains(@class,'gds-link gds-link--visibility-both')])[1]");
	private By spirivacard = By.xpath("(//a[contains(@class,'gds-link gds-link--visibility-both')])[3]");
	
	
	//page constructor
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		eleUtil = new ElementUtil(this.driver);
	}
	
	//page actions/methods	
	@Step("Navigating Home Page")
	public boolean getHomepage()
	{
		eleUtil.waitForVisibilityOfElement(professionalbtn, Constants.MEDIUM_DEFAULT_WAIT).click();
		//eleUtil.doClick(professionalbtn);
		return true;
	}
	
	@Step("Getting Home Page URL")
	public String getHomePageURL()
	{
		
		String url = eleUtil.waitForURLContains(Constants.HOME_PAGE_URL_FRACTION, Constants.SHORT_DEFAULT_WAIT);
		System.out.println("Home page url:" +url);
		return url;
	}
	
	@Step("Checking BI logo exist")
	public boolean isLogoExist()
	{

		return eleUtil.waitForVisibilityOfElement(logo,Constants.SHORT_DEFAULT_WAIT).isDisplayed();
	}
	
	@Step("Getting Home Page Title")
	public String getHomePageTitle()
	{
		String title = eleUtil.waitForTitleIs(Constants.HOME_PAGE_TITLE, Constants.SHORT_DEFAULT_WAIT);
		System.out.println("Home page title:" +title);
		return title;
	}
	
	@Step("Navigating to Stiolto Respimat Page")
	public StioltoRespimatPage navigateToStioltoRespimatPage()
	{
		eleUtil.waitForVisibilityOfElement(stioltocard, Constants.MEDIUM_DEFAULT_WAIT).click();
		
		return new StioltoRespimatPage(driver);
	}
	
	@Step("Navigating to Spiriva Respimat Page")
	public SpirivaRespimatPage navigateToSpirivaRespimatPage()
	{
		eleUtil.waitForVisibilityOfElement(spirivacard, Constants.MEDIUM_DEFAULT_WAIT).click();
		
		return new SpirivaRespimatPage(driver);
	}
	
	

}
