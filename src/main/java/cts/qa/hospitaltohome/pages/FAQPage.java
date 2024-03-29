package cts.qa.hospitaltohome.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import cts.qa.hospitaltohome.constants.Constants;
import cts.qa.hospitaltohome.utils.ElementUtil;
import io.qameta.allure.Step;

public class FAQPage {
	
	private WebDriver driver;
	private ElementUtil eleUtil;
	
	
	
	private By enroll_link_dd = By.xpath("(//div[@class='gds-accordion__item gds-accordion__item--is-closed'])[2]");
	private By enroll_link = By.xpath("(//a[@class='skip-disclaimer'])[1]");
	
	private By enrolled_link_dd = By.xpath("(//div[@class='gds-accordion__item']/following-sibling::div)[2]");
	private By enrolled_link = By.xpath("(//a[@class='skip-disclaimer'])[2]");
	
	
	//page constructor
	public FAQPage(WebDriver driver)
	{
		this.driver = driver;
		eleUtil = new ElementUtil(this.driver);
	}
	
	
	@Step("Getting FAQs Page URL")
	public String getFQAPageURL()
	{
		//driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		String url = eleUtil.waitForURLContains(Constants.FAQ_PAGE_URL_FRACTION, Constants.SHORT_DEFAULT_WAIT);
		System.out.println("FAQs page url:" +url);
		return url;
	}
	
	@Step("Getting FAQs Page Title")
	public String getFAQPageTitle()
	{
		String title = eleUtil.waitForTitleIs(Constants.FAQ_PAGE_TITLE, Constants.SHORT_DEFAULT_WAIT);
		System.out.println("FAQs page title:" +title);
		return title;
	}
	
	
	@Step("Getting Enroll Page url")
	public String getEnrollPageURL()
	{
		eleUtil.doClick(enroll_link_dd);
		eleUtil.waitForVisibilityOfElement(enroll_link, Constants.MEDIUM_DEFAULT_WAIT).click();
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		String url = eleUtil.waitForURLContains(Constants.HOME_PAGE_URL_FRACTION, Constants.SHORT_DEFAULT_WAIT);
		System.out.println("Enroll Page url:" +url);
		
		driver.navigate().back();
		return url;
	}
	
		
	@Step("Getting Enrolled Page url")
	public String getEnrolledPageURL()
	{
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)");
		eleUtil.doClick(enrolled_link_dd);
		eleUtil.waitForVisibilityOfElement(enrolled_link, Constants.MEDIUM_DEFAULT_WAIT).click();
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		String url = eleUtil.waitForURLContains(Constants.HOME_PAGE_URL_FRACTION, Constants.SHORT_DEFAULT_WAIT);
		System.out.println("Enrolled Page url:" +url);
		return url;
	}

}
