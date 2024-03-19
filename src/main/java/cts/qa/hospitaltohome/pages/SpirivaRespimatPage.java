package cts.qa.hospitaltohome.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cts.qa.hospitaltohome.constants.Constants;
import cts.qa.hospitaltohome.utils.ElementUtil;
import io.qameta.allure.Step;

public class SpirivaRespimatPage {
	
	
	private WebDriver driver;
	private ElementUtil eleUtil;
	
	
	private By spirivalogo = By.xpath("//div[@class='gds-image-zoom gds-image-zoom--visibility-both']");

	
	//page constructor
	public SpirivaRespimatPage(WebDriver driver)
	{
		this.driver = driver;
		eleUtil = new ElementUtil(this.driver);
	}
	
	@Step("Getting Spiriva Page URL")
	public String getHomePageURL()
	{
		
		String url = eleUtil.waitForURLContains(Constants.SPIRIVA_PAGE_URL_FRACTION, Constants.SHORT_DEFAULT_WAIT);
		System.out.println("Spiriva page url:" +url);
		return url;
	}
	
	@Step("Getting Spiriva Page Title")
	public String getHomePageTitle()
	{
		String title = eleUtil.waitForTitleIs(Constants.SPIRIVA_PAGE_TITLE, Constants.SHORT_DEFAULT_WAIT);
		System.out.println("Spiriva page title:" +title);
		return title;
	}
	
	@Step("Checking Spiriva logo exist")
	public boolean isLogoExist()
	{

		return eleUtil.waitForVisibilityOfElement(spirivalogo, Constants.SHORT_DEFAULT_WAIT).isDisplayed();
	}

}
