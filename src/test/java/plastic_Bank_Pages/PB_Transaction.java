package plastic_Bank_Pages;

import static org.testng.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import Utilities.BaseClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.qameta.allure.Allure;


public class PB_Transaction extends BaseClass{
	
public PB_Transaction(AndroidDriver pbDriver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(pbDriver), this);
	}
@AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Loading\")")
public WebElement loading;
@AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"lock-bonus\")")
public WebElement lock_bonus;
@AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Unlock Bonus\")")
public WebElement unlock_bonus;
@AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Delayed-Bonus\")")
public WebElement delayed_bonus;
@AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"pb-logo-bonus\")")
public WebElement pb_logo_bonus;
@AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"133\")")
public WebElement bonus133;
@AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"30\")")
public WebElement bonus30;
@AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"14\")")
public WebElement bonus14;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"DONATION\")")
public WebElement donation;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"arrow round-forward\")")
public WebElement donnationIn;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"arrow round-backward\")")
public WebElement donnationOut;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"Donation Accepted\")")
public WebElement donationaccepted;
@AndroidFindBy(uiAutomator= "new UiSelector().className(\"android.widget.EditText\").instance(0)")
public WebElement search;
@AndroidFindBy(uiAutomator="new UiSelector().className(\"android.view.View\").instance(31)")
public WebElement searchResult;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"checkmark\")")
public List<WebElement> checkmark;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"History\")")
public WebElement history;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"menu\")")
public WebElement menu;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"Logout\")")
public WebElement logout;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"Delayed bonus until approval\")")
public List<WebElement> transactions;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"Delayed bonus until approval\")")
public WebElement transaction;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"PET-Raw-Transparent\")")
public WebElement pet;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"0 (0)\")")
public WebElement noBonus;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"HDPE-Clean-Clear\")")
public WebElement hdpe;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"search outline\")")
public WebElement searchOutline;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"Add Picture\")")
public WebElement addPicture;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"Take a picture\")")
public WebElement takePicture;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"OK\")")
public WebElement ok;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"View History\")")
public WebElement viewHistory;
@AndroidFindBy(uiAutomator="new UiSelector().className(\"android.widget.EditText\").instance(0)")
public WebElement requiredQuantity;
@AndroidFindBy(xpath= "//android.widget.ImageButton[@content-desc=\"Done\"]")
public WebElement photoDone;
@AndroidFindBy(uiAutomator = "new UiSelector().textMatches(\"(?i)While using the app\")")
public WebElement permission;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Exchange History\")")
public WebElement exchangeHistory;
@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\")")
public List<WebElement>rewards;
@AndroidFindBy(uiAutomator = "new UiSelector().textMatches(\"(?i)Allow\")")
public WebElement allow;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"arrow back\")")
public WebElement arrowBack;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"All time\")")
public WebElement allTime;
@AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"₱\")")
public List<WebElement> prices;
@AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"133\")")
public WebElement approvedMemberBonus;
//member to b1
@AndroidFindBy(uiAutomator= "new UiSelector().text(\"133 Bonus\")")
public WebElement bonusToMember;
@AndroidFindBy(uiAutomator= "new UiSelector().text(\"19 KG\")")
public WebElement kgMemberToBranch1;
//b1 to b2
@AndroidFindBy(uiAutomator= "new UiSelector().text(\"30 Bonus\")")
public WebElement bonusToBranch1fromBranch2;
@AndroidFindBy(uiAutomator= "new UiSelector().text(\"15 KG\")")
public WebElement kgBranch1ToBranch2;
//b1 to b3
@AndroidFindBy(uiAutomator= "new UiSelector().text(\"8 Bonus\")")
public WebElement bonusToBranch1fromBranch3;
@AndroidFindBy(uiAutomator= "new UiSelector().text(\"11 KG\")")
public WebElement kgBranch1toBranch3;
//b2 to p
@AndroidFindBy(uiAutomator= "new UiSelector().text(\"14 Bonus\")")
public WebElement bonusTobranch2fromProcessor;
@AndroidFindBy(uiAutomator= "new UiSelector().text(\"7 KG\")")
public WebElement kgbranch2toProcessor;
//b3 to p
@AndroidFindBy(uiAutomator= "new UiSelector().text(\"4 Bonus\")")
public WebElement bonusTobranch3fromProcessor;
@AndroidFindBy(uiAutomator= "new UiSelector().text(\"2 KG\")")
public WebElement kgbranch3toProcessor;

@AndroidFindBy(uiAutomator="new UiSelector().textContains(\"rocess\")")
public WebElement processor;

