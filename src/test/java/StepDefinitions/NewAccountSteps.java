package StepDefinitions;

import PageObjects.OpenAccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class NewAccountSteps {

    OpenAccountPage openAccountPage = new OpenAccountPage();

    public NewAccountSteps() throws IOException {
    }

    @And("Click Open Account button")
    public void clickToOpenAccountButton() throws IOException {
        openAccountPage.findAndClick("newAcctBtn");
    }

    @And("Open new Savings account")
    public void openSavingsAccount() {
        openAccountPage.selectSavingsAndAccount();
    }

    @Then("savings account should be opened")
    public void savingsAccountShouldBeOpened() {
        openAccountPage.createAccountSavings();

    }

    @And("I verify that $ {string} is added to the newly created savings account and deducted from main account")
    public void selectSavingsAccount(String amount) throws IOException {
        openAccountPage.transferMoney(amount);
        openAccountPage.transactionSearchByAmount(amount);
    }

}
