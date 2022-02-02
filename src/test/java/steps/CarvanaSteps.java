package steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.*;
import texts.*;
import utilities.Driver;

public class CarvanaSteps {

    WebDriver driver;
    Actions actions;
    Select select;
    CarvanaHomePage carvanaHomePage;
    CarvanaHelpMeSearchPage carvanaHelpMeSearchPage;
    CarvanaHelpMeSearchQaPage carvanaHelpMeSearchQaPage;
    CarvanaSellMYCarPage carvanaSellMYCarPage;
    CarvanaGetYourOfferPage carvanaGetYourOfferPage;
    CarvanaAutoLoanPage carvanaAutoLoanPage;

    @Before
    public void setUp(){
        driver = Driver.getDriver();
        actions = new Actions(driver);
        carvanaHomePage = new CarvanaHomePage(driver);
        carvanaHelpMeSearchPage = new CarvanaHelpMeSearchPage(driver);
        carvanaHelpMeSearchQaPage = new CarvanaHelpMeSearchQaPage(driver);
        carvanaSellMYCarPage = new CarvanaSellMYCarPage(driver);
        carvanaGetYourOfferPage = new CarvanaGetYourOfferPage(driver);
        carvanaAutoLoanPage = new CarvanaAutoLoanPage(driver);
    }

    @When("user clicks on {string} menu item")
    public void userClicksOnMenuItem(String menuItemButton){
        WebElement element;
        switch (menuItemButton){
            case ExpectedTextCarvanaHomePage.carFinderLinkHomePage:
                element = carvanaHomePage.carFinderLink;
                break;
            case ExpectedTextCarvanaHomePage.sellTradeLinkHomePage:
                element = carvanaHomePage.sellTradeLink;
                break;
            case ExpectedTextCarvanaHomePage.autoLoanHomePage:
                element = carvanaHomePage.autoLoanLink;
                break;
            default:
                throw new NotFoundException(menuItemButton + " Can Not Be Found!!");
        }
        element.click();
    }

    @Then("user should be navigated to {string}")
    public void userShouldBeNavigatedTo(String url) {
        Assert.assertEquals(url, driver.getCurrentUrl());
    }

    @And("user should see {string} text")
    public void userShouldSeeText(String text) {
        WebElement element;
        switch (text){
            case ExpectedTextCarvanaHelpMeSearchPage.whatCarMainHeading:
                element = carvanaHelpMeSearchPage.whatCarHeading1;
              break;
            case ExpectedTextCarvanaHelpMeSearchPage.carFinderHeading3:
               element = carvanaHelpMeSearchPage.carFinderHeading3;
                break;
            case ExpectedTextCarvanaHelpMeSearchQaPage.whatIsMostImportantDiv:
                element = carvanaHelpMeSearchQaPage.whatIsMostDivHeadLine;
                break;
            case ExpectedTextCarvanaHelpMeSearchQaPage.selectUpToDiv:
                element = carvanaHelpMeSearchQaPage.selectUpToDivSubHeading;
                break;
            case ExpectedTextCarvanaSellMyCarPage.getARealDiv:
                element = carvanaSellMYCarPage.getARealOfferDivMainHead;
                break;
            case ExpectedTextCarvanaSellMyCarPage.wePickUpDiv:
                element = carvanaSellMYCarPage.wePickDivSubHead;
                break;
            case ExpectedTextCarvanaGetYourOfferPage.weCouldNotFindMessageDiv:
                element = carvanaGetYourOfferPage.vinNumberErrorMessage;
                break;
            default:
                throw new NotFoundException(text + " Can NOT Be Found!!!");
        }
        Assert.assertEquals(text, element.getText());
        Assert.assertTrue(element.isDisplayed());
    }

    @And("user should see {string} link")
    public void userShouldSeeLink(String link) {
        Assert.assertEquals(link, ExpectedTextCarvanaHelpMeSearchPage.tryCarFinderLink);
        Assert.assertTrue(carvanaHelpMeSearchPage.tryCarFinderLink.isDisplayed());
    }

    @When("user clicks on {string} link")
    public void userClicksOnLink(String link) {
        carvanaHelpMeSearchPage.tryCarFinderLink.click();
    }

    @When("user clicks on {string} button")
    public void userClicksOnButton(String button) {
       WebElement element;
       switch (button){
           case ExpectedTextCarvanaSellMyCarPage.vin:
               element = carvanaSellMYCarPage.vinButton;
               break;
           case ExpectedTextCarvanaSellMyCarPage.getMyOfferText:
               element = carvanaSellMYCarPage.getMyOfferButton;
               break;
           default:
               throw new NotFoundException(button + " Can NOT be found!!");
       }
       element.click();
    }

    @And("user enters vin number as {string}")
    public void userEntersVinNumberAs(String vinNumber) {
        carvanaSellMYCarPage.vinInputNumber.sendKeys(ExpectedTextCarvanaSellMyCarPage.vinNumber);
    }

    @When("user hovers over on {string} menu item")
    public void userHoversOverOnMenuItem(String menuButton) {
        actions.moveToElement(carvanaHomePage.financingLink).perform();
    }

    @When("user enters {string} as {string}")
    public void userEntersAs(String str1, String str2) {
        WebElement element;
        switch (str1){
            case ExpectedTextCarvanaAutoLoanPage.costOfCarText:
                element = carvanaAutoLoanPage.costOfCarInput;
                break;
            case ExpectedTextCarvanaAutoLoanPage.downPaymentText:
                element = carvanaAutoLoanPage.downPaymentInput;
                break;
            default:
                throw new NotFoundException(str1 + " Can not be found!!");
        }
        element.sendKeys(str2);
    }

    @And("user selects {string} as {string}")
    public void userSelectsAs(String text, String inputText) {
        WebElement element;
        switch (text){
            case ExpectedTextCarvanaAutoLoanPage.creditScoreText:
                element = carvanaAutoLoanPage.creditCostInput;
                break;
            case ExpectedTextCarvanaAutoLoanPage.chooseLoanText:
                element = carvanaAutoLoanPage.chooseLoanInput;
                break;
            default:
                throw new NotFoundException(text + " = " + inputText + " can not be found!!");
        }
        select = new Select(element);
        select.selectByVisibleText(inputText);
    }

    @Then("user should see the monthly payment as {string}")
    public void userShouldSeeTheMonthlyPaymentAs(String str) {
        Assert.assertEquals(str, ExpectedTextCarvanaAutoLoanPage.autoLoanCalculatorText);
    }
}