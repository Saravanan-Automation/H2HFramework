package cts.qa.hospitaltohome.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import cts.qa.hospitaltohome.constants.Constants;
import cts.qa.hospitaltohome.utils.ElementUtil;
import io.qameta.allure.Step;

public class ISIStioltoPage {
	
	private WebDriver driver;
	private ElementUtil eleUtil;
	
	
	
	//STIOLTO
	private By stioltoprescribinginfolink = By.xpath("//a[@title='Prescribing Information']");
	private By stioltopatientinfolink = By.xpath("//a[@title='Patient Information']");
	private By stioltoinstructionofuselink = By.xpath("//a[@title='Instructions for Use']");
	
	
	
	
	//page constructor
	public ISIStioltoPage(WebDriver driver)
	{
		this.driver = driver;
		eleUtil = new ElementUtil(this.driver);
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

}
