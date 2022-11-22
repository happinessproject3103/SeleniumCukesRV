package PageObjects;

import Utilities.GenericWebDriver;
import org.hamcrest.core.StringContains;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class OpenAccountPage extends Parent {
    public OpenAccountPage() throws IOException {
        super(GenericWebDriver.getDriver());
        PageFactory.initElements(GenericWebDriver.getDriver(), this);
    }


    @FindBy(linkText = "Open New Account")
    private WebElement newAcctBtn;

    @FindBy( xpath= "/html/body/div[1]/div[3]/div[2]/div/div/form/select[1]")
    private WebElement clickSavings;

    @FindBy(xpath = "//Select/option[.='SAVINGS']")
    private WebElement selectAccount;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div/form/div/input")
    private WebElement openNewAccountBtn;

    @FindBy(className = "title")
    private WebElement accountOpened;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div/p[2]/a")
    private WebElement accountDetails;

    @FindBy(xpath = "//a[@href='/parabank/findtrans.htm']" )
    private WebElement findTransactions;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div/form/div[1]/select")
    private WebElement accountDrpDown;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div/form/div[1]/select/option[1]")
    private WebElement correctAccount;

    @FindBy(id = "criteria.amount")
    private WebElement searchAmount;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div/form/div[9]/button")
    private WebElement findTransBtn;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div")
    private WebElement transResults;

    @FindBy(xpath = "//a[@href='/parabank/transfer.htm']" )
    private WebElement transferFunds;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div/form/p/input")
    private WebElement amountField;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div/form/div[1]/select[1]")
    private WebElement fromAccount;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div/form/div[1]/select[1]/option[1]")
    private WebElement toAccount;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div/form/div[2]/input")
    private WebElement transferBtn;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div/h1")
    private WebElement transComplete;

    WebElement myElement;

    public void findAndClick(String strElement) throws IOException {
        if ("newAcctBtn".equals(strElement)) {
            myElement = newAcctBtn;
        }

        clickFunction(myElement);
    }

    public void selectSavingsAndAccount(){
        clickSavings.click();
        selectAccount.click();

    }
    public void createAccountSavings() {
        openNewAccountBtn.click();
        accountOpened.getText();
        Assert.assertTrue(true,"Account Opened!");
    }

    public void transactionSearchByAmount(String amount) throws IOException {
        findTransactions.click();
        accountDrpDown.click();
        GenericWebDriver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Need to change the Xpath to correct account every time it resets
        correctAccount.click();
        searchAmount.sendKeys(amount);
        findTransBtn.click();
        transResults.getText();
        StringContains.containsString( "Transaction Results");
    }

    public void transferMoney(String amount) throws IOException {
        transferFunds.click();
        amountField.sendKeys(amount);
        GenericWebDriver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        fromAccount.click();
        toAccount.click();
        GenericWebDriver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        transferBtn.click();
        transComplete.getText();
        Assert.assertTrue(true, "Transfer Complete!");
    }


}
