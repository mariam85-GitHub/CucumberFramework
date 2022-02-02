package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarvanaHelpMeSearchQaPage {

    public CarvanaHelpMeSearchQaPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "div[data-qa='headline']")
    public WebElement whatIsMostDivHeadLine;

    @FindBy(css = "div[data-qa='sub-heading']")
    public WebElement selectUpToDivSubHeading;
}