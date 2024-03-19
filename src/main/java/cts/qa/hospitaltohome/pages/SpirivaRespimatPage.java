package cts.qa.hospitaltohome.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import cts.qa.hospitaltohome.constants.Constants;
import cts.qa.hospitaltohome.utils.ElementUtil;
import io.qameta.allure.Step;

public class SpirivaRespimatPage {
	
	
	private WebDriver driver;
	private ElementUtil eleUtil;
	
	
	private By spirivalogo = By.xpath("//div[@class='gds-image-zoom gds-image-zoom--visibility-both']");

	
	private By firstname = By.name("first_name");
	private By lastname = By.name("last_name");
	private By phonenumber = By.name("phone_number");
	private By emailaddress = By.name("email_address");
	private By address = By.name("address");
	private By floor = By.name("apartment");
	private By city = By.name("city");
	private By state = By.name("state");
	private By zipcode = By.name("zip_code");
	private By productInfoCheck = By.name("product_information_check");
	private By enrollPatientBtn = By.name("op");
	
	private By successMessg = By.xpath("//h3[contains(@class,'text-align-center enroll-header')]");
	
	private By spirivaEnrollNowBtn = By.xpath("(//a[contains(@class,'gds-link gds-link--visibility-both')])[3]");
	
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
	
	
	public boolean patientRegisteration(String firstname, String lastname, String phonenumber, String emailaddress, String address, String floor, String city, String state, String zipcode)
	{
		eleUtil.waitForVisibilityOfElement(this.firstname, Constants.MEDIUM_DEFAULT_WAIT).sendKeys(firstname);
		eleUtil.doSendKeys(this.lastname, lastname);
		eleUtil.doSendKeys(this.phonenumber, phonenumber);
		eleUtil.doSendKeys(this.emailaddress, emailaddress);
		eleUtil.doSendKeys(this.address, address);
		eleUtil.doSendKeys(this.floor, floor);
		eleUtil.doSendKeys(this.city, city);
		eleUtil.doSendKeys(this.state, state);
		eleUtil.doSendKeys(this.zipcode, zipcode);
		
		eleUtil.doClick(productInfoCheck);
		eleUtil.doClick(enrollPatientBtn);
		
	
		
		String successMesg = eleUtil.waitForVisibilityOfElement(successMessg, Constants.MEDIUM_DEFAULT_WAIT).getText();
		System.out.println(successMesg);
	      
		if(successMesg.contains(Constants.PATIENT_REGISTER_SUCCESS_MESSG))
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,500)");
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
						
			eleUtil.doClick(spirivaEnrollNowBtn);
			
			return true;
		}
		else
		{
			return false;
		}
		
		
		
	}

}
