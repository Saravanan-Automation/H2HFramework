package cts.qa.hospitaltohome.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


import cts.qa.hospitaltohome.constants.Constants;

import cts.qa.hospitaltohome.utils.ElementUtil;
import io.qameta.allure.Step;

public class HomePage {
	
	private WebDriver driver;
	private ElementUtil eleUtil;
	
	
	//By locators: OR
	private By professionalbtn = By.xpath("//span[@data-gds-release-version='6']");
	//private By cookiesBtn = By.xpath("//button[text()='Accept']");
	
	private By headerbilogo = By.xpath("(//img[@alt='Boehringer Ingelheim Logo'])[2]");
	private By ratethissiteBtn = By.xpath("(//button[@class='gds-btn gds-btn--contrast'])[2]");
	private By stioltocard = By.xpath("(//a[contains(@class,'gds-link gds-link--visibility-both')])[1]");
	private By spirivacard = By.xpath("(//a[contains(@class,'gds-link gds-link--visibility-both')])[3]");
	private By biCookiesBtn = By.xpath("(//button[text()='Accept All Cookies'])[1]");
	
	private By impsafetyinfo = By.xpath("(//span[@class='label'])[2]");
	private By stioltoisi = By.xpath("//a[@title='ISI | Stiolto® Respimat® Inhalation Spray | Hospital to Home']");
	private By spirivaisi = By.xpath("//a[@title='ISI | Spiriva® Respimat® Inhalation Spray | Hospital to Home']");
	
	private By prescribinginfo = By.xpath("(//span[@class='label'])[3]");
	private By stioltoinfo = By.xpath("//a[@title='Prescribing Information | Stiolto® Respimat® Inhalation Spray ']");
	private By spirivainfo = By.xpath("//a[@title='Prescribing Information | Spiriva® Respimat® Inhalation Spray ']");
	
	private By producthcpwebsite = By.xpath("//span[text()[normalize-space()='Product HCP Website']]");
	private By stioltoproduct = By.xpath("//a[@title='Stiolto Respimat']");
	private By spirivaproduct = By.xpath("//a[@title='Spiriva Respimat']");
	
	private By faqlink = By.xpath("//a[@title='Frequently Asked Questions | FAQ | Hospital to Home']");
	

	
	//Footer links
	private By footerbilogo = By.xpath("//footer[@id='block-h2hfooter']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]/picture[1]/img[1]");
	private By footerhomelink = By.xpath("(//span[contains(text(),\"Home\")])[2]");
	private By contactuslink = By.xpath("//span[text()[normalize-space()='Contact Us']]");
	private By privacynoticelink = By.xpath("//span[text()[normalize-space()='Privacy Notice']]");
	private By termsofuselink = By.xpath("//span[text()[normalize-space()='Terms of Use']]");
	
	
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
		//eleUtil.waitForVisibilityOfElement(cookiesBtn, Constants.MEDIUM_DEFAULT_WAIT).click();
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
	
	@Step("Checking Header BI logo exist")
	public boolean isHeaderBILogoExist()
	{

		return eleUtil.waitForVisibilityOfElement(headerbilogo, Constants.SHORT_DEFAULT_WAIT).isDisplayed();
	}
	