@AndroidFindBy(uiAutomator="new UiSelector().textContains(\"133 = 72\")")
public WebElement bonusMemberVerify;

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"BONUS\")")
    public WebElement bonusText;
    @AndroidFindBy(uiAutomator="new UiSelector().text(\"OK\")")
    public WebElement okButton;
    @AndroidFindBy(uiAutomator="new UiSelector().text(\"HDPE-Clean-Clear\")")
    public WebElement hdpeMixed;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"History\")")
    public WebElement historyButton;
    @AndroidFindBy(uiAutomator="new UiSelector().text(\"seventhaug collector\")")
    public List<WebElement> M1MemberButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"Reward\")")
    public WebElement rewardText;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Direct Token Transfer\")")
    public WebElement directTokenTransferText;


 
WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(10));


public void verifyMemberBonusPresent() {
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.invisibilityOf(loading)));
	lock_bonus.isDisplayed();
	delayed_bonus.isDisplayed();
	pb_logo_bonus.isDisplayed();
	bonus133.isDisplayed();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(menu)));
	menu.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(logout)));
	logout.click();
}

public void verifyBranch1BonusPresent() {
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
	PointerInput fingerShutter = new PointerInput(PointerInput.Kind.TOUCH, "fingerShutter");
    Sequence scrollShutter = new Sequence(fingerShutter, 1);
    scrollShutter.addAction(fingerShutter.createPointerMove(Duration.ofMillis(0),
        PointerInput.Origin.viewport(), 400, 2060));
    scrollShutter.addAction(fingerShutter.createPointerDown(0));
    scrollShutter.addAction(fingerShutter.createPointerMove(Duration.ofMillis(100),
        PointerInput.Origin.viewport(), 400, 2060));
    scrollShutter.addAction(fingerShutter.createPointerUp(0));
    pbDriver.perform(Arrays.asList(scrollShutter));
	
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.invisibilityOf(loading)));
	lock_bonus.isDisplayed();
	unlock_bonus.isDisplayed();
	pb_logo_bonus.isDisplayed();
	bonus30.isDisplayed();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(menu)));
	menu.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(logout)));
	logout.click();
}

public void verifyBranch2BonusPresent() {
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
	PointerInput fingerShutter = new PointerInput(PointerInput.Kind.TOUCH, "fingerShutter");
    Sequence scrollShutter = new Sequence(fingerShutter, 1);
    scrollShutter.addAction(fingerShutter.createPointerMove(Duration.ofMillis(0),
        PointerInput.Origin.viewport(), 400, 2060));
    scrollShutter.addAction(fingerShutter.createPointerDown(0));
    scrollShutter.addAction(fingerShutter.createPointerMove(Duration.ofMillis(100),
        PointerInput.Origin.viewport(), 400, 2060));
    scrollShutter.addAction(fingerShutter.createPointerUp(0));
    pbDriver.perform(Arrays.asList(scrollShutter));
	
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.invisibilityOf(loading)));
	lock_bonus.isDisplayed();
	unlock_bonus.isDisplayed();
	pb_logo_bonus.isDisplayed();
	bonus14.isDisplayed();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(menu)));
	menu.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(logout)));
	logout.click();
}




public void doTransaction(String number, String load1, String load2) throws InterruptedException {
	
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
	search.sendKeys(number);
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
	searchOutline.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchResult)));
	searchResult.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
    checkmark.get(0).click();
    
    
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(pet)));
	pet.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
	requiredQuantity.sendKeys(load1);
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(1))));
    checkmark.get(1).click();
    
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(hdpe)));
    hdpe.click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
	requiredQuantity.sendKeys(load2);
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(1))));
    checkmark.get(1).click();
    
    
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
    checkmark.get(0).click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(addPicture)));
    addPicture.click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(takePicture)));
    takePicture.click();
    
    try {
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(permission)));
    	permission.click();
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(allow)));
        allow.click();
        Thread.sleep(5000);
        PointerInput fingerShutter = new PointerInput(PointerInput.Kind.TOUCH, "fingerShutter");
        Sequence scrollShutter = new Sequence(fingerShutter, 1);
        scrollShutter.addAction(fingerShutter.createPointerMove(Duration.ofMillis(0),
            PointerInput.Origin.viewport(), 545, 1930));
        scrollShutter.addAction(fingerShutter.createPointerDown(0));
        scrollShutter.addAction(fingerShutter.createPointerMove(Duration.ofMillis(100),
            PointerInput.Origin.viewport(), 545, 1930));
        scrollShutter.addAction(fingerShutter.createPointerUp(0));
        pbDriver.perform(Arrays.asList(scrollShutter));
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(photoDone)));
    	photoDone.click();
    	 wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
    				checkmark.get(0)))); checkmark.get(0).click();
    	
        }catch(Exception e) {
        	Thread.sleep(5000);
            PointerInput fingerShutter = new PointerInput(PointerInput.Kind.TOUCH, "fingerShutter");
            Sequence scrollShutter = new Sequence(fingerShutter, 1);
            scrollShutter.addAction(fingerShutter.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), 545, 1930));
            scrollShutter.addAction(fingerShutter.createPointerDown(0));
            scrollShutter.addAction(fingerShutter.createPointerMove(Duration.ofMillis(100),
                PointerInput.Origin.viewport(), 545, 1930));
            scrollShutter.addAction(fingerShutter.createPointerUp(0));
            pbDriver.perform(Arrays.asList(scrollShutter));
        	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(photoDone)));
        	photoDone.click();
        	 wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
        				checkmark.get(0)))); checkmark.get(0).click();
        	
        	
        }
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
    checkmark.get(0).click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
	checkmark.get(0)))); checkmark.get(0).click();
	 wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
				ok))); ok.click();
}


