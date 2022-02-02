package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarvanaHelpMeSearchPage {

    public CarvanaHelpMeSearchPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h1")
    public WebElement whatCarHeading1;

    @FindBy(tagName = "h3")
    public WebElement carFinderHeading3;

    @FindBy(css = "a[data-qa='router-link']")
    public WebElement tryCarFinderLink;
}