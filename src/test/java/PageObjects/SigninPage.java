package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SigninPage extends BasePage {
	
	public SigninPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div/div[2]/div[2]/div[1]/form/div/div/div/div[3]/div/a/span")
	WebElement needHelpLink;
	
	@FindBy(xpath="//*[@id=\"ap-other-signin-issues-link\"]")
	WebElement otherIssuesWithSiginin;
	
	public void clickNeedHelpLink() {
		needHelpLink.click();
	}
	
	public void clickOtherIssuesWithSignIn() {
		otherIssuesWithSiginin.click();
	}
	
	
	
}
