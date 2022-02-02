package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarvanaSellMYCarPage {

    public CarvanaSellMYCarPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    @FindBy(css = "div[role='heading']")
    public WebElement getARealOfferDivMainHead;

    @FindBy(xpath = "//div[@role='heading']/following-sibling::div")
    public WebElement wePickDivSubHead;

    @FindBy(css = "button[data-cv-test='VINToggle']")
    public WebElement vinButton;

    @FindBy(css = "input[class*='FormInput']")
    public WebElement vinInputNumber;

    @FindBy(css = "button[data-cv-test='heroGetMyOfferButton']")
    public WebElement getMyOfferButton;
}