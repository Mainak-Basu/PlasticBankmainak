package smoke_Suite;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utilities.BaseClass;
import Utilities.PostmanNewman;
import Utilities.ScreenshotListener;
import alchemy_Pages.AlchemyLoginPage;
import alchemy_Pages.Branches;
import io.qameta.allure.testng.AllureTestNg;
import plastic_Bank_Pages.PB_LoginPage;
import plastic_Bank_Pages.PB_Transaction;

@Listeners({AllureTestNg.class, ScreenshotListener.class})
public class ALC_4360 extends BaseClass{

	
	@Test(priority=0)
	public void run4360data() throws IOException {
		PostmanNewman p= new PostmanNewman();
		p.runonceFor_ALC_4360();
	}
	@Test(priority=1)
	public void alchemySteps() throws InterruptedException {
		AlchemyLoginPage loginAlchmey=new AlchemyLoginPage(alcDriver);
        loginAlchmey.alc_adminlogin(adminphoneNumber,adminpassword);
        Branches b= new Branches(alcDriver);
        b.verifykgrecycled();
        b.verifyDelayedBonus();
	}
	
        @Test(priority=2)
        public void appSteps() {
        PB_LoginPage lo =new PB_LoginPage(pbDriver);
		lo.login(PostmanNewman.mnum4360, password);
        PB_Transaction p=new PB_Transaction(pbDriver);
        p.verifyMemberBonusPresent();
        PB_LoginPage lo1 =new PB_LoginPage(pbDriver);
        lo1.login(PostmanNewman.b1number4360, password);
        PB_Transaction p1=new PB_Transaction(pbDriver);
        p1.verifyBranch1BonusPresent();
        PB_LoginPage lo2 =new PB_LoginPage(pbDriver);
        lo2.login(PostmanNewman.b2number4360, password);
        PB_Transaction p2=new PB_Transaction(pbDriver);
        p2.verifyBranch2BonusPresent();
}
	
	
	
}