public void verifyMemberBonusAfterReceipt() {
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(menu))); 
	assertTrue(approvedMemberBonus.isDisplayed());
}




public void verifyProcessorExchangeHistory() throws InterruptedException {
	
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(menu))); 
    menu.click(); 
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(processor))); 
    processor.click(); 
    Thread.sleep(4000);
	PointerInput fingerglobe = new PointerInput(PointerInput.Kind.TOUCH, "fingerglobe");
    Sequence scrollglobe = new Sequence(fingerglobe, 1);
    scrollglobe.addAction(fingerglobe.createPointerMove(Duration.ofMillis(0),
        PointerInput.Origin.viewport(), 545, 2060));
    scrollglobe.addAction(fingerglobe.createPointerDown(0));
    scrollglobe.addAction(fingerglobe.createPointerMove(Duration.ofMillis(100),
        PointerInput.Origin.viewport(), 545, 2060));
    scrollglobe.addAction(fingerglobe.createPointerUp(0));
    pbDriver.perform(Arrays.asList(scrollglobe));
    
    
    Thread.sleep(4000);
   	PointerInput fingerscroll = new PointerInput(PointerInput.Kind.TOUCH, "fingerscroll");
       Sequence scrollscroll = new Sequence(fingerscroll, 1);
       scrollscroll.addAction(fingerscroll.createPointerMove(Duration.ofMillis(0),
           PointerInput.Origin.viewport(), 545, 1900));
       scrollscroll.addAction(fingerscroll.createPointerDown(0));
       scrollscroll.addAction(fingerscroll.createPointerMove(Duration.ofMillis(100),
           PointerInput.Origin.viewport(), 545, 200));
       scrollscroll.addAction(fingerscroll.createPointerUp(0));
       pbDriver.perform(Arrays.asList(scrollscroll));
       
       
       wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(viewHistory))); 
       viewHistory.click(); 
       
       wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(allTime))); 
    String firstPrice = prices.get(0).getText();
       String secondPrice = prices.get(1).getText();
    Assert.assertEquals(firstPrice, "   ");
    Assert.assertEquals(secondPrice, "   ");
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(arrowBack))); 
    arrowBack.click(); 
  
}


