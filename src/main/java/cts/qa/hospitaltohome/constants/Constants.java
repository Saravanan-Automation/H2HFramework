package cts.qa.hospitaltohome.constants;

import java.util.Arrays;
import java.util.List;

public class Constants {
		
	public static final String PROFESSIONAL_BUTTON = "I am a healthcare professional in the US";
	
	public static final String HOME_PAGE_TITLE = "Enroll Your Patients with COPD | Hospital to Home";
	public static final String STIOLTO_PAGE_TITLE = "H2H Enrollment Form | Stiolto® Respimat® Inhalation Spray";
	public static final String SPIRIVA_PAGE_TITLE = "H2H Enrollment Form | Spiriva® Respimat® Inhalation Spray";
	public static final String BI_PAGE_TITLE = "Boehringer Ingelheim - Life Forward";
	
	
	public static final String HOME_PAGE_URL_FRACTION = "https://develop:bi!marketing@nginx-bihospital2home-com-develop.bi3.bi-oneweb.com/us/hospital2home/";
	public static final String STIOLTO_PAGE_URL_FRACTION = "https://develop:bi!marketing@nginx-bihospital2home-com-develop.bi3.bi-oneweb.com/us/hospital2home/stiolto-respimat-enrollment";
	public static final String SPIRIVA_PAGE_URL_FRACTION = "https://develop:bi!marketing@nginx-bihospital2home-com-develop.bi3.bi-oneweb.com/us/hospital2home/spiriva-respimat-enrollment";
	public static final String BI_PAGE_URL_FRACTION = "https://www.boehringer-ingelheim.com/us";
	
	
	//PDF LINKS
	
	//STIOLTO
	public static final String STIOLTO_PRESCRIBING_INFO_PDF = "https://content.boehringer-ingelheim.com/DAM/7fe8a4a7-9ed3-41ef-a565-af1e0120af14/stiolto%20respimat-us-pi.pdf";
	public static final String STIOLTO_PATIENT_INFO_PDF = "https://docs.boehringer-ingelheim.com/Prescribing%20Information/PIs/Stiolto%20Respimat/Patient%20Info/MedicationGuide.pdf?DMW_FORMAT=pdf";
	public static final String STIOLTO_INSTRUCTIONS_FOR_USE_PDF = "https://content.boehringer-ingelheim.com/DAM/7fe8a4a7-9ed3-41ef-a565-af1e0120af14/stiolto%20respimat-us-pi.pdf#page=18";
	
	
	//SPIRIVA
	public static final String SPIRIVA_PRESCRIBING_INFO_PDF = "https://content.boehringer-ingelheim.com/DAM/68a8a6b5-4e9a-4508-85d3-af1e01205009/spiriva%20respimat-us-pi.pdf";
	public static final String SPIRIVA_INSTRUCTIONS_FOR_USE_PDF = "https://content.boehringer-ingelheim.com/DAM/68a8a6b5-4e9a-4508-85d3-af1e01205009/spiriva%20respimat-us-pi.pdf#page=15";
	public static final String SPIRIVA_HANDIHALER_INFO_PDF = "https://content.boehringer-ingelheim.com/DAM/7e63d875-6ffb-407d-a561-af1e012045e5/spiriva%20handihaler-us-pi.pdf";
	public static final String SPIRIVA_HANDIHALER_PATIENT_INFO_PDF = "https://content.boehringer-ingelheim.com/DAM/7e63d875-6ffb-407d-a561-af1e012045e5/spiriva%20handihaler-us-pi.pdf#page=11";
	public static final String SPIRIVA_HANDIHALER_INSTRUCTIONS_FOR_USE_PDF = "https://content.boehringer-ingelheim.com/DAM/7e63d875-6ffb-407d-a561-af1e012045e5/spiriva%20handihaler-us-pi.pdf#page=15";
	

	public static final int SHORT_DEFAULT_WAIT = 5;
	public static final int MEDIUM_DEFAULT_WAIT = 10;
	public static final int LONG_DEFAULT_WAIT = 20;
	
	public static final int POLLING_DEFAULT_WAIT = 2;
	public static final int ACCOUNTS_PAGE_HEADER_COUNT = 4;
	

	public static final String PATIENT_REGISTER_SUCCESS_MESSG = "THANK YOU";
	
	public static final String PATIENT_REGISTER_DATA_SHEET_NAME = "SpirivaData";
	public static final String PRODUCT_DATA_SHEET_NAME = "product";
	
	
	public static final List<String> ACCOUNT_PAGE_HEADER_LIST =
			Arrays.asList("My Account", "My Orders", "My Affiliate Account", "Newsletter");

}