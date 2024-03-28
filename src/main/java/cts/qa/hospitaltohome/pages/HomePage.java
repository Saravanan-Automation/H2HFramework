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
	private By cookiesBtn = By.xpath("//button[text()='Accept']");
	
	private By headerbilogo = By.xpath("(//img[@alt='Boehringer Ingelheim Logo'])[2]");
	private By ratethissiteBtn = By.xpath("(//button[@class='gds-btn gds-btn--contrast'])[2]");
	private By stioltocard = By.xpath("(//a[contains(@class,'gds-link gds-link--visibility-both')])[1]");
	private By spirivacard = By.xpath("(//a[contains(@class,'gds-link gds-link--visibility-both')])[3]");
	private By biCookiesBtn = By.xpath("(//button[text()='Accept All Cookies'])[1]");
	
	//STIOLTO
	private By stioltoprescribinginfolink = By.xpath("(//a[@disclaimer='0'])[3]");
	private By stioltopatientinfolink = By.xpath("(//a[@disclaimer='0']/following-sibling::a)[2]");
	private By stioltoinstructionofuselink = By.xpath("(//a[@disclaimer='0']/following-sibling::a)[3]");
	
	//SPIRIVA
	private By spirivaprescribinginfolink = By.xpath("(//h5[contains(@class,'isi_small_txt h2h-isi-text')]//a)[1]");
	private By spirivainstructionuselink = By.xpath("//a[@title='SPIRIVA RESPIMAT']/following-sibling::a[1]");
	private By spirivahandihalerinfolink = By.xpath("(//a[text()='SPIRIVA RESPIMAT']/following-sibling::a)[2]");
	private By spirivahandihalerpatientinfolink = By.xpath("(//a[@class='skip-disclaimer']/following-sibling::a)[3]");
	private By spirivahandihalerinstructionuselink = By.xpath("(//a[@disclaimer='0']/following-sibling::a)[1]");
	
	
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
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		eleUtil.doClick(headerbilogo);
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		
		String url = eleUtil.waitForURLContains(Constants.BI_PAGE_URL_FRACTION, Constants.MEDIUM_DEFAULT_WAIT);
		System.out.println("Header BI Logo page url:" +url);
		
		return url;
		
	}
	
	@Step("Getting BI Page Title")
	public String getBIPageTitle()
	{
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		String title = eleUtil.waitForTitleIs(Constants.BI_PAGE_TITLE, Constants.MEDIUM_DEFAULT_WAIT);
		System.out.println("BI page title:" +title);
		eleUtil.waitForVisibilityOfElement(biCookiesBtn, Constants.MEDIUM_DEFAULT_WAIT).click();
		
	
		driver.close();
		return title;
	}
	
	
	

	//STIOLTO
	@Step("Stiolto Prescribing info link")
	public String getStioltoPrescrbinginfoLink()
	{
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,5000)");
		eleUtil.waitForVisibilityOfElement(stioltoprescribinginfolink, Constants.MEDIUM_DEFAULT_WAIT).click();
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		String url = eleUtil.waitForURLContains(Constants.STIOLTO_PRESCRIBING_INFO_PDF, Constants.MEDIUM_DEFAULT_WAIT);
		System.out.println("Stiolto Prescribing info link:" +url);
		driver.close();
	
		return url;
	}
	
	
	@Step("Stiolto Patient info link")
	public String getStioltoPatientinfoLink()
	{
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		eleUtil.waitForVisibilityOfElement(stioltopatientinfolink, Constants.MEDIUM_DEFAULT_WAIT).click();
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		String url = eleUtil.waitForURLContains(Constants.STIOLTO_PATIENT_INFO_PDF, Constants.MEDIUM_DEFAULT_WAIT);
		System.out.println("Stiolto Patient info link:" +url);
		driver.close();
		
		
		return url;
	}
	
	@Step("Stiolto Instructions of use link")
	public String getStioltoInstructionsOfUseLink()
	{
		
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		eleUtil.waitForVisibilityOfElement(stioltoinstructionofuselink, Constants.MEDIUM_DEFAULT_WAIT).click();
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		String url = eleUtil.waitForURLContains(Constants.STIOLTO_INSTRUCTIONS_FOR_USE_PDF, Constants.MEDIUM_DEFAULT_WAIT);
		System.out.println("Stiolto Instructions of use link:" +url);
		driver.close();
		return url;
	}
	
	
	//SPIRIVA
	@Step("Spiriva prescribing info link")
	public String getSpirivaPrescribingInfoLink()
	{
		
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		eleUtil.waitForVisibilityOfElement(spirivaprescribinginfolink, Constants.MEDIUM_DEFAULT_WAIT).click();
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		String url = eleUtil.waitForURLContains(Constants.SPIRIVA_PRESCRIBING_INFO_PDF, Constants.MEDIUM_DEFAULT_WAIT);
		System.out.println("Spiriva prescribing info link:" +url);
		driver.close();
		return url;
	}
	
	
	@Step("Spiriva Instructions for use link")
	public String getSpirivaInstructionsforUseLink()
	{
		
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		eleUtil.waitForVisibilityOfElement(spirivainstructionuselink, Constants.MEDIUM_DEFAULT_WAIT).click();
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		String url = eleUtil.waitForURLContains(Constants.SPIRIVA_INSTRUCTIONS_FOR_USE_PDF, Constants.MEDIUM_DEFAULT_WAIT);
		System.out.println("Spiriva Instructions for use link:" +url);
		driver.close();
		return url;
	}
	
	
	@Step("Spiriva Handihaler Info link")
	public String getSpirivaHandihalerInfoLink()
	{
		
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		eleUtil.waitForVisibilityOfElement(spirivahandihalerinfolink, Constants.MEDIUM_DEFAULT_WAIT).click();
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		String url = eleUtil.waitForURLContains(Constants.SPIRIVA_HANDIHALER_INFO_PDF, Constants.MEDIUM_DEFAULT_WAIT);
		System.out.println("Spiriva Handihaler Info link:" +url);
		driver.close();
		return url;
	}
	
	
	@Step("Spiriva Handihaler Patient Info link")
	public String getSpirivaHandihalerPatientInfoLink()
	{
		
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		eleUtil.waitForVisibilityOfElement(spirivahandihalerpatientinfolink, Constants.MEDIUM_DEFAULT_WAIT).click();
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		String url = eleUtil.waitForURLContains(Constants.SPIRIVA_HANDIHALER_PATIENT_INFO_PDF, Constants.MEDIUM_DEFAULT_WAIT);
		System.out.println("Spiriva Handihaler Patient Info link:" +url);
		driver.close();
		return url;
	}
	
	
	@Step("Spiriva Handihaler Instructions for use link")
	public String getSpirivaHandihalerInstructionForUseLink()
	{
		
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		eleUtil.waitForVisibilityOfElement(spirivahandihalerinstructionuselink, Constants.MEDIUM_DEFAULT_WAIT).click();
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		String url = eleUtil.waitForURLContains(Constants.SPIRIVA_HANDIHALER_INSTRUCTIONS_FOR_USE_PDF, Constants.MEDIUM_DEFAULT_WAIT);
		System.out.println("Spiriva Handihaler Instructions for use link:" +url);
		driver.close();
		return url;
	}
	
	
	
	//Footer Links
	@Step("Checking Footer BI logo exist")
	public boolean isFooterBILogoExist()
	{
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
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
		
	
	@Step("Contact us link")
	public String getContactUsLink()
	{
		driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
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