public void m1toB1(String m1number) throws InterruptedException {
	
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
	search.sendKeys(m1number);
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
	searchOutline.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchResult)));
	searchResult.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
    checkmark.get(0).click();
    
    
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(hdpe)));
	hdpe.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
	requiredQuantity.sendKeys("10");
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(1))));
    checkmark.get(1).click();
    
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(pet)));
    pet.click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
	requiredQuantity.sendKeys("9");
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(1))));
    checkmark.get(1).click();
    
    Thread.sleep(2000);
    TakesScreenshot ts1 = (TakesScreenshot) pbDriver;
    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
    Thread.sleep(2000);
    
    assertTrue(bonusToMember.isDisplayed());
    assertTrue(kgMemberToBranch1.isDisplayed());
   
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
    checkmark.get(0).click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(addPicture)));
    addPicture.click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(takePicture)));
    takePicture.click();
    
    try {
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(permission)));
    	permission.click();
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(allow)));
        allow.click();
        Thread.sleep(5000);
        PointerInput fingerShutter = new PointerInput(PointerInput.Kind.TOUCH, "fingerShutter");
        Sequence scrollShutter = new Sequence(fingerShutter, 1);
        scrollShutter.addAction(fingerShutter.createPointerMove(Duration.ofMillis(0),
            PointerInput.Origin.viewport(), 545, 1930));
        scrollShutter.addAction(fingerShutter.createPointerDown(0));
        scrollShutter.addAction(fingerShutter.createPointerMove(Duration.ofMillis(100),
            PointerInput.Origin.viewport(), 545, 1930));
        scrollShutter.addAction(fingerShutter.createPointerUp(0));
        pbDriver.perform(Arrays.asList(scrollShutter));
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(photoDone)));
    	photoDone.click();
    	 wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
    				checkmark.get(0)))); checkmark.get(0).click();
    	
        }catch(Exception e) {
        	Thread.sleep(5000);
            PointerInput fingerShutter = new PointerInput(PointerInput.Kind.TOUCH, "fingerShutter");
            Sequence scrollShutter = new Sequence(fingerShutter, 1);
            scrollShutter.addAction(fingerShutter.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), 545, 1930));
            scrollShutter.addAction(fingerShutter.createPointerDown(0));
            scrollShutter.addAction(fingerShutter.createPointerMove(Duration.ofMillis(100),
                PointerInput.Origin.viewport(), 545, 1930));
            scrollShutter.addAction(fingerShutter.createPointerUp(0));
            pbDriver.perform(Arrays.asList(scrollShutter));
        	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(photoDone)));
        	photoDone.click();
        	 wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
        				checkmark.get(0)))); checkmark.get(0).click();
       }
    
    Thread.sleep(2000);
    TakesScreenshot ts3 = (TakesScreenshot) pbDriver;
    byte[] screenshot3 = ts3.getScreenshotAs(OutputType.BYTES);
    Allure.addAttachment("Screenshot3", new ByteArrayInputStream(screenshot3));
    Thread.sleep(2000);
    assertTrue(bonusToMember.isDisplayed());
    assertTrue(kgMemberToBranch1.isDisplayed());
    
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
    checkmark.get(0).click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
	checkmark.get(0)))); checkmark.get(0).click();
	 wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
				ok))); ok.click();
				
				Thread.sleep(7000);
	            PointerInput fingerMemberTab = new PointerInput(PointerInput.Kind.TOUCH, "fingerMemberTab");
	            Sequence scrollMemberTab = new Sequence(fingerMemberTab, 1);
	            scrollMemberTab.addAction(fingerMemberTab.createPointerMove(Duration.ofMillis(0),
	                PointerInput.Origin.viewport(), 408, 2122));
	            scrollMemberTab.addAction(fingerMemberTab.createPointerDown(0));
	            scrollMemberTab.addAction(fingerMemberTab.createPointerMove(Duration.ofMillis(100),
	                PointerInput.Origin.viewport(), 408, 2122));
	            scrollMemberTab.addAction(fingerMemberTab.createPointerUp(0));	
	            pbDriver.perform(Arrays.asList(scrollMemberTab));
	            
	            wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(history)));
	            history.click();
	            wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(transaction)));
	            assertTrue(transaction.isDisplayed());
	            wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(arrowBack)));
	            arrowBack.click();
	            wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(noBonus)));
	            assertTrue(noBonus.isDisplayed());
				
	            Thread.sleep(2000);
	            TakesScreenshot ts2 = (TakesScreenshot) pbDriver;
	            byte[] screenshot2 = ts2.getScreenshotAs(OutputType.BYTES);
	            Allure.addAttachment("Screenshot2", new ByteArrayInputStream(screenshot2));
	            Thread.sleep(2000);
}


