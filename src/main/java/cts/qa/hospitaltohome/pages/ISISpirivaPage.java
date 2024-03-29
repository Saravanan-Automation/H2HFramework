package cts.qa.hospitaltohome.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cts.qa.hospitaltohome.constants.Constants;
import cts.qa.hospitaltohome.utils.ElementUtil;
import io.qameta.allure.Step;

public class ISISpirivaPage {
	
	private WebDriver driver;
	private ElementUtil eleUtil;
	
		
	//SPIRIVA
	private By spirivaprescribinginfolink = By.xpath("//a[@title='SPIRIVA RESPIMAT']");
	private By spirivainstructionuselink = By.xpath("(//a[@title='Instructions for Use'])[1]");
	private By spirivahandihalerinfolink = By.xpath("//a[@title='SPIRIVA HANDIHALER']");
	private By spirivahandihalerpatientinfolink = By.xpath("//a[@title='Patient Information']");
	private By spirivahandihalerinstructionuselink = By.xpath("(//a[@title='Instructions for Use'])[2]");
	
	
	//page constructor
	public ISISpirivaPage(WebDriver driver)
	{
		this.driver = driver;
		eleUtil = new ElementUtil(this.driver);
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

}
