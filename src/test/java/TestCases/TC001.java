package TestCases;

import PageObjects.HomePage;
import PageObjects.OtherIssuesWithSiginPage;
import PageObjects.SigninPage;

public class TC001 extends BaseClass{
	
	public void uverifyNeedHelpForgotPassword(){
		HomePage hp = new HomePage(driver);
		hp.clickHelloSignIn();
		
		SigninPage sp = new SigninPage(driver);
		sp.clickNeedHelpLink();
		
		OtherIssuesWithSiginPage oiwsp = new OtherIssuesWithSiginPage(driver);
		oiwsp.selectDropdown();
	}

}