public void b1toB2(String b1number) throws InterruptedException {
	
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
	search.sendKeys(b1number);
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
	searchOutline.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchResult)));
	searchResult.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
    checkmark.get(0).click();
    
    
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(hdpe)));
	hdpe.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
	requiredQuantity.sendKeys("8");
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(1))));
    checkmark.get(1).click();
    
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(pet)));
    pet.click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
	requiredQuantity.sendKeys("7");
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(1))));
    checkmark.get(1).click();
    Thread.sleep(2000);
    TakesScreenshot ts1 = (TakesScreenshot) pbDriver;
    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
    Thread.sleep(2000);
    assertTrue(bonusToBranch1fromBranch2.isDisplayed());
    assertTrue(kgBranch1ToBranch2.isDisplayed());
    
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
    checkmark.get(0).click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(addPicture)));
    addPicture.click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(takePicture)));
    takePicture.click();
    
    try {
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(permission)));
    	permission.click();
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(allow)));
        allow.click();
        Thread.sleep(5000);
        PointerInput fingerShutter = new PointerInput(PointerInput.Kind.TOUCH, "fingerShutter");
        Sequence scrollShutter = new Sequence(fingerShutter, 1);
        scrollShutter.addAction(fingerShutter.createPointerMove(Duration.ofMillis(0),
            PointerInput.Origin.viewport(), 545, 1930));
        scrollShutter.addAction(fingerShutter.createPointerDown(0));
        scrollShutter.addAction(fingerShutter.createPointerMove(Duration.ofMillis(100),
            PointerInput.Origin.viewport(), 545, 1930));
        scrollShutter.addAction(fingerShutter.createPointerUp(0));
        pbDriver.perform(Arrays.asList(scrollShutter));
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(photoDone)));
    	photoDone.click();
    	 wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
    				checkmark.get(0)))); checkmark.get(0).click();
    	
        }catch(Exception e) {
        	Thread.sleep(5000);
            PointerInput fingerShutter = new PointerInput(PointerInput.Kind.TOUCH, "fingerShutter");
            Sequence scrollShutter = new Sequence(fingerShutter, 1);
            scrollShutter.addAction(fingerShutter.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), 545, 1930));
            scrollShutter.addAction(fingerShutter.createPointerDown(0));
            scrollShutter.addAction(fingerShutter.createPointerMove(Duration.ofMillis(100),
                PointerInput.Origin.viewport(), 545, 1930));
            scrollShutter.addAction(fingerShutter.createPointerUp(0));
            pbDriver.perform(Arrays.asList(scrollShutter));
        	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(photoDone)));
        	photoDone.click();
        	 wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
        				checkmark.get(0)))); checkmark.get(0).click();
        	
        	
        }
    Thread.sleep(2000);
    TakesScreenshot ts2 = (TakesScreenshot) pbDriver;
    byte[] screenshot2 = ts2.getScreenshotAs(OutputType.BYTES);
    Allure.addAttachment("Screenshot2", new ByteArrayInputStream(screenshot2));
    Thread.sleep(2000);
    assertTrue(bonusToBranch1fromBranch2.isDisplayed());
    assertTrue(kgBranch1ToBranch2.isDisplayed());
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
    checkmark.get(0).click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
	checkmark.get(0)))); checkmark.get(0).click();
	 wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
				ok))); ok.click();
}

public void b1toB3(String b1number) throws InterruptedException {
	
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
	search.sendKeys(b1number);
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
	searchOutline.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchResult)));
	searchResult.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
    checkmark.get(0).click();
    
    
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(hdpe)));
	hdpe.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
	requiredQuantity.sendKeys("6");
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(1))));
    checkmark.get(1).click();
    
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(pet)));
    pet.click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
	requiredQuantity.sendKeys("5");
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(1))));
    checkmark.get(1).click();
    Thread.sleep(2000);
    TakesScreenshot ts1 = (TakesScreenshot) pbDriver;
    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
    Thread.sleep(2000);
    assertTrue(bonusToBranch1fromBranch3.isDisplayed());
    assertTrue(kgBranch1toBranch3.isDisplayed());
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
    checkmark.get(0).click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(addPicture)));
    addPicture.click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(takePicture)));
    takePicture.click();
    
    try {
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(permission)));
    	permission.click();
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(allow)));
        allow.click();
        Thread.sleep(5000);
        PointerInput fingerShutter = new PointerInput(PointerInput.Kind.TOUCH, "fingerShutter");
        Sequence scrollShutter = new Sequence(fingerShutter, 1);
        scrollShutter.addAction(fingerShutter.createPointerMove(Duration.ofMillis(0),
            PointerInput.Origin.viewport(), 545, 1930));
        scrollShutter.addAction(fingerShutter.createPointerDown(0));
        scrollShutter.addAction(fingerShutter.createPointerMove(Duration.ofMillis(100),
            PointerInput.Origin.viewport(), 545, 1930));
        scrollShutter.addAction(fingerShutter.createPointerUp(0));
        pbDriver.perform(Arrays.asList(scrollShutter));
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(photoDone)));
    	photoDone.click();
    	 wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
    				checkmark.get(0)))); checkmark.get(0).click();
    	
        }catch(Exception e) {
        	Thread.sleep(5000);
            PointerInput fingerShutter = new PointerInput(PointerInput.Kind.TOUCH, "fingerShutter");
            Sequence scrollShutter = new Sequence(fingerShutter, 1);
            scrollShutter.addAction(fingerShutter.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), 545, 1930));
            scrollShutter.addAction(fingerShutter.createPointerDown(0));
            scrollShutter.addAction(fingerShutter.createPointerMove(Duration.ofMillis(100),
                PointerInput.Origin.viewport(), 545, 1930));
            scrollShutter.addAction(fingerShutter.createPointerUp(0));
            pbDriver.perform(Arrays.asList(scrollShutter));
        	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(photoDone)));
        	photoDone.click();
        	 wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
        				checkmark.get(0)))); checkmark.get(0).click();
        	
        	
        }
    Thread.sleep(2000);
    TakesScreenshot ts2 = (TakesScreenshot) pbDriver;
    byte[] screenshot2 = ts2.getScreenshotAs(OutputType.BYTES);
    Allure.addAttachment("Screenshot2", new ByteArrayInputStream(screenshot2));
    Thread.sleep(2000);
    assertTrue(bonusToBranch1fromBranch3.isDisplayed());
    assertTrue(kgBranch1toBranch3.isDisplayed());
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
    checkmark.get(0).click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
	checkmark.get(0)))); checkmark.get(0).click();
	 wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
				ok))); ok.click();
}

