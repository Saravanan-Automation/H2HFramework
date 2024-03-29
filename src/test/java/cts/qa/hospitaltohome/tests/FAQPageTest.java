package cts.qa.hospitaltohome.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cts.qa.hospitaltohome.constants.Constants;
import cts.qa.hosptialtohome.base.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class FAQPageTest extends BaseTest {
	
	
	@BeforeClass
	public void spirivaSetUp()
	{
		homePage.getHomepage();
		faqPage = homePage.navigateToFAQPage();
	}
	
	
	@Description("FAQs page url test")
	@Severity(SeverityLevel.BLOCKER)
	@Test(priority = 1)
	public void faqPageURLTest()
	{
		Assert.assertEquals(faqPage.getFQAPageURL(), Constants.FAQ_PAGE_URL_FRACTION);
	}
	
	
	@Description("FAQs page title test")
	@Severity(SeverityLevel.BLOCKER)
	@Test(priority = 2)
	public void faqPageTitleTest()
	{
		Assert.assertEquals(faqPage.getFAQPageTitle(), Constants.FAQ_PAGE_TITLE);
	}
	
	@Description("FAQs page url test")
	@Severity(SeverityLevel.BLOCKER)
	@Test(priority = 3)
	public void enrollPageURL()
	{
		Assert.assertEquals(faqPage.getEnrollPageURL(), Constants.HOME_PAGE_URL_FRACTION);
	}
	
	
	@Description("FAQs page url test")
	@Severity(SeverityLevel.BLOCKER)
	@Test(priority = 4)
	public void enrolledPageURL()
	{
		Assert.assertEquals(faqPage.getEnrolledPageURL(), Constants.HOME_PAGE_URL_FRACTION);
	}
	
	

}
