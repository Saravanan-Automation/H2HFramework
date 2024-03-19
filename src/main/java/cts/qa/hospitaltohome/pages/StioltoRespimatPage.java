package cts.qa.hospitaltohome.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cts.qa.hospitaltohome.constants.Constants;
import cts.qa.hospitaltohome.utils.ElementUtil;
import io.qameta.allure.Step;

public class StioltoRespimatPage {
	
	private WebDriver driver;
	private ElementUtil eleUtil;
	
	
	private By stioltologo = By.xpath("//div[@class='gds-image-zoom gds-image-zoom--visibility-both']");

	
	//page constructor
	public StioltoRespimatPage(WebDriver driver)
	{
		this.driver = driver;
		eleUtil = new ElementUtil(this.driver);
	}
	
	@Step("Getting Stiolto Page URL")
	public String getHomePageURL()
	{
		
		String url = eleUtil.waitForURLContains(Constants.STIOLTO_PAGE_URL_FRACTION, Constants.SHORT_DEFAULT_WAIT);
		System.out.println("Stiolto page url:" +url);
		return url;
	}
	
	@Step("Getting Stiolto Page Title")
	public String getHomePageTitle()
	{
		String title = eleUtil.waitForTitleIs(Constants.STIOLTO_PAGE_TITLE, Constants.SHORT_DEFAULT_WAIT);
		System.out.println("Stiolto page title:" +title);
		return title;
	}
	
	@Step("Checking Stiolto logo exist")
	public boolean isLogoExist()
	{

		return eleUtil.waitForVisibilityOfElement(stioltologo, Constants.SHORT_DEFAULT_WAIT).isDisplayed();
	}

}