public void b3ToP(String b3number) throws InterruptedException {
	Thread.sleep(4000);
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(menu))); 
	menu.click();
    Thread.sleep(2000);
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(processor))); 
	processor.click(); 
	Thread.sleep(4000);
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
	search.sendKeys(b3number);
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
	searchOutline.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchResult)));
	searchResult.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
    checkmark.get(0).click();
    
    
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(hdpe)));
	hdpe.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
	requiredQuantity.sendKeys("1");
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(1))));
    checkmark.get(1).click();
    
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(pet)));
    pet.click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
	requiredQuantity.sendKeys("1");
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(1))));
    checkmark.get(1).click();
    Thread.sleep(2000);
    TakesScreenshot ts1 = (TakesScreenshot) pbDriver;
    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
    Thread.sleep(2000);
    assertTrue(bonusTobranch3fromProcessor.isDisplayed());
    assertTrue(kgbranch3toProcessor.isDisplayed());
    
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
    checkmark.get(0).click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(addPicture)));
    addPicture.click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(takePicture)));
    takePicture.click();
    
    try {
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(permission)));
    	permission.click();
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(allow)));
        allow.click();
        Thread.sleep(5000);
        PointerInput fingerShutter = new PointerInput(PointerInput.Kind.TOUCH, "fingerShutter");
        Sequence scrollShutter = new Sequence(fingerShutter, 1);
        scrollShutter.addAction(fingerShutter.createPointerMove(Duration.ofMillis(0),
            PointerInput.Origin.viewport(), 545, 1930));
        scrollShutter.addAction(fingerShutter.createPointerDown(0));
        scrollShutter.addAction(fingerShutter.createPointerMove(Duration.ofMillis(100),
            PointerInput.Origin.viewport(), 545, 1930));
        scrollShutter.addAction(fingerShutter.createPointerUp(0));
        pbDriver.perform(Arrays.asList(scrollShutter));
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(photoDone)));
    	photoDone.click();
    	 wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
    				checkmark.get(0)))); checkmark.get(0).click();
    	
        }catch(Exception e) {
        	Thread.sleep(5000);
            PointerInput fingerShutter = new PointerInput(PointerInput.Kind.TOUCH, "fingerShutter");
            Sequence scrollShutter = new Sequence(fingerShutter, 1);
            scrollShutter.addAction(fingerShutter.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), 545, 1930));
            scrollShutter.addAction(fingerShutter.createPointerDown(0));
            scrollShutter.addAction(fingerShutter.createPointerMove(Duration.ofMillis(100),
                PointerInput.Origin.viewport(), 545, 1930));
            scrollShutter.addAction(fingerShutter.createPointerUp(0));
            pbDriver.perform(Arrays.asList(scrollShutter));
        	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(photoDone)));
        	photoDone.click();
        	 wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
        				checkmark.get(0)))); checkmark.get(0).click();
        	
        	
        }
    Thread.sleep(2000);
    TakesScreenshot ts2 = (TakesScreenshot) pbDriver;
    byte[] screenshot2 = ts2.getScreenshotAs(OutputType.BYTES);
    Allure.addAttachment("Screenshot2", new ByteArrayInputStream(screenshot2));
    Thread.sleep(2000);
    assertTrue(bonusTobranch3fromProcessor.isDisplayed());
    assertTrue(kgbranch3toProcessor.isDisplayed());
    
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
    checkmark.get(0).click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
	checkmark.get(0)))); checkmark.get(0).click();
	 wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
				ok))); ok.click();
}

