package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OtherIssuesWithSiginPage extends BasePage {
	
	public OtherIssuesWithSiginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//*[@id=\"cu-select-firstNode\"]")
	WebElement selectAnIssueDropdown;
	
	public void selectDropdown() {
		selectAnIssueDropdown.click();
	}

}
