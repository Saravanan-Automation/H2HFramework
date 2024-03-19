package cts.qa.hospitaltohome.constants;

import java.util.Arrays;
import java.util.List;

public class Constants {
		
	public static final String PROFESSIONAL_BUTTON = "I am a healthcare professional in the US";
	
	public static final String HOME_PAGE_TITLE = "Enroll Your Patients with COPD | Hospital to Home";
	public static final String STIOLTO_PAGE_TITLE = "H2H Enrollment Form | Stiolto® Respimat® Inhalation Spray";
	public static final String SPIRIVA_PAGE_TITLE = "H2H Enrollment Form | Spiriva® Respimat® Inhalation Spray";
	
	public static final String HOME_PAGE_URL_FRACTION = "https://develop:bi!marketing@nginx-bihospital2home-com-develop.bi3.bi-oneweb.com/us/hospital2home/";
	public static final String STIOLTO_PAGE_URL_FRACTION = "https://develop:bi!marketing@nginx-bihospital2home-com-develop.bi3.bi-oneweb.com/us/hospital2home/stiolto-respimat-enrollment";
	public static final String SPIRIVA_PAGE_URL_FRACTION = "https://develop:bi!marketing@nginx-bihospital2home-com-develop.bi3.bi-oneweb.com/us/hospital2home/spiriva-respimat-enrollment";
	
	public static final int SHORT_DEFAULT_WAIT = 5;
	public static final int MEDIUM_DEFAULT_WAIT = 10;
	public static final int LONG_DEFAULT_WAIT = 20;
	
	public static final int POLLING_DEFAULT_WAIT = 2;
	public static final int ACCOUNTS_PAGE_HEADER_COUNT = 4;
	
	public static final List<String> ACCOUNT_PAGE_HEADER_LIST =
			Arrays.asList("My Account", "My Orders", "My Affiliate Account", "Newsletter");
	
	public static final String USER_REGISTER_SUCCESS_MESSG = "Your Account Has Been Created!";
	
	public static final String REGISTER_DATA_SHEET_NAME = "register";
	public static final String PRODUCT_DATA_SHEET_NAME = "product";

}