	@Step("Checking Rate This Site Button exist")
	public boolean isRateThisSiteExist()
	{

		return eleUtil.waitForVisibilityOfElement(ratethissiteBtn ,Constants.SHORT_DEFAULT_WAIT).isDisplayed();
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
	
	@Step("Navigating to Header BI Logo Page and Getting the page url")
	public String getHeaderBILogoPageURL()
	{
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		eleUtil.doClick(headerbilogo);
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		//eleUtil.doClick(cookiesBtn);
		String url = eleUtil.waitForURLContains(Constants.BI_PAGE_URL_FRACTION, Constants.MEDIUM_DEFAULT_WAIT);
		System.out.println("Header BI Logo page url:" +url);
		
		//driver.close();
		
		return url;
		
	}
	
	@Step("Getting BI Page Title")
	public String getBIPageTitle()
	{
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		String title = eleUtil.waitForTitleIs(Constants.BI_PAGE_TITLE, Constants.MEDIUM_DEFAULT_WAIT);
		System.out.println("BI page title:" +title);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		eleUtil.waitForVisibilityOfElement(biCookiesBtn, Constants.MEDIUM_DEFAULT_WAIT).click();
		
	
		driver.close();
		return title;
	}
	
	
	//Nav Links
	@Step("ISI Stiolto Page")
	public ISIStioltoPage navigateToStioltoISIPage()
	{
		
		eleUtil.doClick(impsafetyinfo);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		eleUtil.waitForVisibilityOfElement(stioltoisi, Constants.MEDIUM_DEFAULT_WAIT).click();
		
		return new ISIStioltoPage(driver);
	}
	
	
	
	@Step("ISI Spiriva Page")
	public ISISpirivaPage navigateToSpirivaISIPage()
	{
		eleUtil.doClick(impsafetyinfo);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		eleUtil.waitForVisibilityOfElement(spirivaisi, Constants.MEDIUM_DEFAULT_WAIT).click();
		
		return new ISISpirivaPage(driver);
	}
	
	
	@Step("Stiolto Prescribing Info Page")
	public String getStioltoPrescribingInfoPageURL()
	{
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		eleUtil.doClick(prescribinginfo);
		eleUtil.waitForVisibilityOfElement(stioltoinfo, Constants.MEDIUM_DEFAULT_WAIT).click();
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		String url = eleUtil.waitForURLContains(Constants.STIOLTO_PRESCRIBING_INFO_PDF, Constants.MEDIUM_DEFAULT_WAIT);
		System.out.println("Stiolto Prescribing Info Page link:" +url);
		driver.close();
		return url;
	}
	
	@Step("Spiriva Prescribing Info Page")
	public String getSpirivaPrescribingInfoPageURL()
	{
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		eleUtil.waitForVisibilityOfElement(spirivainfo, Constants.MEDIUM_DEFAULT_WAIT).click();
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		String url = eleUtil.waitForURLContains(Constants.SPIRIVA_PRESCRIBING_INFO_PDF, Constants.MEDIUM_DEFAULT_WAIT);
		System.out.println("Spiriva Prescribing Info Page link:" +url);
		driver.close();
		return url;
	}
		
	
	@Step("Stiolto Product HCP Page")
	public String getStioltoProductPageURL()
	{
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		eleUtil.doClick(producthcpwebsite);
		eleUtil.waitForVisibilityOfElement(stioltoproduct, Constants.MEDIUM_DEFAULT_WAIT).click();
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		String url = eleUtil.waitForURLContains(Constants.STIOLTO_PRODUCT_HCP_URL, Constants.MEDIUM_DEFAULT_WAIT);
		System.out.println("Stiolto Product HCP Page link:" +url);
		driver.close();
		return url;
	}
	
	
	@Step("Spiriva Product HCP Page")
	public String getSpirivaProductPageURL()
	{
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		eleUtil.waitForVisibilityOfElement(spirivaproduct, Constants.MEDIUM_DEFAULT_WAIT).click();
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		String url = eleUtil.waitForURLContains(Constants.SPIRIVA_PRODUCT_HCP_URL, Constants.MEDIUM_DEFAULT_WAIT);
		System.out.println("Spiriva Product HCP Page link:" +url);
		driver.close();
		return url;
	}
	
	
	
	@Step("FAQs Page")
	public FAQPage navigateToFAQPage()
	{
		
		eleUtil.waitForVisibilityOfElement(faqlink, Constants.MEDIUM_DEFAULT_WAIT).click();
		
		return new FAQPage(driver);
	}
	
	
	
	
	
	
	
	//Footer Links
	@Step("Checking Footer BI logo exist")
	public boolean isFooterBILogoExist()
	{
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,8000)");
		return eleUtil.waitForVisibilityOfElement(footerbilogo, Constants.MEDIUM_DEFAULT_WAIT).isDisplayed();
	}
	
	@Step("Navigating to Footer BI Logo Page and Getting the page url")
	public String getFooterBILogoPageURL()
	{
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		eleUtil.doClick(footerbilogo);
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		
		String url = eleUtil.waitForURLContains(Constants.BI_PAGE_URL_FRACTION, Constants.MEDIUM_DEFAULT_WAIT);
		System.out.println("Footer BI Logo page url:" +url);		
		driver.close();
		
		return url;
		
	}
	
	
	@Step("Footer Homepage link")
	public String getFooterHomeLink()
	{
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		eleUtil.waitForVisibilityOfElement(footerhomelink, Constants.MEDIUM_DEFAULT_WAIT).click();
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		String url = eleUtil.waitForURLContains(Constants.HOME_PAGE_URL_FRACTION, Constants.MEDIUM_DEFAULT_WAIT);
		System.out.println("Footer Homepage link:" +url);
	
		return url;
	}
	
		
	
	@Step("Contact us link")
	public String getContactUsLink()
	{
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,9000)");
		eleUtil.waitForVisibilityOfElement(contactuslink, Constants.MEDIUM_DEFAULT_WAIT).click();
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		String url = eleUtil.waitForURLContains(Constants.CONTACT_US_LINK, Constants.MEDIUM_DEFAULT_WAIT);
		System.out.println("Contact us link:" +url);
		driver.close();
		return url;
	}
	
	
	@Step("Privacy Notice link")
	public String getPrivacyNoticeLink()
	{
		
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		eleUtil.waitForVisibilityOfElement(privacynoticelink, Constants.MEDIUM_DEFAULT_WAIT).click();
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		String url = eleUtil.waitForURLContains(Constants.PRIVACY_NOTICE_PDF, Constants.MEDIUM_DEFAULT_WAIT);
		System.out.println("Privacy Notice link:" +url);
		driver.close();
		return url;
	}
	
	
	@Step("Terms of use link")
	public String getTermsOfUseLink()
	{
		
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		eleUtil.waitForVisibilityOfElement(termsofuselink, Constants.MEDIUM_DEFAULT_WAIT).click();
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		String url = eleUtil.waitForURLContains(Constants.TERMS_OF_USE_PDF, Constants.MEDIUM_DEFAULT_WAIT);
		System.out.println("Terms of use link:" +url);
		driver.close();
		return url;
	}
	
	
	
}
