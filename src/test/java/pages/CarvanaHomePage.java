package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarvanaHomePage {

    public CarvanaHomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "a[data-cv-test*='CarFinder']")
    public WebElement carFinderLink;

    @FindBy(css = "a[data-cv-test*='headerTradesLink']")
    public WebElement sellTradeLink;

    @FindBy(css = "div[data-cv-test='headerFinanceDropdown']")
    public WebElement financingLink;

    @FindBy(css = "a[data-cv-test='headerFinanceLoanCalc']")
    public WebElement autoLoanLink;
}