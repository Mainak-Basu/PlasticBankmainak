package smoke_Suite;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utilities.BaseClass;
import Utilities.Data;
import Utilities.ScreenshotListener;
import alchemy_Pages.AlchemyLoginPage;
import alchemy_Pages.Branches;
import alchemy_Pages.Orders;
import io.qameta.allure.testng.AllureTestNg;
import plastic_Bank_Pages.PB_LoginPage;
import plastic_Bank_Pages.PB_Transaction;

@Listeners({AllureTestNg.class, ScreenshotListener.class})
public class ALC_4360 extends BaseClass{

	
	@Test(priority=0)
	public void run4360data() throws IOException {
		Data p= new Data();
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
        public void appSteps() throws InterruptedException, IOException {
        	      PB_LoginPage lo =new PB_LoginPage(pbDriver); 
        	      lo.login(Data.mnum4360, password); 
        	      PB_Transaction p=new PB_Transaction(pbDriver);
       			  p.verifyMemberBonusPresent(); 
       			  PB_LoginPage lo1 =new PB_LoginPage(pbDriver);
       			  lo1.login(Data.b1number4360, password); 
       			  PB_Transaction p1=new PB_Transaction(pbDriver); 
       			  p1.verifyBranch1BonusPresent(); 
       			  PB_LoginPage lo2 = new PB_LoginPage(pbDriver); 
       			  lo2.login(Data.b2number4360, password);
       			  PB_Transaction p2=new PB_Transaction(pbDriver);
       			  p2.verifyBranch2BonusPresent();                             
       			
       			  Orders o= new Orders(alcDriver);
                  o.buySellPresent();
}
	@Test(priority=3)
	public void disablebonus() throws InterruptedException {
		
		Branches b= new Branches(alcDriver);
		b.disablebonus();
		Orders o= new Orders(alcDriver);
		o.verifyBonusOrderSummaryAndApprovalSteps();
		PB_LoginPage lo =new PB_LoginPage(pbDriver);
		lo.login(Data.mnum4360, password);
        PB_Transaction p=new PB_Transaction(pbDriver);
        p.verifyMemberBonusNotPresent();
        PB_LoginPage lo1 =new PB_LoginPage(pbDriver);
        lo1.login(Data.b1number4360, password);
        PB_Transaction p1=new PB_Transaction(pbDriver);
        p1.verifyBranch1BonusNotPresent();
        PB_LoginPage lo2 =new PB_LoginPage(pbDriver);
        lo2.login(Data.b2number4360, password);
        PB_Transaction p2=new PB_Transaction(pbDriver);
        p2.verifyBranch2BonusNotPresent();
	}
	
	
}
