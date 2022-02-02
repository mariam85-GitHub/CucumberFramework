package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarvanaGetYourOfferPage {

    public CarvanaGetYourOfferPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "div[class*='ErrorMessageContainer']")
    public WebElement vinNumberErrorMessage;
}