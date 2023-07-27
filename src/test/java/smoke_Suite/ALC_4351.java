package smoke_Suite;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utilities.BaseClass;
import alchemy_Pages.AlchemyLoginPage;
import alchemy_Pages.Branches;
import io.qameta.allure.Description;
import io.qameta.allure.testng.AllureTestNg;
import plastic_Bank_Pages.PB_LoginPage;

@Listeners({AllureTestNg.class})
public class ALC_4351 extends BaseClass {
	
	@Test(priority=0)
	@Description("Login Already added Branch")
	public void openRegisterdBranchInApp() throws InterruptedException {

		System.out.println("Login Already added Branch");
		
		PB_LoginPage pblogin = new PB_LoginPage(pbDriver);
		Thread.sleep(3000);
		pblogin.permission();
		pblogin.loginRandom(password);
		
	}

	@Test(priority=1)
	@Description("Edit Branch Details NAME")
	public void branchVerifyAndEdit() throws InterruptedException {
		
		System.out.println("Edit Branch Details Name");
		
		AlchemyLoginPage loginAlchmey=new AlchemyLoginPage(alcDriver);
		loginAlchmey.alc_adminlogin(adminphoneNumber,adminpassword);
		Branches alc_branch=new Branches(alcDriver);
		System.out.println("Member Phone number in suspend branch edit "+phoneNumber);
		alc_branch.editBranchNameDetails("+63"+randomPhoneNumber);
		Thread.sleep(2000);
	}

	
	
	@Test(priority =2) 
	@Description("Verify Edited Name in Mobile App")
	public void verifyEditInApp() throws InterruptedException {
		System.out.println("Verify Edited Name in Mobile App");
		
		PB_LoginPage pblogin = new PB_LoginPage(pbDriver);
		pblogin.logout();
		Thread.sleep(2000);
		pblogin.loginRandom(password);
		pblogin.nameVerify();
		pblogin.logout();
	}		
	
	@Test(priority=3)
	@Description("Suspending the Branch Account")
	public void suspendBranch() throws InterruptedException {
		
		System.out.println("Suspending the Branch Account");
		Branches alc_branch=new Branches(alcDriver);
		System.out.println("Member Phone number in suspend branch "+phoneNumber);
		alc_branch.suspendBranchAccount("+63"+randomPhoneNumber);
		
	}
	
	@Test(priority =4)
	@Description("Verify suspend Account in App")
	public void verifySuspendedAccount() {
		
	System.out.println("Verify suspend Account in App"); 
	PB_LoginPage lp =new PB_LoginPage(pbDriver);
	lp.loginRandom(password);
	lp.oK(); 
	}
	 
}