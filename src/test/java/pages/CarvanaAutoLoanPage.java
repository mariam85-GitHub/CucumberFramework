package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarvanaAutoLoanPage {

    public CarvanaAutoLoanPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name='vehiclePrice']")
    public WebElement costOfCarInput ;

    @FindBy(xpath = "//input[@name='downPayment']")
    public WebElement downPaymentInput ;

    @FindBy(id = "creditBlock")
    public WebElement creditCostInput;

    @FindBy(xpath = "(//select[@class='form-control'])[2]")
    public WebElement chooseLoanInput;

}