public void b2ToP(String b2number) throws InterruptedException {
	Thread.sleep(4000);
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(menu))); 
	menu.click();
    Thread.sleep(2000);
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(processor))); 
	processor.click(); 
	Thread.sleep(4000);
	
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
	search.sendKeys(b2number);
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
	searchOutline.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchResult)));
	searchResult.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
    checkmark.get(0).click();
    
    
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(hdpe)));
	hdpe.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
	requiredQuantity.sendKeys("4");
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(1))));
    checkmark.get(1).click();
    
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(pet)));
    pet.click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
	requiredQuantity.sendKeys("3");
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(1))));
    checkmark.get(1).click();
    Thread.sleep(2000);
    TakesScreenshot ts1 = (TakesScreenshot) pbDriver;
    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
    Thread.sleep(2000);
    assertTrue(bonusTobranch2fromProcessor.isDisplayed());
    assertTrue(kgbranch2toProcessor.isDisplayed());
    
    
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
    checkmark.get(0).click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(addPicture)));
    addPicture.click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(takePicture)));
    takePicture.click();
    
    try {
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(permission)));
    	permission.click();
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(allow)));
        allow.click();
        Thread.sleep(5000);
        PointerInput fingerShutter = new PointerInput(PointerInput.Kind.TOUCH, "fingerShutter");
        Sequence scrollShutter = new Sequence(fingerShutter, 1);
        scrollShutter.addAction(fingerShutter.createPointerMove(Duration.ofMillis(0),
            PointerInput.Origin.viewport(), 545, 1930));
        scrollShutter.addAction(fingerShutter.createPointerDown(0));
        scrollShutter.addAction(fingerShutter.createPointerMove(Duration.ofMillis(100),
            PointerInput.Origin.viewport(), 545, 1930));
        scrollShutter.addAction(fingerShutter.createPointerUp(0));
        pbDriver.perform(Arrays.asList(scrollShutter));
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(photoDone)));
    	photoDone.click();
    	 wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
    				checkmark.get(0)))); checkmark.get(0).click();
    	
        }catch(Exception e) {
        	Thread.sleep(5000);
            PointerInput fingerShutter = new PointerInput(PointerInput.Kind.TOUCH, "fingerShutter");
            Sequence scrollShutter = new Sequence(fingerShutter, 1);
            scrollShutter.addAction(fingerShutter.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), 545, 1930));
            scrollShutter.addAction(fingerShutter.createPointerDown(0));
            scrollShutter.addAction(fingerShutter.createPointerMove(Duration.ofMillis(100),
                PointerInput.Origin.viewport(), 545, 1930));
            scrollShutter.addAction(fingerShutter.createPointerUp(0));
            pbDriver.perform(Arrays.asList(scrollShutter));
        	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(photoDone)));
        	photoDone.click();
        	 wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
        				checkmark.get(0)))); checkmark.get(0).click();
        	
        	
        }
    Thread.sleep(2000);
    TakesScreenshot ts2 = (TakesScreenshot) pbDriver;
    byte[] screenshot2 = ts2.getScreenshotAs(OutputType.BYTES);
    Allure.addAttachment("Screenshot2", new ByteArrayInputStream(screenshot2));
    Thread.sleep(2000);
    assertTrue(bonusTobranch2fromProcessor.isDisplayed());
    assertTrue(kgbranch2toProcessor.isDisplayed());
    
    
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
    checkmark.get(0).click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
	checkmark.get(0)))); checkmark.get(0).click();
	 wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
				ok))); ok.click();
}
public void CheckMemberBonus() throws InterruptedException {
	PB_LoginPage lo =new  PB_LoginPage(pbDriver);
	lo.login(member_Number, password);
	Thread.sleep(3000);
	Assert.assertTrue(bonusMemberVerify.isDisplayed());
	
	Thread.sleep(2000);
    TakesScreenshot ts2 = (TakesScreenshot) pbDriver;
    byte[] screenshot2 = ts2.getScreenshotAs(OutputType.BYTES);
    Allure.addAttachment("Screenshot2", new ByteArrayInputStream(screenshot2));
    Thread.sleep(2000);
}
    public boolean transactionBranchStopBonus(String number, String load) throws InterruptedException {

        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
        search.sendKeys(number);
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
        searchOutline.click();
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchResult)));
        searchResult.click();
        Thread.sleep(5000);
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
        checkmark.get(0).click();

        boolean bounus_text = false;
        try {
            // Code that might throw an exception
            bounus_text = bonusText.isDisplayed();
            if (bounus_text == true) {

            }


        } catch (Exception e) {


        }
