package Utilities;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.qameta.allure.Allure;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
	@BeforeSuite
	 public void dataCreation() throws IOException {
			
			PostmanNewman pn = new PostmanNewman();
			pn.runNewman(); 
			 
		  }

	public static String bonusName;
	public static String password ="123456a"; 

	public static String member_Name;
	public static String member_Number;

	public static String branch1_Name;
	public static String branch1_Number;

	public static String branch2_Name;
	public static String branch2_Number;

	public static String branch3_Name;
	public static String branch3_Number;

	public static String processor_Name;
	public static String processor_Number;






	public String memberBonus = "7";
	public String branchBonus = "2";

	public String hdpe_M_B1 = "10";
	public String pet_M_B1 = "9";
	public String kgdelivered = "19";///////// 76 -19
	public String kgpromised = "50,000";
	public String kgpending = "19";//////////// 76-19-0

	public String hdpe_B1_B2 = "8";
	public String pet_B1_B2 = "7";

	public String hdpe_B1_B3 = "6";
	public String pet_B1_B3 = "5";

	public String hdpe_B2_P = "4";
	public String pet_B2_P = "3";

	public String hdpe_B3_P = "1";
	public String pet_B3_P = "1";

	public String total_bonus_M_B1 = "133";
	public String hdpe_bonus_M_B1 = "70";
	public String pet_bonus_M_B1 = "63";
	public String hdpe_KG_M_B1 = "10";
	public String pet_KG_M_B1 = "9";

	public String total_bonus_B1_B2 = "30";
	public String hdpe_bonus_B1_B2 = "16";
	public String pet_bonus_B1_B2 = "14";
	public String hdpe_KG_B1_B2 = "8";
	public String pet_KG_B1_B2 = "7";

	public String total_bonus_B1_B3 = "8";
	public String hdpe_bonus_B1_B3 = "4";
	public String pet_bonus_B1_B3 = "4";
	public String hdpe_KG_B1_B3 = "6";
	public String pet_KG_B1_B3 = "5";

	public String total_bonus_B2_P = "14";
	public String hdpe_bonus_B2_P = "8";
	public String pet_bonus_B2_P = "6";
	public String hdpe_KG_B2_P = "4";
	public String pet_KG_B2_P = "3";

	public String total_bonus_B3_P = "4";
	public String hdpe_bonus_B3_P = "2";
	public String pet_bonus_B3_P = "2";
	public String hdpe_KG_B3_P = "1";
	public String pet_KG_B3_P = "1";

	public String alc_B1_ExngHisBonusVerify[] = { "8", "30", "133" };// B1-B3,B1-B2,M-B1
	public String alc_B2_ExngHisBonusVerify[] = { "14", "30" };// B2-P,B2-B1
	public String alc_B3_ExngHisBonusVerify[] = { "4", "8" };// B3-P,B3-B1
	public String alc_P_ExngHisBonusVerify[] = { "4", "14" };

	// HDPE Kg, PET Kg, Total Kg
	public String alc_M_B1_ExngHisKgVerify[] = { "10 KG", "9 KG", "19 KG" };
	public String alc_B1_B2_ExngHisKgVerify[] = { "8 KG", "7 KG", "15 KG" };
	public String alc_B1_B3_ExngHisKgVerify[] = { "6 KG", "5 KG", "11 KG" };
	public String alc_B2_P_ExngHisKgVerify[] = { "4 KG", "3 KG", "7 KG" };
	public String alc_B3_P_ExngHisKgVerify[] = { "1 KG", "1 KG", "2 KG" };

	public static WebDriver alcDriver;
	public static AndroidDriver pbDriver;

	
	  protected static String randomPhoneNumber;
	  protected static String randomBusinessName; 
	  protected static String randomBranchMemberPhoneNumber;
	  protected static String randomBranchMemberName;
	  
	  protected static String randomLastName;
	  
	 
	public String memberName;
	public String branchmemberName;
	public String phoneNumber;
	public String branchMemberphoneNumber;
	public String adminphoneNumber;
	public String adminpassword;
	public String branchName;

	@SuppressWarnings("deprecation")
	@BeforeClass

	public void setup() throws IOException {

		WebDriverManager.chromedriver().setup();
		alcDriver = new ChromeDriver();
		alcDriver.manage().window().maximize();
		alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		alcDriver.get("https://qa-admin.cognitionfoundry.io/#/login");

		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		caps.setCapability("newCommandTimeout", 9000);
		caps.setCapability("appPackage", "org.plasticbank.app");
		caps.setCapability("appActivity", "org.plasticbank.app.MainActivity");
		URL url = new URL("http://0.0.0.0:4723/wd/hub");

		pbDriver = new AndroidDriver(url, caps);
		
		
		  memberName = "Gayas"; 
		  branchmemberName = "Gayas " + randomBranchMemberName;
		  password= "123456a"; 
		  phoneNumber = "+63" + randomPhoneNumber;
		  branchMemberphoneNumber = "+63" + randomBranchMemberPhoneNumber;
		  
		  adminphoneNumber = "+919560071590"; 
		  adminpassword = "123456a"; 
		  branchName = randomBusinessName;
		 
	}

	
	
	  @BeforeSuite 
	  public void generateRandomNumber() { 
		  randomPhoneNumber =RandomStringUtils.randomNumeric(8); 
		  System.out.println("Member Number :+63" +randomPhoneNumber); }
	  
	  protected String getRandomPhoneNumber() {
		  
		  return randomPhoneNumber;
		  }
	  
	  @BeforeSuite 
	 
	
	  public void generateRandomLastName() {
		  
	  randomLastName = RandomStringUtils.randomAlphabetic(5);
	  System.out.println("Member Name : Gayas " + randomLastName); }
	  
	  protected String getRandomLastName() {
		  return randomLastName; 
		  }
	  
	  @BeforeSuite 
	  public void generateBranchMemberName() {
	  randomBranchMemberName = "Gayas " + RandomStringUtils.randomAlphabetic(5);
	  System.out.println("Branch Member Name :" + randomBranchMemberName);
	  }
	  
	  protected String getBranchMemberNumber() { 
	
		  return randomBranchMemberName; 
		  }
	  
	  @BeforeSuite public void generateRandomBranchMemberNumber() {
	  randomBranchMemberPhoneNumber = RandomStringUtils.randomNumeric(8);
	  System.out.println("Branch Member Number : +63" +
	  randomBranchMemberPhoneNumber); }
	  
	  protected String getRandomBranchMemberNumber() { 
		  return randomBranchMemberPhoneNumber; }
	  
	  @BeforeSuite 
	  public void generateBranchName() { 
		  randomBusinessName = "Gayas "+ RandomStringUtils.randomAlphabetic(5); 
		  System.out.println("Branch Name :" +randomBusinessName);
		  }
	  
	  protected String getBranchName() { 
		  return randomBusinessName; 
		  }

	@AfterMethod
	public void afterMethod(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			TakesScreenshot ts = (TakesScreenshot) alcDriver;
			byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
			Allure.addAttachment("Screenshot", new ByteArrayInputStream(screenshot));
			TakesScreenshot pb_ts = pbDriver;
			byte[] screenshot_pb = pb_ts.getScreenshotAs(OutputType.BYTES);
			Allure.addAttachment("Screenshot_pb", new ByteArrayInputStream(screenshot_pb));
		}
	}
	@AfterClass
	public void teardown() {

		try {
			pbDriver.quit();
			alcDriver.quit();
		}
		catch (NoSuchSessionException e){
			System.out.print("No such session exception call"+e.getMessage());
		}

	}


}
