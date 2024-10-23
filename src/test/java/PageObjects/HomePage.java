package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.reactivex.rxjava3.functions.Action;

public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]/span")
	WebElement siginMouseHover;
	
	@FindBy(xpath="/html/body/div[1]/header/div/div[3]/div[2]/div[2]/div/div[1]/div/a/span")
	WebElement siginButton;
	
	
	
	public void clickHelloSignIn() {
		siginMouseHover.click();
	}
	
	public void clickSignInButton() {
		siginButton.click();
	}
	
	
	
	
}