//        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(bonusText)));
//        assertEquals(bonusText.getText(), "BONUS");

        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(hdpeMixed)));
        hdpeMixed.click();


        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
        requiredQuantity.sendKeys(load);
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(1))));
        checkmark.get(1).click();
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
        checkmark.get(0).click();



        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
        checkmark.get(0).click();
        Thread.sleep(2000);
        checkmark.get(0).click();
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(okButton)));
        okButton.click();
        return bounus_text;

    }

    public boolean verifyHistoryStopBonusReward() throws InterruptedException {

        Thread.sleep(5000);
        PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        Sequence scrolla = new Sequence(finger1, 1);
        scrolla.addAction(finger1.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(),400 ,2122));
        scrolla.addAction(finger1.createPointerDown(0));
        scrolla.addAction(finger1.createPointerMove(Duration.ofMillis(100),
                PointerInput.Origin.viewport(),400 ,2122));
        scrolla.addAction(finger1.createPointerUp(0));
        pbDriver.perform(Arrays.asList(scrolla));

        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(historyButton)));
        historyButton.click();
        Thread.sleep(5000);
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(M1MemberButton.get(0))));
        M1MemberButton.get(0).click();
        boolean reward_text = false;
        try {
            // Code that might throw an exception
            reward_text = rewardText.isDisplayed();
            if (reward_text== true) {
                System.out.println("Element is not visible on the screen.");

            }

        } catch (Exception e) {
            // Generic catch block to handle any other exceptions
            System.out.println("Bonus is disabled for new member"+ e);

        }
        return reward_text;
    }

    public boolean verifyExchangeHistoryToken() throws InterruptedException {
        PointerInput fingerScroll = new PointerInput(PointerInput.Kind.TOUCH, "fingerScroll");
        Sequence scrollUP = new Sequence(fingerScroll, 1);
        scrollUP.addAction(fingerScroll.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), 545, 1930));
        scrollUP.addAction(fingerScroll.createPointerDown(0));
        scrollUP.addAction(fingerScroll.createPointerMove(Duration.ofMillis(100),
                PointerInput.Origin.viewport(), 545, 200));
        scrollUP.addAction(fingerScroll.createPointerUp(0));
        pbDriver.perform(Arrays.asList(scrollUP));
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(exchangeHistory)));
        exchangeHistory.click();
        Thread.sleep(7000);
        return directTokenTransferText.isDisplayed();

    }
    
    
    
    public void memberToBranchDonation(String number) {
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
    	search.sendKeys(number);
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
    	searchOutline.click();
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchResult)));
    	searchResult.click();
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
        checkmark.get(0).click();
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(donation)));
    	donation.click();
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
    	requiredQuantity.sendKeys("100");
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(1))));
        checkmark.get(1).click();
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
        checkmark.get(0).click();
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
        checkmark.get(0).click();
     

    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(ok)));
        assertTrue(donationaccepted.isDisplayed());
        TakesScreenshot ts2 = (TakesScreenshot) pbDriver;
        byte[] screenshot2 = ts2.getScreenshotAs(OutputType.BYTES);
        Allure.addAttachment("donation accepted screenshot", new ByteArrayInputStream(screenshot2));
    	ok.click();
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.invisibilityOf(loading)));
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(menu)));
    	menu.click();
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(logout)));
    	logout.click();
    }

    public void branchToProcessorDonation(String number) {
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.invisibilityOf(loading)));
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(menu)));
    	  menu.click();
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(processor)));
    	  processor.click();
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
    	search.sendKeys(number);
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
    	searchOutline.click();
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchResult)));
    	searchResult.click();
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
        checkmark.get(0).click();
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(donation)));
    	donation.click();
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
    	requiredQuantity.sendKeys("100");
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(1))));
        checkmark.get(1).click();
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
        checkmark.get(0).click();
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
        checkmark.get(0).click();
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(ok)));
        assertTrue(donationaccepted.isDisplayed());
        TakesScreenshot ts2 = (TakesScreenshot) pbDriver;
        byte[] screenshot2 = ts2.getScreenshotAs(OutputType.BYTES);
        Allure.addAttachment("donation accepted screenshot", new ByteArrayInputStream(screenshot2));
    	ok.click();
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.invisibilityOf(loading)));
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(menu)));
    	menu.click();
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(logout)));
    	logout.click();
    }
    
    
    public void verifyNoBonusForDonation(){
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
        PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        Sequence scrolla = new Sequence(finger1, 1);
        scrolla.addAction(finger1.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(),400 ,2122));
        scrolla.addAction(finger1.createPointerDown(0));
        scrolla.addAction(finger1.createPointerMove(Duration.ofMillis(100),
                PointerInput.Origin.viewport(),400 ,2122));
        scrolla.addAction(finger1.createPointerUp(0));
        pbDriver.perform(Arrays.asList(scrolla));
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.invisibilityOf(loading)));
         assertTrue(noBonus.isDisplayed());
         
         TakesScreenshot ts2 = (TakesScreenshot) pbDriver;
         byte[] screenshot2 = ts2.getScreenshotAs(OutputType.BYTES);
         Allure.addAttachment("No bonus screenshot", new ByteArrayInputStream(screenshot2));
    }
    
    
    
    
}
