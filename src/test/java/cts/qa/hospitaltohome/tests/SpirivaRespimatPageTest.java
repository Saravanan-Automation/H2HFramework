package cts.qa.hospitaltohome.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cts.qa.hospitaltohome.constants.Constants;
import cts.qa.hosptialtohome.base.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class SpirivaRespimatPageTest extends BaseTest {
	
	@BeforeClass
	public void spirivaSetUp()
	{
		homepage.getHomepage();
		spirivaPage = homepage.navigateToSpirivaRespimatPage();
	}
	
	
	@Description("Spiriva page url test")
	@Severity(SeverityLevel.BLOCKER)
	@Test
	public void SpirivaPageURLTest()
	{
		Assert.assertEquals(spirivaPage.getHomePageURL(), Constants.SPIRIVA_PAGE_URL_FRACTION);
	}
	
	@Description("Verifying Spiriva logo exist test...")
	@Severity(SeverityLevel.CRITICAL)
	@Test
	public void spirivaLogoExistTest()
	{
		Assert.assertTrue(spirivaPage.isLogoExist());
	}
	
	@Description("Spiriva page title test")
	@Severity(SeverityLevel.MINOR)
	@Test
	public void SpirivaPageTitleTest()
	{
		Assert.assertEquals(spirivaPage.getHomePageTitle(), Constants.SPIRIVA_PAGE_TITLE);
	}

}
